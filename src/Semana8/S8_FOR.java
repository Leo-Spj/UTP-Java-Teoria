package Semana8;

public class S8_FOR {
    public static void main(String[] args) {
        int i;
        String cadena1 = "", cadena2 = "";


        //incremental
        for (i = 0; i < 10; i++) {
            cadena1 += i + "\t";  //+= es igual a cadena1 = cadena1 + i + "\t";
        }
        System.out.println(cadena1);


        //decremental
        for (i = 10; i > 0; i--) {
            cadena2 = cadena2 + i + "\t"; //aqui está de manera clasica.
        }
        System.out.println(cadena2);
    }
}
