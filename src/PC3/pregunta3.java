package PC3;
/*Desarrollar un main que evalúe los datos ingresados usando excepciones.

Debe ingresar un nombre, si el nombre está vacío, debe enviar un mensaje de error.
Si el nombre tiene dos caracteres o menos, debe enviar un mensaje de error.

Debe ingresar un peso, si ingresa un valor tipo cadena, debe enviar un mensaje de error.
Si el peso es negativo, debe enviar un mensaje de error.*/

import java.util.Scanner;

public class pregunta3 {
    public static void main(String[] args) {

        String nombre;
        double peso;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        nombre = teclado.next();
        if(nombre.length()<=2){
            throw new IllegalArgumentException("debe tener mas de 2 caracteres");
        }

        System.out.println("Ingrese peso: ");
        try {
            peso = Double.parseDouble(teclado.next());
            if(peso<0){
                throw new IllegalArgumentException("Peso debe ser positivo");
            }
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Peso debe ser un numero");
        }
    }
}