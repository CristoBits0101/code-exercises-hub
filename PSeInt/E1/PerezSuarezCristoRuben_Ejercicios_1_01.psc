Proceso Ejercicios_1_01
	//"Pedir 5 n�meros y calcular la suma".
	
	// Paso 1) Declaro 5 variables para que al inicio de la ejecuci�n del programa el usuario me introduzca 5 datos.
	// Paso 1.1) Declaro una variable adicional para recoger la suma con el operador + de los 5 d�gitos introducidos.
	// "Estos datos ser�n definidos de tipo real dado que una suma puede contener decimales".
	Definir num1, num2, num3, num4, num5, suma Como Real;
	
	//Paso 2) Solicito al usuario que me introduzca 5 cantidades para poder operar con ellos.
	Escribir ("Introduzca las cinco cantidades que desea sumar:");
	Leer num1, num2, num3, num4, num5;
	
	//Paso 3) Procedo a hacer la suma de los d�gitos introducidos para que el usuario pueda obtener un resultado de salida.
	suma <- num1 + num2 + num3 + num4 + num5;
	
	//Paso 4) Al ser un programa que solo suma 5 n�meros cuando el usuario termine de introducir los datos le daremos un resultado.
	Escribir ("El resultado de la suma es: "), suma;
	
	//"Este algoritmo es de tipo secuencial as� que los datos se ejecutaran por l�nea respetando el orden de ejecuci�n".
	
FinProceso