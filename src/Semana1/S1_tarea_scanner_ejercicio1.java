package Semana1;

import java.util.Scanner;

public class S1_tarea_scanner_ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double montoMes = teclado.nextDouble();

        System.out.println("Ingrese el número de cuotas: ");
        double nroMeses = teclado.nextDouble();

        double cuota = montoMes / nroMeses;
        double redondeo = (double)Math.round(cuota * 100.0) / 100.0;

        System.out.println("El monto a pagar es: " + redondeo);
    }
}
