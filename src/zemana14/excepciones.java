
package zemana14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepciones {
    public static void main (String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner teclado = new Scanner(System.in);

        try{

            System.out.println("Ingrese el valor de a: ");
            a=teclado.nextInt();
            System.out.println("Ingrese el valor de b: ");
            b=teclado.nextInt();

            if(a>30 || a<10){
                throw new RuntimeException("El valor debe estar entre 10 y 30");
            }
            if(b<10 || b>30){
                throw new RuntimeException("El valor debe estar entre 10 y 30");
            }
            c = a*b;
            System.out.println("El resultado de la multiplicación es: "+c);
        }catch(ArithmeticException e){
            System.out.println("Error en la division entre 0");
        }catch(InputMismatchException e){
            System.out.println("Error en ingreso de datos");
        }
    }

}
