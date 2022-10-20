package PC2;

/*
Desarrolle una función que reciba como parámetro un número N:
Generar la serie numérica de N elementos de la siguiente forma: 0-1-3-6-10-15- ….
Retornar la serie y la suma de sus elementos
*/
import java.util.Arrays;
import java.util.Scanner;

public class ejer_1 {
    public static void main(String[] args) {
        int n;
        Scanner teclado =new Scanner (System.in);
        System.out.println("ingrese la cantidad de números que desea");
        n= teclado.nextInt();
        int[] serie = Arreglo(n);

        int suma = 0;
        for (int i = 0; i < serie.length; i++) {
            suma += serie[i];
        }

        System.out.println(Arrays.toString(serie));
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
    public static int[] Arreglo(int n){
        int [] serie = new int[n];
        int suma=0, j=0;

        for(int i=0; i<n;i++){
            suma += i;
            serie[j]=suma;
            j++;
        }
        return serie;
    }
}
