package PC3.pregunta4;
/*Desarrollar una clase que contenga las notas de los N alumnos de un curso,

Cada alumno tiene 5 notas obtenidas en 5 exámenes diferentes.

Debe tener un método que llene el arreglo con valores aleatorios entre 3 a 20

Desarrollar un método que calcule el promedio de notas de cada uno de los N estudiantes
(considerando los 5 exámenes).
Desarrollar un método que obtenga la cantidad de estudiantes que obtuvieron la mejor
calificación en el tercer examen.*/

import java.util.Arrays;

public class cAlumnoNotas{

    private double[] notas;


    public cAlumnoNotas(){
        notas = new double[5];
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //devolviendo la tercera nota
    public double getNota3(){
        return notas[2];
    }

    public double[] getNotas() {
        return notas;
    }

    public double promedio(){
        double suma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            suma += notas[i];
        }
        return suma/notas.length;
    }

    @Override
    public String toString() {
        return "cAlumnoNotas{" +
                "notas=" + Arrays.toString(notas) +
                '}';
    }

}