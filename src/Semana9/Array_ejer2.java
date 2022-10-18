package Semana9;

import java.util.Arrays;

public class Array_ejer2 {
    public static String muestraArreglo(int arr[]){
        int indMax=arr.length-1; String cadena="";
        for(int i=0; i<=indMax;i++){
            cadena = cadena+arr[i]+"\t";
        }
        return cadena;
    }
    public static int sumaArreglo(int arr[]){
        int indMax=arr.length-1; int suma=0;
        for(int i=0; i<=indMax;i++){
            suma = suma + arr[i];
        }
        return suma;
    }
    public static double calculaPromedio(int a[]){
        double promedio=sumaArreglo(a)*1.0/a.length;
        return promedio;
    }
    public static int hallaMayor(int arr[]){
        int indMax=arr.length-1;
        int mayor=arr[0];
        for(int i=0; i<=indMax;i++){
            if(arr[i]> mayor)
                mayor = arr[i];
        }
        return mayor;
    }
    public static int hallaMenor(int arr[]){
        int indMax=arr.length;
        int menor=arr[0];
        for(int i=0; i<indMax;i++){
            if(arr[i]< menor)
                menor = arr[i];
        }
        return menor;
    }

    public static void main(String[] args) {
        int a[]={4,12,3,10,23,22,18,9};
        System.out.println(Arrays.toString(a));
        System.out.println(muestraArreglo(a));
        System.out.println("Suma "+sumaArreglo(a));
        System.out.println("Promedio "+calculaPromedio(a));
        System.out.println("Mayor "+hallaMayor(a));
        System.out.println("Menor "+hallaMenor(a));
    }

}
