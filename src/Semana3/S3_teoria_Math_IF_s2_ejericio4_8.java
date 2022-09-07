package Semana3;
/*
* Dado un triangulo de lados a,b,c, donde a>c y a>b. determine el tipo de triangulo de acuerdo a las siguientes condiciones:
* si:
* a^2 = b^2 + c^2 ---> triangulo rectangulo
* a^2 < b^2 + c^2 ---> triangulo acutangulo
* a^2 > b^2 + c^2 ---> triangulo obtusangulo
*
* */
public class S3_teoria_Math_IF_s2_ejericio4_8 {
    public static void main(String[] args) {

        double a,b,c;
        a = Math.round((Math.random()*10)*100)/100.0;
        b = Math.round((Math.random()*10)*100)/100.0;
        c = Math.round((Math.random()*10)*100)/100.0;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

        if(a>b && a>c){
            if(Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
                System.out.println("Triangulo rectangulo");
            }else if(Math.pow(a,2) < Math.pow(b,2) + Math.pow(c,2)){
                System.out.println("Triangulo acutangulo");
            }else if(Math.pow(a,2) > Math.pow(b,2) + Math.pow(c,2)){
                System.out.println("Triangulo obtusangulo");
            }
        }else{
            System.out.println("No se puede determinar el tipo de triangulo");
        }

    }
}
