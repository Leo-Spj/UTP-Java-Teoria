package Semana2;
/*
* 4.	Pc1, pc2, pc3,EF       20%PC1+20%PC2+30%PC3+30%EF         obtener
* el Promedio final con 2decimales. Mostrar el PF con dos decimales y el PF redondeado sin decimales
*
* * aleatorio dentro de un rango:
 * int mayor=30, menor=11;
 * c=(int)(Math.ramdom()*( mayor-menor+1)+menor)
* */

public class S2_teoria_guia3_ejercicio4 {
    public static void main(String[] args) {

        // declaracion de variables
        double pc1, pc2, pc3, ef, pf,mayor,menor;

        mayor=20; menor=0;

        pc1=(double)(Math.random()*(mayor-menor+1)+menor);
        pc2=(double)(Math.random()*(mayor-menor+1)+menor);
        pc3=(double)(Math.random()*(mayor-menor+1)+menor);
        ef=(double)(Math.random()*(mayor-menor+1)+menor);

        pf=(pc1*0.2)+(pc2*0.2)+(pc3*0.3)+(ef*0.3);

        // salida
        System.out.println("p1: " +Math.round(pc1*100)/100.0);
        System.out.println("p2: " +Math.round(pc2*100)/100.0);
        System.out.println("p3: " +Math.round(pc3*100)/100.0);
        System.out.println("ef: " +Math.round(ef*100)/100.0);

        System.out.println("El promedio final es: "+Math.round(pf*100)/100.0);
        System.out.println("El promedio final es: "+Math.round(pf));
    }

}

