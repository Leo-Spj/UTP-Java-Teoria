package zemana13.ejercicio3;

import static java.lang.Character.toUpperCase;

public class clasePersona {
    /*
    Crear una clase llamada Persona que tenga las siguientes condiciones:
    Atributos: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
    No se accede directamente a ellos.
    Todos los atributos menos el DNI serán valores por defecto según su tipo
    (0 números, cadena vacía para String, etc.).
    Sexo será hombre por defecto.
    */
    public class Persona{
       String nombre;
       int edad;
       String DNI; //lo creo como String para poder dejarlo vacío y usar el método generarDNI
        char sexo;
        double peso;
        double altura;

        //número aleatorio de 8 cifras.  10000000  -  99999999.
        private String generarDNI() {
            String dni = "";
            int numero = (int) (Math.random() * (90000000-10000000+1) + 10000000);
            dni = numero+""; //procedimiento no convencional para pasar de int a String
            return dni;
        }
        //MÉTODOS:
        /*
        calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)),
        si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, significa que está bajo de peso.
        Si devuelve un número entre 20 y 25 (incluidos), la función devuelve un 0, significa que está en su peso ideal
        y si devuelve un valor mayor que 25, la función devuelve un 1, significa que tiene sobrepeso.
        */
        public String calcularIMC(){
            int resultado = 0; //entre 20 y 25 = 0
            double altura = this.altura;
            String mensaje = "peso ideal";
            double imc = (peso*1.0)/(altura*altura);
            if(imc < 20) {
                resultado = -1;
                mensaje = "bajo de peso";
            }else if(imc > 25){
                resultado = 1;
                mensaje = "sobrepeso";
            }
            return mensaje;
        }
        //esMayorDeEdad(): indica si es mayor de edad (18 años o más), devuelve un booleano.
        public boolean esMayorDeEdad(){
            boolean mayor = false;
            if(edad >= 18){
                mayor = true;
            }
            return mayor;
        }
        //comprobarSexo(char sexo): comprueba que el sexo introducido sea correcto. Si no es correcto, será H.
        private char comprobarSexo(char sexo){
            sexo = toUpperCase(sexo);
            if(sexo != 'H' || sexo != 'M'){
                sexo = 'H';
            }
            return sexo;
        }
        //toString(): devuelve toda la información del objeto.
        @Override
        public String toString(){
            return "Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+DNI+"\nSexo: "+sexo+"\nPeso: "+peso;
        }


    //CONSTRUCTORES:

        //constructor sin parámetros
        public Persona(){
            this.nombre = "";
            this.edad = 0;
            this.DNI = generarDNI();
            this.sexo = 'H';
            this.peso = 0;
            this.altura = 0;
        }
        //constructor con el nombre, edad y sexo.
        public Persona(String nombre, int edad, char sexo){
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = comprobarSexo(sexo);
            this.DNI = generarDNI();
            this.peso = 0;
            this.altura = 0;
        }
        //constructor con todos los atributos como parámetro.
        public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura){
            this.nombre = nombre;
            this.edad = edad;
            this.DNI = DNI;
            this.sexo = comprobarSexo(sexo);
            this.peso = peso;
            this.altura = altura;
        }


    }


}

