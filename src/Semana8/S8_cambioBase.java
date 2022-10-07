package Semana8;

public class S8_cambioBase {
    public static int convierteNumero(int numero, int base){
        int resto, nuevoNum=0, mult=1;
        while(numero > 0){
            resto = numero % base;
            numero = numero / base;
            nuevoNum= nuevoNum + resto * mult;
            mult = mult * 10;
        }
        return nuevoNum;
    }
    public static void main(String[] args) {
        int numero = 7, base = 2;
        System.out.println(convierteNumero(numero,base));
    }

}
