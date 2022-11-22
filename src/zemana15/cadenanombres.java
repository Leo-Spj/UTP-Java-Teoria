package zemana15;
/*
* desarrolle solo el metodo que recibe dos arreglos de los nombres como parametro.
* generar y devolver una cadena. donde se muestren los nombres del primer arreglo que
* se encuentren en el segundo arreglo.
* ejemplo:
* nombre1: {juan, pedro, maria, jose}
* nombre2: {maria, jose, carlos, juan}
* salida: maria, jose, juan
* */

//desarrollo:

public class cadenanombres {
    //metodo que recibe dos arreglos de nombres como parametro:
    public static String nombres(String[] nombre1, String[] nombre2){
        //creando la cadena:
        String cadena = "";
        //recorriendo el primer arreglo:
        for(int i = 0; i < nombre1.length; i++){
            //recorriendo el segundo arreglo:
            for(int j = 0; j < nombre2.length; j++){
                //comparando los nombres:
                if(nombre1[i].equals(nombre2[j])){
                    //agregando el nombre a la cadena:
                    cadena += nombre1[i]+", ";
                }
            }
        }
        //devolviendo la cadena:
        return cadena;
    }
    //metodo main:
    public static void main(String[] args) {
        //creando los arreglos:
        String[] nombre1 = {"juan", "pedro", "maria", "jose"};
        String[] nombre2 = {"maria", "jose", "carlos", "juan"};
        //imprimiendo los nombres:
        System.out.println(nombres(nombre1, nombre2));
    }
}
