package PC1;

import java.util.Scanner;

/*
* Desarrolle el código para el siguiente caso;

El tamaño de la memoria del computador se expresa en Kbytes.

Se desea estimar el número de páginas de un texto que puede almacenarse en la memoria de un computador,
*  considerando un promedio de 300 palabras por página y 10 caracteres por palabra.
* Asumir que un carácter ocupa un byte.

Copie el programa en esta parte
* */
public class Pregunta3 {
    public static void main(String[] args) {

        double memoria, palabras, caracteres, capacidad_total_bytes, paginas;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la memoria en Kilobytes: ");
        memoria = teclado.nextDouble();

        capacidad_total_bytes = memoria * 1024;
        palabras = 300;
        caracteres = 10;

        paginas = capacidad_total_bytes / (palabras * caracteres);

        paginas = Math.round(paginas*100)/100.0;

        System.out.println("El numero de paginas que puede almacenar es: " + paginas);

    }
}
