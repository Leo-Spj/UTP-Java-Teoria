package Semana6;

public class S6_Rev_exam3 {

    public static void main(String[] args) {

        double precio=0,porctDscto,precioFinal;
        String destino="Arequipa";
        int edad=15;

        destino=destino.toLowerCase();

        if(destino.equals("chiclayo"))
            precio=60;
        if(destino.equals("puno"))
            precio=120;
        if(destino.equals("arequipa"))
            precio=87;
        if(destino.equals("tacna"))
            precio=140;

        switch (edad){
            case 22:
            case 23:
            case 24:
            case 25:porctDscto=0.10;break;
            default:porctDscto=0;
        }

        precioFinal=precio-precio*porctDscto;

        System.out.println(precioFinal);
    }

}
