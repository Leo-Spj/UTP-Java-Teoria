package Semana5;
/*
* Responda la pregunta usando if secuenciales y copie el código en esta respuesta.
Desarrolle el código para el siguiente caso:

Obtener un valor random al lanzar un dado de seis caras. Obtenga el número en letras de la cara opuesta al valor obtenido.
Nota: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
*/
public class S5_preguntamodelo_3 {
    public static void main(String[] args) {

        int dado;
        String cara = "";

        dado = (int) (Math.random() * (6-1+1)+1);

        if (dado == 1) {
            cara = "seis";
        }
        if (dado == 2) {
            cara = "cinco";
        }
        if (dado == 3) {
            cara = "cuatro";
        }
        if (dado == 4) {
            cara = "tres";
        }
        if (dado == 5) {
            cara = "dos";
        }
        if (dado == 6) {
            cara = "uno";
        }

        System.out.println("El dado cayo en " + cara);
    }
}
