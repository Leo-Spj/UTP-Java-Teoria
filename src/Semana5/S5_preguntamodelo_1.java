package Semana5;

import java.util.Scanner;

/*
* Responda la pregunta usando if y else (if anidados) y copie el código en esta respuesta.
Desarrolle el código para el siguiente caso;
El director de un colegio está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
* Si son 100 alumnos o más, el costo por cada alumno es de 65 soles
* De 50 a 99 alumnos, el costo es de 70 soles
* De 30 a 49 alumnos, el costo es de 95 soles
* Menos de 30 alumnos, el costo del servicio es de 4000 soles, sin importar el número de alumnos.
Determinar el pago a la compañía de viajes y lo que debe pagar cada alumno por el viaje

* */
public class S5_preguntamodelo_1 {

    public static void main(String[] args) {
        int alumnos;
        double costo,x_alumno;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos: ");
        alumnos = teclado.nextInt();

        if (alumnos >= 100){
            costo = alumnos * 65;
            x_alumno = costo/ alumnos;
        } else {
            if (alumnos >= 50 && alumnos <= 99){
                costo = alumnos * 70;
                x_alumno = costo/ alumnos;
            } else {
                if (alumnos >= 30 && alumnos <= 49){
                    costo = alumnos * 95;
                    x_alumno = costo/ alumnos;
                } else {
                    costo = 4000;
                    x_alumno = costo/ alumnos;
                }
            }
        }

        System.out.println("El costo por alumno es de S/ " + x_alumno);
        System.out.println("El costo es de S/ " + costo);
    }

}
