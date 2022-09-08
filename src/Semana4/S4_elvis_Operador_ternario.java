package Semana4;

public class S4_elvis_Operador_ternario {

    public static void main(String[] args) {
        int importe=200, edad=15;  // si compro mas de 300 soles y es menor de 18 años, dscto=10%, caso cont 8%
        double porcDscto;
        porcDscto=(importe>300 ?(edad<18 ? 0.10 : 0.08)  :0);
        System.out.println(porcDscto);
    }

}
