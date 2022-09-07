package Semana1;
/*
* Tipo de datos:
 * int edad = 12;
 * String nombre =  "leonardo"
 * char genero = 'm'
 * double promedio = 4.5;
 * float promedio = 3.3;
 *
 * para elevar a potencia se uza power (pow) usando Math.pow(a, b).
 * para sacar la raiz se usa (1/b) como exponente.
 * para redondear usar Math.round(e.100)/100.0  con dos ceros para tener mas
 *  decimales Math.round(e.10000)/10000.0
 * para un numero aleatorio entero (int)(Math.ramdom()*12)
 *
 * aleatorio dentro de un rango:
 * int mayor=30, menor=11;
 * c=(int)(Math.ramdom()*( mayor-menor+1)+menor)
* */

public class S1_teoria_Math_random_pow_round_ejercicio1 {


    public static void main(String[] args) {
        int a,b,c; double d;
        a=13;   b=3;
        c=a+b;   System.out.println("suma "+c);
        c=a-b;   System.out.println("resta "+c);
        c=a*b;   System.out.println("multiplica "+c);
        c=a/b;   System.out.println("divide entero "+c);
        d=a*1.0/b;   System.out.println("divide "+d);
        c=a%b;   System.out.println("residuo "+c);
        d=Math.pow(a, b);   System.out.println("potencia "+d);
        d=Math.pow(a, 1.0/b);   System.out.println("Raiz "+d);
        d=a*1.0/b;   System.out.println("divide "+d);
        d=Math.round(d*10000)/10000.0;
        System.out.println("redondeado "+d);

        d=Math.random();System.out.println("random "+d);
        c=(int)(Math.random()*12);System.out.println("random "+c);
        int mayor=30,menor=11;
        c=(int)(Math.random()*(mayor-menor+1)+menor);System.out.println("random "+c);
    }

}
