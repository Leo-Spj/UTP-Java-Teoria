package PC2;

/*
Desarrolle una función que reciba como parámetro un numero N:
Use while
Generar la serie numérica de N elementos y sumar sus elementos: 1/2 + 2/3 + 3/4 + 4/5+ ...+(n-1)/n
Retornar la suma de sus elementos.
*/
import java.util.Scanner;

public class ejer_2 {
    public static void main(String[] args) {
        int n;
        Scanner teclado =new Scanner(System.in);

        System.out.println("ingrese la cantidad de números que desea");
        n= teclado.nextInt();

        double suma = serie(n);
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
    public static double serie(int n){
        double suma=0;
        int i=1;
        while(i<=n){
            suma += (double)i/(i+1);
            i++;
        }
        return suma;
    }

}
