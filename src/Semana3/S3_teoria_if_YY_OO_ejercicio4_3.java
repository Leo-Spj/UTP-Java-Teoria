package Semana3;

public class S3_teoria_if_YY_OO_ejercicio4_3 {
    public static void main(String[] args) {


        double n1, n2, n3, promedio;

        n1=(double)(Math.random()*21);
        n2=(double)(Math.random()*21);
        n3=(double)(Math.random()*21);


        System.out.println("nota1 " +Math.round(n1*100)/100.0);
        System.out.println("nota2 " +Math.round(n2*100)/100.0);
        System.out.println("nota3: " +Math.round(n3*100)/100.0);
        System.out.println("-----------------------------------------");

        promedio=(n1+n2+n3)/3;

        System.out.println("El promedio: "+Math.round(promedio*100)/100.0);
        System.out.println("El promedio redondeado es: "+Math.round(promedio));


        if((promedio >= 0) && (promedio <12)){
            System.out.println("Reprobado");
        } else {
            if((promedio >= 12) && (promedio <=20)){
            System.out.println("Aprobado");
            } else {
                System.out.println("Dato no valido");
            }
        }

    }

}
