package Semana5;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/*
* Responda la pregunta y suba el archivo con el código de la solución

Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia.
El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
ZONA UBICACIÓN    COSTO/KILOGRAMO
América del Norte         24,30 soles
América Central            20, 40 soles
América del Sur             21,35 soles
Europa                           10,23 soles
Asia                                18,27 soles

* Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

a.- Declaración de variables e ingreso de datos.
b.- Cálculos del importe a pagar redondeado a 2 decimales.
c.- Mostrar el resultado.

* */
public class S5_preguntamodelo_4 {

        public static void main(String[] args) {
                double peso_pk=0, precio=0;
                String destino="";

                Scanner teclado = new Scanner(System.in);

                System.out.println("Ingrese el peso del paquete en Kg: ");
                peso_pk = teclado.nextDouble();

                if(peso_pk <= 5){

                        System.out.println("¿A qué zona irá dirigido su paquete?\nAmerica del Norte\t24,30 soles.\nAmerica Central\t20,40 soles\nAmerica del Sur\t21,35 soles\nEuropa\t10,23 soles\nAsia\t18,27 soles");
                        destino = teclado.next();
                        destino = destino.toLowerCase();

                        switch (destino){
                                case "america del sur":
                                        precio = peso_pk*24.3;
                                        break;
                                case "america central":
                                        precio = peso_pk*20.4;
                                        break;
                                case "america del norte":
                                        precio = peso_pk*21.35;
                                        break;
                                case "europa":
                                        precio = peso_pk*10.23;
                                        break;
                                case "asia":
                                        precio = peso_pk*18.27;
                                        break;
                                default:
                                        System.out.println("El destino ingresado no es válido.");
                                        break;
                        }

                        precio = Math.round(precio*100.0)/100.0;
                        System.out.println("El precio a pagar es de S/ " + precio);

                } else {
                        System.out.println("No se puede enviar su paquete. \nEl peso excede los 5Kg.");
                }

        }

}
