package PC1;

import java.util.Scanner;

/*
* Responda la pregunta y copie el programa en esta respuesta

Una empresa de transporte tiene los siguientes precios por persona de Lima a:

Destino      Precio (soles)
Chiclayo      60
Puno          120
Arequipa      85
Tacna         140

Obtenga el precio a un destino usando if y else (if anidados)
Tener en cuenta que si el destino no es ninguno de ellos, el precio debe ser 0
Ademas recibe un descuento promocional del 10% si la persona tiene entre 20 y 25 años de edad (use operador elvis)
Mostrar el precio final a pagar por una persona
* */

public class Pregunta1 {
    public static void main(String[] args) {

        String destino;
        int edad;
        double precio = 0, descuento = 0, precio_final = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el destino: ");
        destino = teclado.next();
        destino = destino.toLowerCase();

        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();

        if (destino.equals("chiclayo")) {
            precio = 60;
        } else if (destino.equals("puno")) {
            precio = 120;
        } else if (destino.equals("arequipa")) {
            precio = 85;
        } else if (destino.equals("tacna")) {
            precio = 140;
        } else {
            precio = 0;
        }

        descuento = (edad >= 20 && edad <= 25) ? precio * 0.1 : 0;

        precio_final = precio - descuento;

        System.out.println("El precio final a pagar es: S/" + precio_final + ".\nEl descuento fue de: S/" + descuento);
    }
}
