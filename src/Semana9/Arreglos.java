package Semana9;

import java.util.Arrays;

public class Arreglos {
    public static int[] llenaArreglo(int arr[]){
        int indMax=arr.length-1;

        for(int i=0; i<=indMax;i++){
            arr[i]=(int)(Math.random()*(60-5+1)+5);
        }

        return arr;
    }
    public static void main(String[] args) {
        int a[] = new int[7];
        String m[] = new String[5];
        int b[]={7,4,9,1};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(b));
        System.out.println(a.length);
        System.out.println(a.length-1);
        a= llenaArreglo(a);
        System.out.println(Arrays.toString(a));
    }

}
