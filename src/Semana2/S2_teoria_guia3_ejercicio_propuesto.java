package Semana2;

import java.util.Scanner;

public class S2_teoria_guia3_ejercicio_propuesto {

    public static void main(String[] args) {
        // declaracion de las variables
        double x1,x2,y1,y2,distancia;
        Scanner scan=new Scanner(System.in);
        // ingreso
        System.out.print("ingresar x1 "); x1= scan.nextDouble();
        System.out.print("ingresar x2 "); x2= scan.nextDouble();
        System.out.print("ingresar y1 "); y1= scan.nextDouble();
        System.out.print("ingresar y2 "); y2= scan.nextDouble();
        // calculos
        distancia=Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2);
        distancia= Math.pow(distancia, 1.0/2);
        // salida
        System.out.println("Distancia "+distancia);
    }

}
