package Semana8;

import java.util.Scanner;

public class S8_ejer4_1 {

    public static String serie(int n){
        int suma = 0;
        String cadena = "";

        for (int i =1; i<=n; i++){
            if(i%2 != 0){      //para numeros inpares
                cadena += i + "-";
            }else{
                cadena += i + "+";
            }
        }
        return cadena;
    }
    public static int  suma(int n){
        int suma = 0;

        for (int i =1; i<=n; i++){
            if(i%2 != 0){
                suma += i;
            }else{
                suma -= i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int N, suma;
        String serie;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad terminos: ");
        N = teclado.nextInt();

        serie = serie(N);
            System.out.println(serie);
        suma = suma(N);
            System.out.println(suma);
    }
}
