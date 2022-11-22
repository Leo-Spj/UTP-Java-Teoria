package zemana15;
/*
* escriba la clase televisor, que contiene los atribuso masca,
* tamaño(pulgadas), resolucion(pixeles).
* la clase deve contener 3 contructores: uno sin parametros, otro con parametros de marca
* y tamaño, el tercer constructor con todos los parametros.
* ademas, solo el metodo accesor devuelva su resolucion.
* */
// creando la clase televisr:
public class televisor {
    //atributos:
    private String marca;
    private int tamaño;
    private int resolucion;
    //constructor sin parametros:
    public televisor(){
        this.marca = "";
        this.tamaño = 0;
        this.resolucion = 0;
    }
    //constructor con parametros de marca y tamaño:
    public televisor(String marca, int tamaño){
        this.marca = marca;
        this.tamaño = tamaño;
        this.resolucion = 0;
    }
    //constructor con todos los parametros:
    public televisor(String marca, int tamaño, int resolucion){
        this.marca = marca;
        this.tamaño = tamaño;
        this.resolucion = resolucion;
    }
    //metodos:
    //metodo accesor de resolucion:
    public int getResolucion(){
        return resolucion;
    }
    //metodo toString:
    @Override
    public String toString(){
        return "Marca: "+marca+"\nTamaño: "+tamaño+"\nResolucion: "+resolucion;
    }
}
