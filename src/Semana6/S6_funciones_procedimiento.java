package Semana6;

/*
* Haz una funcion que use por funcion dos numeros para luego poder elegir entre sumar,
*  restar multiplicar, dividir*/

import java.util.Scanner;

public class S6_funciones_procedimiento {

    public static double operacion(double a, double b, String opcion) {
        double resultado = 0;

        switch (opcion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicar":
                resultado = a * b;
                break;
            case "dividir":
                resultado = (double)Math.round((a*1.0/ b) * 100) / 100.0;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int a = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int b = teclado.nextInt();

        System.out.println("Ingrese la operacion a realizar: ");
        String opcion = teclado.next();
        opcion = opcion.toLowerCase();

        double resultado = 0;


     resultado = operacion(a, b, opcion);

        System.out.println("El resultado es: " + resultado);
    }


}
