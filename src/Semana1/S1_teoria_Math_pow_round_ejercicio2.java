package Semana1;

public class S1_teoria_Math_pow_round_ejercicio2 {


    public static void main(String[] args) {
        //  declaracion de variables
        double area,radio,pi;
        //  entrada de datos
        pi=3.1416; radio=2.3;
        //calculo
        area=pi * Math.pow(radio, 2);
        area = Math.round(area*1000)/1000.0;
        System.out.println("Area "+area);
    }

}