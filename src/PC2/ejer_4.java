package PC2;

/*
Desarrollar un programa que genere un arreglo de N valores enteros,
realice lo siguiente:

a.- Desarrollar una función que llene los elementos del arreglo con valores
aleatorios del N1 al N2, teniendo en cuenta que no debe llenar el último
elemento del arreglo  (3 puntos)

b.- Desarrollar una función que obtenga el promedio de los valores pares del arreglo
 (de los elementos generados) y guardar la parte entera del promedio en el último
  elemento del arreglo. (3 puntos)
*/

import java.util.Arrays;
import java.util.Scanner;

public class ejer_4 {
    public static void main(String[] args) {
        int n, n1, n2;
        Scanner teclado =new Scanner(System.in);

        System.out.println("ingrese la cantidad de números que desea");
        n= teclado.nextInt();

        System.out.println("ingrese el primer número");
        n1= teclado.nextInt();
        System.out.println("ingrese el segundo número");
        n2= teclado.nextInt();

        int[] serie = prom(n, n1, n2);
        System.out.println(Arrays.toString(serie));
    }

    public static int[] arreglo(int n, int n1, int n2){
        int [] arreglo = new int[n];
        int i=0;
        while(i<n-1){
            arreglo[i] = (int)(Math.random()*(n2-n1+1)+n1);
            i++;
        }
        return arreglo;
    }
    public static int[] prom(int n, int n1, int n2){
        int[] prom = arreglo(n, n1, n2);
        int suma=0, j=0, cantidad_pares=0;
        while(j<n-1){
            if(prom[j]%2==0){
                suma += prom[j];
                cantidad_pares++;
            }
            j++;
        }
        prom[n-1] = suma/cantidad_pares;
        return prom;
    }
}
