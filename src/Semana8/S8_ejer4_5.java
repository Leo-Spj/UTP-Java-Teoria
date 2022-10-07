package Semana8;
/* diseñe un programa que imprima la serie de fibonacci hasta el numero ingresado.
la suma de los dos elementos anteriores genera el siguiente elemento.
 */

import java.util.Scanner;

public class S8_ejer4_5 {
    public static void main(String[] args) {
        int a=0, b=1, c=0, suma=0, n;
        String cadena="0"+"\t";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos de la serie de fibonacci");
        n = teclado.nextInt();

        suma = a + b;
        for(int i=1; i<n; i++){
            cadena += suma + "\t";

            suma = a +b;

            a=b;
            b=suma;
        }
        System.out.println(cadena);
    }

}
