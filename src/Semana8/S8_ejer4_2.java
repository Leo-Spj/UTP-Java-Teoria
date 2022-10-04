package Semana8;

import java.util.Scanner;

public class S8_ejer4_2 {
    /*programa que simule el lanzamiento de una moneda las N veces que el
    usuario desee, posteriormente hará un recuento de las veces que ha salido
     tanto cara como sello */
    public static int aleatorio (int n){
        int cont_cara = 0, c;

        for(int i=0; i<=n; i++){
            c = (int) (Math.random() * 2);

            if(c == 0){ //cuando es CARA
                cont_cara += 1;
            }
        }
        return cont_cara;
    }

    public static void main(String[] args){
        int N, caras, sellos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese numero de lanzamientos: ");
        N = teclado.nextInt();

        //aleatorizando:
        caras = aleatorio(N);
        sellos = N - caras;

        System.out.println("caras: " + caras);
        System.out.println("sellos: " + sellos);
    }
}
