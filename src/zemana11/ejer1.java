package zemana11;

import java.util.Arrays;

/*
* hacer una matriz 9 x 3
* imprimir el abecedario
* */
public class ejer1 {
    public static void main(String[] args) {
        int y_filas = 9;
        int x_columnas = 3;
        char letra = 'A';
        int fila = 0;
        do{
            String argumento = "";
            for (int i = 0; i < x_columnas; i++) {
                argumento += letra+" ";
                letra++;
            }
            System.out.println(argumento);
            fila++;
        } while (fila < y_filas);
    }
    //crear una funcion que sume dos numeros:
    public static int suma(int a, int b){

        return a+b;
    }
}
