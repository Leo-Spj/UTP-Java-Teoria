package PC1;

/*
* Subir el archivo de respuesta en esta pregunta

Una veterinaria cobra por atención a mascotas: perro, gato, conejo, otros

El precio de la consulta es el siguiente:
Si es perro cobra   50 soles
Si es gato cobra    30 soles
Si es conejo cobra  25 soles

Si es otro tipo de mascota cobra 100 soles

Cuanto debe pagar una persona por la consulta de una o varias mascotas del mismo tipo.

Si lleva mas de 3 mascotas, le hace un descuento del 20% del total a pagar

La veterinaria solo recibe el pago en dólares. 1 dólar vale 3.50 soles

a.- Declaración de variables e ingreso de datos (2 puntos)
b.- Cálculos                   (4puntos)
c.- Mostrar resultados el pago en dolares que realiza una persona (2 puntos)
* */


import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {

        String tipoMascota;
        int cantidad;
        double precio = 0, descuento = 0, precio_final = 0, pago_dolares = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tipo de mascota: ");
        tipoMascota = teclado.next();
        tipoMascota = tipoMascota.toLowerCase();

        System.out.println("Ingrese la cantidad de mascotas: ");
        cantidad = teclado.nextInt();

        switch (tipoMascota) {
            case "perro":
                precio = 50;
                break;
            case "gato":
                precio = 30;
                break;
            case "conejo":
                precio = 25;
                break;
            default:
                precio = 100;
                break;
        }

        precio_final = precio * cantidad;

        descuento = (cantidad > 3) ? precio_final * 0.2 : 0;

        precio_final = precio_final - descuento;

        pago_dolares = precio_final / 3.5;

        pago_dolares = Math.round(pago_dolares * 100.0) / 100.0;
        descuento = Math.round(descuento * 100.0) / 100.0;

        System.out.println("El pago en dolares es: $" + pago_dolares + ".\nEl descuento fue de: S/" + descuento);
    }

}
