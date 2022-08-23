/*
* La municipalidad de Pueblo Libre piensa invertir cierto monto de dinero en la reparación de
las pistas en las avenidas principales. Cada avenida recibirá un monto equivalente a:
 Av. La Mar: 35% del monto recibido por Av. Bolivar
 Av. 28 de Julio: 25% del monto recibido
 Av. Bolivar: 10% de lo recibido por la Av. 28 de Julio y Av. Clement
 Av. Clement: 15% del monto recibido
 Av. Sucre: lo que queda del resto.
Dado el monto a invertir, desarrolle un programa que determine cuánto dinero le
corresponde a cada avenida.
* */

import java.util.Scanner;

public class S2_teoria_ejercicio2_0 {
    public static void main(String[] args) {

        double monto, lamar, julio28, bolivar, clement, sucre;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto a invertir: ");
        monto = teclado.nextDouble();

        lamar = monto * 0.35;
        julio28 = monto * 0.25;
        bolivar = monto * 0.1;
        clement = monto * 0.15;
        sucre = monto * 0.15;

        System.out.println("El monto a pagar por la Av. La Mar es: " + (lamar));
        System.out.println("El monto a pagar por la Av. 28 de Julio es: " + (julio28));
        System.out.println("El monto a pagar por la Av. Bolivar es: " + (bolivar));
        System.out.println("El monto a pagar por la Av. Clement es: " + (clement));
        System.out.println("El monto a pagar por la Av. Sucre es: " + (sucre));

    }
}
