package Semana4;
/*un cliente desea comprar una cantidad de pantalones del mismo tipo, se ofrecen los seguientes precios unitarios segun el tipo:
tipo
deportivo - 50
casual - 40
elegante - 70

descuento
1-10  3%
11=16  5%
17 en adelante  7%
 */

import java.util.Scanner;

public class S4_teoria_Switch_ejercicio4_3 {
    public static void main(String[] args) {
        String tipo="", msg="El precio es de S/";
        int precio, cantidad;
        double descuento;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tipo de pantalon: ");
        tipo = teclado.next();
        tipo = tipo.toLowerCase();

        System.out.println("Ingrese la cantidad de pantalones: ");
        cantidad = teclado.nextInt();

        switch (tipo){
            case "deportivo":
                precio = 50;
                break;
            case "casual":
                precio = 40;
                break;
            case "elegante":
                precio = 70;
                break;
            default:
                precio = 0;
                msg = "Tipo de pantalon no valido ";
                break;
        }

        if (cantidad >= 1 && cantidad <= 10){
            descuento = 0.97;
        } else if (cantidad > 10 && cantidad <= 16){
            descuento = 0.95;
        } else if (cantidad > 16){
            descuento = 0.93;
        } else {
            descuento = 1;
        }

        System.out.println(msg + Math.round((cantidad*(precio*descuento))*100)/100.0 );
    }
}

