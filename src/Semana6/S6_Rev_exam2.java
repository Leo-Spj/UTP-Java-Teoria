package Semana6;

public class S6_Rev_exam2 {

    public static void main(String[] args) {
        double precio,porctDscto,precioFinal;
        String destino="Arequipa";
        int edad=15;

        destino=destino.toLowerCase();

        switch(destino){
            case "chiclayo": precio=60;break;
            case "puno":     precio=120;break;
            case "arequipa": precio=86;break;
            case "tacna":   precio=140;break;
            default: precio=0;
        }

        porctDscto=(edad>=22 && edad<=25?0.10:0);
        precioFinal=precio-precio*porctDscto;

        System.out.println(precioFinal);
    }

}
