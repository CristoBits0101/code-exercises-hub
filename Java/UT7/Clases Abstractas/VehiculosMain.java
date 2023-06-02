import UD7.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehiculosMain {
    static ArrayList<Vehiculos> myVehicles = new ArrayList<>();
    static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {
        addVehicles();
        printTurismos();
        printMotos();
        printGuaguas();
    }

    private static void addVehicles() {
        int select = 0;
        do {
            select = numberControl("�Deseas introducir alg�n veh�culo? Seleccione: Turismo [1], Moto [2], Guagua [3], Salir [0]: ", "Debes escoger la selecci�n con un n�mero.", "Debes introducir una de las opciones disponibles", 0, 3);
            if (select == 1) {
                addTurismo();
            } else if (select == 2) {
                addMoto();
            } else if (select == 3){
                addGuagua();
            }
        }while (select != 0);
    }

    private static void introdVehicleData(Vehiculos vehiculo, String vehicleType) {
         vehiculo.setMatricula(stringControl("Introduce la matr�cula de" + vehicleType + ": ", "Debes introducir los 7 d�gitos de la matr�cula en may�sculas", "[\\dA-Z]{7}"));
         vehiculo.setChasis(stringControl("Introduce el n�mero de Chasis de" + vehicleType + ": ", "Debes introducir los 17 caracteres del chasis en may�sculas.", "[\\dA-HJ-NPR-Z]{17}"));
         vehiculo.setMarca(stringControl("Introduce la marca de" + vehicleType + ": ", "Debes introducir la marca con la inicial may�scula.", "[A-Z][a-z]+"));
         vehiculo.setDNIPropietario(stringControl("Introduce el DNI del propietario de" + vehicleType + ": ", "Debes introducir los 8 digitos y la letra may�scula del DNI.", "\\d{8}[A-Z]"));
         vehiculo.setYearMatriculacion(numberControl("Introduce el a�o de matriculaci�n de" + vehicleType + ": ", "Debes introducir el a�o de matriculaci�n como un n�mero entero.", "El a�o m�nimo de matriculaci�n es 1900 y el m�ximo el a�o actual, vuelvelo a introducir.", 1900, LocalDate.now().getYear()));
    }

    private static void addTurismo() {
        myVehicles.add(new Turismos());
        introdVehicleData(myVehicles.get(myVehicles.size()-1), "l Turismo");
        ((Turismos)myVehicles.get(myVehicles.size()-1)).setNumPuertas(numberControl("Introduzca el n�mero de puertas del turismo: ", "Debe introducir en n�mero de puertas mediante un n�mero entero", "El n�mero de puertas de un Turismo es m�nimo 1 y m�ximo 5", 1, 5));
        ((Turismos)myVehicles.get(myVehicles.size()-1)).setHasRemolque(addRemolque());
        ((Turismos)myVehicles.get(myVehicles.size()-1)).setNumPlazas(numberControl("Introduzca el n�mero de plazas del Turismo: ", "Debe introducir el n�mero de plazas como un n�mero entero", "El n�mero de plazas de un turismo es m�nimo 1 y m�ximo 8", 1, 8));
    }

    private static boolean addRemolque() {
        int control = numberControl("�Su Turismo tiene capacidad para a�adir Remolque u otro tipo de cargar externa? Si [1], No [2]: ", "Debe introducir la selecci�n mediante un n�mero entero", "Debe introducir una de las opciones disponibles", 1, 2);
        if (control == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static void addMoto() {
        myVehicles.add(new Motos());
        introdVehicleData(myVehicles.get(myVehicles.size()-1), " la Moto");
    }

    private static void addGuagua() {
        myVehicles.add(new Guaguas());
        introdVehicleData(myVehicles.get(myVehicles.size()-1), " la Guagua");
        ((Guaguas)myVehicles.get(myVehicles.size()-1)).setNumPlazas(numberControl("Introduzca el n�mero de plazas de la Guagua: ", "Debe introducir el n�mero de plazas como un n�mero entero", "El n�mero de plazas de una Guagua es m�nimo 1 y m�ximo 90", 1, 90));
        ((Guaguas)myVehicles.get(myVehicles.size()-1)).setTipoServicio(stringControl("Introduzca el tipo de Servicio de esta Guagua ('Publico', 'Escolar' o 'Discrecional'): ", "Debes introducir una de las opciones que disponibles con inicial may�scula.", "(Publico|Escolar|Discrecional)"));
    }

    private static int numberControl(String message, String errorMessage, String controlMessage, int min, int max) {
        int select = 0;
        do {
            System.out.print(message);
            try {
                select = keyb.nextInt();
                keyb.nextLine();

                if (select < min || select > max) {
                    System.out.println(controlMessage);
                    select = -1;
                }
            } catch (InputMismatchException e) {
                keyb.nextLine();
                System.out.println(errorMessage);

                select = -1;
            }
        } while (select == -1);
        return select;
    }

    private static String stringControl (String message, String errorMessage, String regex) {
        String res = "";
        do {
            System.out.print(message);
            res = keyb.nextLine();

            if (!res.matches(regex)) {
                System.out.println(errorMessage);
                res = "repeat";
            }
        } while (res.equals("repeat"));
        return res;
    }

    private static String printGeneralData(Vehiculos vehicle) {
        return " con Matr�cula: " + vehicle.getMatricula() + ", N� de Bastidor: " + vehicle.getChasis() + ", Marca: "
                + vehicle.getMarca() + ", DNI del Pripietario: " + vehicle.getDNIPropietario()
                + ", Fecha de Matriculaci�n: " + vehicle.getYearMatriculacion();
    }

    private static void printTurismos() {
        String res = "";
        System.out.println("\n--------------------\nTurismos Registrados:");
        for (Vehiculos vehicle: myVehicles) {
            if (vehicle instanceof Turismos) {
                res = "--> Turismo" + printGeneralData(vehicle) + ", " + ((Turismos)vehicle).getNumPuertas() + " puertas, " + ((Turismos)vehicle).getNumPlazas() + " plazas y ";
                if (((Turismos)vehicle).hasRemolque()) {
                    res += "tiene capacidad de Carga y/o Remolque. ";
                } else {
                    res += "no tiene capacidad de Carga y/o Remolque. ";
                }
                res += vehicle.getITV();
                System.out.println(res);
                res = "";
            }
        }
    }

    private static void printMotos() {
        System.out.println("\n--------------------\nMotos Registradas:");
        for (Vehiculos vehicle: myVehicles) {
            if (vehicle instanceof Motos) {
                System.out.println("--> Moto" + printGeneralData(vehicle) + ". " + vehicle.getITV());
            }
        }
    }

    private static void printGuaguas() {
        System.out.println("\n--------------------\nGuaguas Registradas:");
        for (Vehiculos vehicle: myVehicles) {
            if (vehicle instanceof Guaguas) {
                System.out.println("--> Guagua" + printGeneralData(vehicle) + ", " + ((Guaguas)vehicle).getNumPlazas()
                        + " plazas y es para Transporte " + ((Guaguas)vehicle).getTipoServicio() + ". "
                        + vehicle.getITV());
            }
        }
    }
}