import UD7.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonasMain {
    static ArrayList<Personas> myPeople = new ArrayList<>();
    static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vamos a realizar una lista de Alumnos y Profesores");
        addIntoList();
        System.out.println("\n--------------------");
        printTeachers();
        System.out.println("\n--------------------");
        printStudents();
    }

    private static void addIntoList() {
        boolean repeat = true;
        int select = 0;

        do{
            select = numberControl("�Deseas introducir un Alumno (Pulsa 1), un Profesor (Pulsa 2) o deseas terminar (Pulsa 0)?: ", "Debes introducir un n�mero para escoger la selecci�n.");
            if (select < 0 || select > 2) {
                System.out.println("Debes introducir una de las opciones disponibles.");
            } else {
                if (select == 1) {
                    addPerson("alumno");
                } else if (select == 2){
                    addPerson("profesor");
                } else {
                    repeat = false;
                }
            }
        } while(repeat);
    }

    private static void addPerson(String personType) {
        String nombre = addNombre(personType);
        String DNI = addDNI(personType);
        String fechaNacimiento = addFechaNacimiento (personType);

        if (personType.equals("alumno")){
            myPeople.add(new Alumnos(nombre, DNI, fechaNacimiento));
            addAlumInfo((Alumnos) myPeople.get(myPeople.size()-1));
        } else if (personType.equals("profesor")){
            selectTeacherType(nombre, DNI, fechaNacimiento);
        }
    }

    private static void selectTeacherType(String nombre, String DNI, String fechaNacimiento){
        String selectTutor = "";
        do {
            System.out.print("�El profesor que vas a introducir es un Tutor/a? \"Si\" o \"No\": ");
            selectTutor = keyb.nextLine().toUpperCase().trim();
            if (!selectTutor.matches("SI|NO")) {
                System.out.println("Debes introducir \"Si\" o \"No\".");
                selectTutor = "repeat";
            } else {
                if (selectTutor.equals("SI")){
                    myPeople.add(new Tutores(nombre, DNI, fechaNacimiento));
                    addGrupo((Tutores) myPeople.get(myPeople.size()-1));
                } else {
                    myPeople.add(new Profesores(nombre, DNI, fechaNacimiento));
                }
                addTeacherInfo((Profesores) myPeople.get(myPeople.size()-1));
            }
        } while (selectTutor.equals("repeat"));
    }

    private static String addNombre(String personType) {
        String nombre = "";
        do {
            System.out.print("Introduce el nombre del " + personType + " (con las iniciales may�sculas): ");
            nombre = keyb.nextLine().trim();
            if (!nombre.matches("([A-Z�][a-z�]+)(\\s[A-Z�][a-z�]+)*")) {
                System.out.println("Debes introducir el nombre cona ls iniciales may�sculas y separados por un solo espacio.");
                nombre = "repeat";
            }
        } while (nombre.equals("repeat"));
        return nombre;
   }

    private static String addDNI(String personType) {
        String dni = "";
        do {
            System.out.print("Introduce el DNI del " + personType + ": ");
            dni = keyb.nextLine().toUpperCase().trim();
            if (!dni.matches("\\d{8}[A-Z]")) {
                System.out.println("Debes introducir el DNI correctamente (12345678A).");
                dni = "repeat";
            }
        } while (dni.equals("repeat"));
        return dni;
    }

    private static String addFechaNacimiento(String personType) {
        String fechaNacimiento = "";
        Pattern date = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher dateMatch;
        do {
            System.out.print("Introduce el la Fecha de Nacimiento del " + personType + " (Formato dd/mm/aaaa): ");
            fechaNacimiento = keyb.nextLine().toUpperCase().trim();
            dateMatch = date.matcher(fechaNacimiento);
            //TODO Todo el if
            if (!dateMatch.matches() || !isCorrectDate(Integer.parseInt(dateMatch.group(1)), Integer.parseInt(dateMatch.group(2)), Integer.parseInt(dateMatch.group(3)))) {
                System.out.println("Debes introducir una fecha correcta y en el Formato dd/mm/aaaa: ");
                fechaNacimiento = "repeat";
            }
        } while (fechaNacimiento.equals("repeat"));

        return fechaNacimiento;
    }

    private static boolean isCorrectDate(int dias, int meses, int anios) {
        if(dias<=0 || meses<=0 || meses>12 || anios<=0) {
            return false;
        }

        switch (meses) {
            case 4:
            case 6:
            case 9:
            case 11:
                if(dias>30) {
                    return false;
                }
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dias>31) {
                    return false;
                }
                break;

            case 2:
                if((isBisiesto(anios) && dias>29) ||(!isBisiesto(anios) && dias>28)) {
                    return false;
                }
        }
        return true;
    }

    private static boolean isBisiesto(int anios) {
        return ((anios % 4 == 0 && anios % 100 != 0) || (anios % 400 == 0 && anios % 100 == 0));
    }

    private static void addGrupo(Tutores tutores){
        System.out.print("�Cual es el grupo de tutor�a del Profesor? (Ejemplo 1� DAM): ");
        tutores.setGrupo(keyb.nextLine());
    }

    private static void addTeacherInfo(Profesores profesor) {
        profesor.setIdef(addNRP());      
        profesor.setEspecialidad(addEspecialidad());
        profesor.setCentroDestino(addCentroDestino());
        profesor.setSalario(addSueldo());
    }

    private static String addNRP() {
        int NRP = 0;
        do {
            NRP = numberControl("Introduce el NRP del Profesor: ", "Debes introducir el NRP como un n�mero entero.");
            if (NRP<100000 || NRP>999999) {
                System.out.println("Debes introducir un NRP de seis d�gitos.");
                NRP=-1;
            }
        } while (NRP == -1);
        return Integer.toString(NRP);
        //Para poder usar sin problemas la interface Acceso se ha modificado NRP para que sea String
    }

    private static int addEspecialidad() {
        int especialidad = 0;
        do {
            especialidad = numberControl("Introduce el c�digo de Especialidad del Profesor: ", "Debes introducir la Especialidad como un n�mero entero.");
            if (especialidad<100 || especialidad>999) {
                System.out.println("Debes introducir un c�digo de tres d�gitos.");
                especialidad=-1;
            }
        } while (especialidad == -1);
        return especialidad;
    }

    private static String addCentroDestino() {
        String centro = "";
        System.out.print("Introduce el nombre del Centro de destino: ");
        centro = keyb.nextLine();
        return centro;
    }

    private static double addSueldo(){
        double sueldo = 0;
        do {
            try{
                System.out.print("Introduce el salario base que cobra el Profesor (Si es tutor se le aplicar� el complemento): ");
                sueldo = keyb.nextDouble();
                keyb.nextLine();
                if (sueldo < 1000) {
                    System.out.println("El salario m�nimo aplicable es de 1000.0 euros.");
                    sueldo = -1;
                }
            } catch (InputMismatchException e) {
                sueldo = -1;
                keyb.nextLine();
                System.out.println("Debes introducir un numero con o sin decimales.");
            }
        } while (sueldo == -1);
        return sueldo;
    }

    private static void addAlumInfo(Alumnos alumno) {
        alumno.setIdef(addCIAL());
        alumno.setCiclo(addCiclo());
    }

    private static String addCIAL() {
        String cial = "";
        do {
            System.out.print("Introduce el CIAL del alumno: ");
            cial = keyb.nextLine().toUpperCase();
            if (cial.length() != 10) {
                System.out.println("El CIAL debe introducise como un c�digo alfanum�rico de 10 caracteres.");
                cial = "repeat";
            }
        } while (cial.equals("repeat"));
        return cial;
    }

    private static String addCiclo() {
        String ciclo = "";
        System.out.print("Introduce el nombre del Ciclo que cursa el alumno: ");
        ciclo = keyb.nextLine();
        return ciclo;
    }

    private static int numberControl(String message, String errorMessage) {
        int select = 0;
        do {
            System.out.print(message);
            try {
                select = keyb.nextInt();
                keyb.nextLine();
            } catch (InputMismatchException e) {
                keyb.nextLine();
                System.out.println(errorMessage);

                select = -1;
            }
        } while (select == -1);
        return select;
    }

    public static void printTeachers() {
        System.out.println("Los Profesores introducidos son:");
        for (Personas person: myPeople) {
            if (person instanceof Profesores) {
                System.out.print("--> Nombre: " + person.getNombre() + ", DNI: " + person.getDNI() + ", Edad: "
                        + person.getEdad() + ", NRP: " + person.getIdef() + ", Especialidad: "
                        + ((Profesores) person).getEspecialidad() + ", Centro de Destino: "
                        + ((Profesores) person).getCentroDestino() + ", Salario con complementos aplicados: "
                        + ((Profesores) person).getSueldo() + " euros.");
                if (person instanceof Tutores) {
                    System.out.println(" Este Profesor/a es Tutor/a de " + ((Tutores) person).getGrupo() + ".");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void printStudents() {
        System.out.println("Los Alumnos introducidos son:");
        for (Personas person: myPeople) {
            if (person instanceof Alumnos) {
                System.out.println("--> Nombre: " + person.getNombre() + ", DNI: " + person.getDNI() + ", Edad: "
                        + person.getEdad() + ", CIAL: " + person.getIdef() + ", Ciclo cursado: " +
                        ((Alumnos) person).getCiclo() + ".");
            }
        }
    }
}

