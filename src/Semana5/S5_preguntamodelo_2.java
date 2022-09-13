package Semana5;

import java.util.Scanner;

/*
* Responda la pregunta usando if secuenciales y copie el código en esta respuesta. 

Desarrolle el código para el siguiente caso:

Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma que los primeros cinco minutos cuestan 1 sol los siguientes tres minutos, 80 centavos, los siguientes dos minutos a 72 centavos, y a partir del décimo minuto, 53 centavos (para esta parte use if secuenciales)
Además, se carga un impuesto de 3% cuando es domingo, y si es otro día 10% (para esta parte use if elvis).
Determinar el pago que debe realizar una persona que realiza una llamada.
*/
public class S5_preguntamodelo_2 {

        public static void main(String[] args) {
            
            int minutos;
            double pago = 0, impuesto;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el numero de minutos: ");
            minutos = teclado.nextInt();

            System.out.println("Ingrese el dia de la semana: ");
            String dia = teclado.next();
            dia = dia.toLowerCase();


            if(minutos<=5)
                pago=1;
            if(minutos>=5 && minutos<=8 )
                pago=1+0.80;
            if(minutos>=9 && minutos<=10)
                pago=1+0.80+0.72;
            if(minutos>=11)
                pago=1+0.80+0.72+0.53;



            impuesto = (dia.equals("domingo") ? pago * 0.03 : pago * 0.1);
            
            System.out.println("El costo es de S/ " + (pago + impuesto));

        }

}
