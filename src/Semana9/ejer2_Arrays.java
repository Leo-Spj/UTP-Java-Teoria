package Semana9;

import java.util.Arrays;

/*
Desarrolle un programa que almacene números aleatorios en un arreglo.
Mostar los números del arreglo. Sumar los números pares y restar los impares.
Mostrar el resultado final.
*/
public class ejer2_Arrays {
    public static int[] generando_arreglo(int array[]){
        for(int i=0; i<array.length;i++){
          array[i] = (int)(Math.random()*30);
        }
        return array;
    }
    public static int[] pares(int array[]){
       //pares en un nuevo arreglo:

         int [] pares = new int[array.length];
            int ind_Pares=0;
            for(int i=0; i<array.length;i++){
                if(array[i]%2==0){
                    ind_Pares++;
                }
            }
         int [] pares_recorte = new int[ind_Pares];
            int ind_Pares_recorte=0;
            for(int i=0; i<array.length;i++){
                if(array[i]%2==0){
                    pares_recorte[ind_Pares_recorte]=array[i];
                    ind_Pares_recorte++;
                }
            }

        return pares_recorte;
    }
    public static int[] inpares(int array[]){
        //pares en un nuevo arreglo:
        int [] inpares = new int[array.length];
        int ind_inPares=0;
        for(int i=0; i<array.length;i++){
            if(array[i]%2 != 0){
                ind_inPares++;
            }
        }
        int [] inpares_recorte = new int[ind_inPares];
        int ind_inPares_recorte=0;
        for(int i=0; i<array.length;i++){
            if(array[i]%2 != 0){
                inpares_recorte[ind_inPares_recorte]=array[i];
                ind_inPares_recorte++;
            }
        }
        return inpares_recorte;
    }
    //ordenar arreglo:
    public static int[] ordenar(int array[]){
        int aux;
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int tamaro_arreglo=30;
        int [] arreglo= new int[tamaro_arreglo];

        arreglo = generando_arreglo(arreglo);
        System.out.println(Arrays.toString(ordenar(arreglo)));

        System.out.println(Arrays.toString(pares(arreglo)));
        System.out.println(Arrays.toString(inpares(arreglo)));


    }

}
