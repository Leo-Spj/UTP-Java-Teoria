package Semana6;

public class S6_Rev_exam1 {

    public static void main(String[] args) {
        double precio,porctDscto,precioFinal;
        String destino="Arequipa";
        int edad=22;

        destino=destino.toLowerCase();

        if(destino.equals("chiclayo"))
            precio=60;
        else{
            if(destino.equals("puno"))
                precio=120;
            else{
                if(destino.equals("arequipa"))
                    precio=85;
                else{
                    if(destino.equals("tacna"))
                        precio=140;
                    else precio=0;
                }
            }
        }

        porctDscto=(edad>=20 && edad<=25?0.10:0);
        precioFinal=precio-precio*porctDscto;

        System.out.println(precioFinal);
    }

}
