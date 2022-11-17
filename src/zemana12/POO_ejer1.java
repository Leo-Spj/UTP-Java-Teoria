package zemana12;

public class POO_ejer1 {
    /*
    * cree una clase Arbol con metodos: crecer(), crearHojas() y fotosintesis().
    * tambien debe tener los atributos cantidadHojas, tipo, antiguedad, altura.
    * Cree un objeto en vase a esta y pruebe los atributos.
    * */
    class Arbol{
        int cantidadHojas;
        String tipo;
        int antiguedad;
        double altura;

        public void crecer(){
            System.out.println("El arbol crece");
        }
        public void crearHojas(){
            System.out.println("El arbol crea hojas");
        }
        public void fotosintesis(){
            System.out.println("El arbol realiza fotosintesis");
        }

        public Arbol(){
            cantidadHojas = 0;
            tipo = "desconocido";
            antiguedad = 0;
            altura = 0;
        }
    }
    public static void main(String[] args) {

    }
}
