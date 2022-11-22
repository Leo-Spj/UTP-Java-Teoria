package zemana15;

public class llamando_libreria {
    public static void main (String[] args){
        libreria Lib = new libreria();

        Lib.setCuadernos(25);
        System.out.println(Lib.toString());
    }
}
