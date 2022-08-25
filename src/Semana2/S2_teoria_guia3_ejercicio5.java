package Semana2;
/*
* 5.	Se tiene una cantidad de dinero, se desea saber cuántos billetes de 200 soles,
*  de 100 soles, de 50 soles, de 20 soles, de 10 soles, monedas de 5 soles, de 2 soles,
*  de 1 sol, de cincuenta centavos, de 20 centavos y de 10 centavo se obtienen con esa
* cantidad de dinero. Ejemplo: 329,30   1 billete de 200 soles,  1 billete de 100 soles,
* 0 billetes de 50 soles, 1 billete de 20 soles, 0 billetes de 10 soles, una moneda de 5 soles,
*  2 monedas de 2 soles, 0 moneda de 1 sol, 0 monedas de 50 centavos, 1 moneda de 20 centavos
*  y 1 moneda de 10 centavos.
* */
public class S2_teoria_guia3_ejercicio5 {
    public static void main(String[] args){

        // declaracion de variables
        double cantidad,b200,b100,b50,b20,b10,m5,m2,m1,c50,c20,c10;
        cantidad=329.30;

        b200=(int)(cantidad/200); cantidad=cantidad%200;
        b100=(int)(cantidad/100); cantidad=cantidad%100;
        b50=(int)(cantidad/50); cantidad=cantidad%50;
        b20=(int)(cantidad/20); cantidad=cantidad%20;
        b10=(int)(cantidad/10); cantidad=cantidad%10;
        m5=(int)(cantidad/5); cantidad=cantidad%5;
        m2=(int)(cantidad/2); cantidad=cantidad%2;
        m1=(int)(cantidad); cantidad=cantidad%1;

            cantidad=cantidad*10;
        c50=(int)(cantidad/5); cantidad=cantidad%5;
        c20=(int)(cantidad/2); cantidad=cantidad%2;
        c10=(int)(cantidad);

        System.out.println("billetes de 200 soles: " +b200);
        System.out.println("billetes de 100 soles: " +b100);
        System.out.println("billetes de 50 soles: " +b50);
        System.out.println("billetes de 20 soles: " +b20);
        System.out.println("billetes de 10 soles: " +b10);
        System.out.println("monedas de 5 soles: " +m5);
        System.out.println("monedas de 2 soles: " +m2);
        System.out.println("monedas de 1 sol: " +m1);
        System.out.println("monedas de 50 centavos: " +c50);
        System.out.println("monedas de 20 centavos: " +c20);
        System.out.println("monedas de 10 centavos: " +c10);

    }
}