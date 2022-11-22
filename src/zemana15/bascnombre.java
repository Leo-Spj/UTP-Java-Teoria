package zemana15;
/*
* desarrolle solo el metodo que recibe dos arreglos de los nombres como parametro y
* un nombre a buscar.
* generar y devolver una cadena, donde se indique en que arreglo se encuentra el nombre
* a buscar.
* tener en cuenta que los nombres no se repiten en los arreglos., es deciir, si el nombre existe,
* solo va a estar en el primer o segundo arreglo.
* por ejemplo:
* nombre1: {juan, pedro, maria, jose}
* nombre2: {gonzalo, leonardo, carlos, luis}
* nombre a buscar: maria
* */
public class bascnombre {
    public static String nombres(String[] arreglo1, String[] arreglo2, String nombre){
        String cadena = "";
        //recorriendo el primer arreglo:
        for(int i = 0; i < arreglo1.length; i++){
            //comparando los nombres:
            if(arreglo1[i].equals(nombre)){
                cadena += "El nombre "+nombre+" se encuentra en el primer arreglo";
            }
        }
        //recorriendo el segundo arreglo:
        for(int j = 0; j < arreglo2.length; j++){
            //comparando los nombres:
            if(arreglo2[j].equals(nombre)){
                cadena += "El nombre "+nombre+" se encuentra en el segundo arreglo";
            }
        }
        return cadena;
    }

    public static void main(String[] args) {

        String[] arreglo1 = {"juan", "pedro", "maria", "jose", "manuel"};
        String[] arreglo2 = {"gonzalo", "leonardo", "carlos", "luis"};
        //nombre a buscar:
        String nombre = "maria";
        //imprimiendo los nombres:
        System.out.println(nombres(arreglo1, arreglo2, nombre));
    }
}
