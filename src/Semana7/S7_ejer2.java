package Semana7;

import java.util.Scanner;

//calcula la suma de numeros ingresados por teclado. termina cuando se ingresa 0
public class S7_ejer2 {
    public static void main(String[] args) {
        int numero, suma;
        suma = 0;
        numero = 1;

        while (numero != 0) {
            System.out.println("Ingrese un numero: ");
            numero = new java.util.Scanner(System.in).nextInt();
            suma += numero;
        }
        System.out.println("La suma es: " + suma);
    }
}
