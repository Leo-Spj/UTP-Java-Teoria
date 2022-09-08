package Semana4;

public class S4_Operador_ternario_if {

    public static void main(String[] args) {
        String msg="", sexo ="m";

        sexo = sexo.toLowerCase();
        msg = (sexo.equals("f") ? "femenino" : (sexo.equals("m") ? "masculino" : "Dato no valido"));

        System.out.println(msg);
    }

}
