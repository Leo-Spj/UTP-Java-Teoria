package Semana7;

import java.util.Scanner;

public class S7_procesosRepetitivos_DO_WHILE {
    public static void main(String[] args) {
        String sigue = "";
        double sueldo = 0, acumulado;
        int contador;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Desea participa en encuesta: ");
        sigue = teclado.next();
        sigue = sigue.toLowerCase();


        contador = 0;
        acumulado = 0;
        sueldo = 0;
        do {
            contador++; //: contador = contador +1

            System.out.println("Cual es su sueldo?");
            sueldo = teclado.nextDouble();
            acumulado += sueldo; //: acumulado = acumulado + sueldo

            System.out.println("Desea participa en encuesta: ");
            sigue = teclado.next();
            sigue = sigue.toLowerCase();
        } while (sigue.equals("si"));


        System.out.println("el promedio de sueldos es: " + acumulado * 1.0 / contador);
    }
}
