package Semana3;

import java.util.Scanner;

public class S3_teoria_EQUALS_ToLowerCase_IF_ejemplo3 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        // declaracion de variables
        String sexo;

        // entrada de datos
        System.out.println("Ingrese su sexo: ");
        sexo = teclado.next();
        sexo = sexo.toLowerCase();

        //Proceso
        if(sexo.equals("femenino")) {
            sexo = "Bienvenida";
        }if(sexo.equals("masculino")) {
            System.out.println("Bienvenido");
        }else {
            System.out.println("Dato no valido");
        }


        // salida
        System.out.println("Su sexo es: "+sexo);


    }
}
/*PROFE:

    public static void main(String[] args) {
        String sexo;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sexo: Masculino-Femenino ");sexo=scan.next();
        sexo= sexo.toLowerCase();
        if(sexo.equals("masculino"))
            System.out.println("Es varon");
        if (sexo.equals("femenino"))
            System.out.println("Es dama");
    }
*/