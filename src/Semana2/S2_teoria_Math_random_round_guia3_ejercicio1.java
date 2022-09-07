package Semana2;
/*
 1.	Desarrollar un programa que calcule el área de un Rombo. Ingresar las diagonales. El algoritmo debe imprimir el valor de las diagonales y del área.
areaRombo = (diagonalMayor * diagonal Menor)/2
usar random para la diagonal mayor y menor

 * */
public class S2_teoria_Math_random_round_guia3_ejercicio1 {

    public static void main(String[] args) {
        // declaracion de variables
        double area, diagMayor, diagMenor;

        diagMayor=(double)(Math.random()*40);
        diagMenor=(double)(Math.random()*40);
        diagMayor=Math.round(diagMayor*1000)/1000.0;
        diagMenor=Math.round(diagMenor*1000)/1000.0;
        area = (diagMayor*diagMenor)/2;
        area=Math.round(area*1000)/1000.0;
        System.out.println("Diag "+diagMayor+"\t"+"Diag "+diagMenor+"\nArea "+area);
    }

}
