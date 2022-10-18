package zemana10;

import java.util.Scanner;

public class ejer1 {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.print( "Ingrese N: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        double rpta=pares(arr);
        System.out.println("\n el promedio es: "+rpta);
    }
    public static double pares(int[] arreglito){
        int x=8;
        double acum=0;
        for (int i=0;i<arreglito.length;i++){
            arreglito[i]=x;
            System.out.print(arreglito[i]+" ");
            acum+=arreglito[i];
            x+=2;

        }
        return acum/arreglito.length;
    }


}