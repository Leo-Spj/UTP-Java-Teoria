package Semana7;

import java.util.Scanner;



public class S7_piramide {


    public static void main(String[] args){
        int numero, num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese numero: ");
        numero = teclado.nextInt();

        while(numero > 0){
           System.out.println(numero);
           num = numero/10;
           numero = num;
        };

    }
}
