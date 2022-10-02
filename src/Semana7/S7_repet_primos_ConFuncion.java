package Semana7;

import java.util.Scanner;

public class S7_repet_primos_ConFuncion {
    public static int esPrimo(int numero){
        int num,cont=0;

        num=2;
        while ( num < numero){
            if (numero % num == 0 )
                cont++;
            num++;
        }
        return cont;
    }
    public static void main(String[] args) {
        int numero, cont;
        String msg;

        Scanner scan=new Scanner(System.in);
        System.out.print("ingrese un numero ");
        numero=scan.nextInt();

        cont = esPrimo(numero);

        if(cont== 0)
            msg="Numero Primo";
        else msg = "Numero NO primo";
        System.out.println(msg);
    }


}
