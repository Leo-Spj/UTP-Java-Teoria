package PC2;

/*Desarrolle una función que reciba como parámetro un arreglo:
Use while
La función debe llenar el arreglo con valores entre 10 y 80
Retornar el arreglo lleno.
*/
import java.util.Arrays;
import java.util.Scanner;

public class ejer_3 {
    public static void main(String[] args) {
        int n;
        Scanner teclado =new Scanner(System.in);

        System.out.println("ingrese la cantidad de números que desea");
        n= teclado.nextInt();

        int[] serie = Arreglo(n);
        System.out.println(Arrays.toString(serie));
    }
    public static int[] Arreglo(int n){
        int [] serie = new int[n];
        int i=0;
        while(i<n){
            serie[i] = (int)(Math.random()*(80-10+1)+10);
            i++;
        }
        return serie;
    }
}
