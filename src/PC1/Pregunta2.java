package PC1;

import java.util.Scanner;

/*
* Desarrolle el código para el siguiente caso;
Un deposito vehicular, cobra por el internamiento diario de acuerdo al tipo de vehiculo.

tipo Vehiculo      costo diario
     Moto                  20 soles
     Auto                   36 soles
     Camioneta         66 soles
     Camión               80 soles

Ademas, tiene un descuento por los dias de internamiento:

dias              % de descuento
Entre 1 y 4 dias      6%
entre 5 y 7 dias      9%
mas de 7 dias        12%

Programar la solución, usando switch para obtener el costo por dia,
* usar if secuenciales para obtener el % de descuento.
* Calcular y mostrar cuanto debe pagar una persona por el internamiento de su vehiculo.
* */
public class Pregunta2 {
    public static void main(String[] args) {

        String tipoVehiculo;
        int dias;
        double costo = 0, costoXdias =0, descuento = 0, costo_final = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehiculo: ");
        tipoVehiculo = teclado.next();
        tipoVehiculo = tipoVehiculo.toLowerCase();

        System.out.println("Ingrese los dias de internamiento: ");
        dias = teclado.nextInt();

        switch (tipoVehiculo) {
            case "moto":
                costo = 20;
                break;
            case "auto":
                costo = 36;
                break;
            case "camioneta":
                costo = 66;
                break;
            case "camion":
                costo = 80;
                break;
            default:
                costo = 0;
                break;
        }

        costoXdias = costo * dias;

        if (dias >= 1 && dias <= 4) {
            descuento = costoXdias* 0.06;
        }
        if (dias >= 5 && dias <= 7) {
            descuento = costoXdias* 0.09;
        }
        if (dias > 7) {
            descuento = costoXdias * 0.12;
        }

        costo_final = costoXdias - descuento;

        System.out.println("El costo final a pagar es: S/" + costo_final + ".\nEl descuento fue de: S/" + descuento);
    }
}
