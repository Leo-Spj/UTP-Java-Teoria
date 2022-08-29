package Semana3;

import java.util.Scanner;

//ingrese un numero entero y determine si es multiplo de 10.

public class S3_teoria_ejercicio2 {
    public static void main(String[] args) {

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num = teclado.nextInt();

        if (num % 10 == 0) {
            System.out.println("El numero es multiplo de 10");

        } else {
            System.out.println("El numero no es multiplo de 10");
        }
    }
}
