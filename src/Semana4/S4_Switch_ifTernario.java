package Semana4;

public class S4_Switch_ifTernario {

        public static void main(String[] args) {

            String tipo="A";
            int n_personas=13, max_person=0, sig_person=0;
            float precio=0, total;

            tipo = tipo.toUpperCase();

            switch (tipo){
                case "A":
                    precio = 40;
                    max_person=8;
                    sig_person=8;
                    break;
                case "B":
                    precio = 30;
                    max_person=6;
                    sig_person=8;
                    break;
                case "C":
                    precio = 20;
                    max_person=4;
                    sig_person=5;
                    break;
                case "D":
                    precio = 10;
                    max_person=2;
                    sig_person=5;
                    break;
                default:
                   break;
            }
            /*
            if (n_personas > max_person){
                total = (max_person*precio) + ((n_personas-max_person)*sig_person);
            } else {
                total = n_personas*precio;
            }
            */
            total = (n_personas > max_person ? (max_person*precio) + ((n_personas-max_person)*sig_person) : n_personas*precio);

            System.out.println("El precio es de S/ " + total);
        }



}
