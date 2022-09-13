package Semana5;

import java.util.Scanner;

public class S5_fernando {

    /*
    una empresa de bienes y reices alquila despartementos; los precios de alquiler varian de acuerdo al area que ocupa el departamento y la zona donde se encuentra ubicada.
    area        recidencial   comercial
    0-100       250           200
    101-200     310           250
    201-mas     400           320

    elaborar un programa que calvule el monto que se paga por el alquiler de un departemneto.
    * */
        public static void main(String[] args) {

            int area;
            String zona;
            double precio;

            Scanner teclado = new Scanner(System.in);
            //ingrese area
            System.out.println("Ingrese el area del departamento: ");
            area = teclado.nextInt();
            //ingrese zona
            System.out.println("Ingrese la zona del departamento: ");
            zona = teclado.next();
            zona = zona.toLowerCase();

            switch (zona){
                case "recidencial":
                    if (area >= 0 && area <= 100){
                        precio = 250;
                    } else if (area > 100 && area <= 200){
                        precio = 310;
                    } else if (area > 200){
                        precio = 400;
                    } else {
                        precio = 0;
                    }
                    break;
                case "comercial":
                    if (area >= 0 && area <= 100){
                        precio = 200;
                    } else if (area > 100 && area <= 200){
                        precio = 250;
                    } else if (area > 200){
                        precio = 320;
                    } else {
                        precio = 0;
                    }
                    break;
                default:
                    precio = 0;
                    break;
            }

            System.out.println("El precio es de S/ " + precio);


        }

}
