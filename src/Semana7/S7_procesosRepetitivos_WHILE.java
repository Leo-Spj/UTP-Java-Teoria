package Semana7;

import java.util.Scanner;

/*
* Escriba un código que pregunte repetitivamente si va a participar en una encuesta, tras responder si
* solicite el sueldo del trabajador. Cuando la respuesta sea no, muestre el promedio de sueldos registrados.
* */
public class S7_procesosRepetitivos_WHILE {
    public static void main(String[] args) {
        String sigue;
        double sueldo, acumulado;
        int contador;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Desea participa en encuesta: ");
        sigue = teclado.next();
        sigue = sigue.toLowerCase();


        contador = 0;
        acumulado = 0;
        sueldo = 0;
        while (sigue.equals("si")){
            contador++; //: contador = contador +1

            System.out.println("Cual es su sueldo?");
            sueldo = teclado.nextDouble();
            acumulado += sueldo; //: acumulado = acumulado + sueldo

            System.out.println("Desea participa en encuesta: ");
            sigue = teclado.next();
            sigue = sigue.toLowerCase();
        }
        if (contador > 0){
            System.out.println("el promedio de sueldos es: " + acumulado*1.0/contador);
        } else {
            System.out.println ("Promedio: " + 0);
        }

    }
}
