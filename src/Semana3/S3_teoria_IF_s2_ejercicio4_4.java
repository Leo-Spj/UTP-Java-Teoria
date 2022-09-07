package Semana3;
/*
sea una hora dado en el formato: hh:mm:ss. calcular lal hora que será dentro de un segundo.
11 02 40 + 1 = 11 02 41
*/

public class S3_teoria_IF_s2_ejercicio4_4 {
    public static void main(String[] args) {

        int hora, minuto, segundo;
        hora = (int)(Math.random()*24);
        minuto = (int)(Math.random()*60);
        segundo = (int)(Math.random()*60);
/*
        Scanner scan=new Scanner(System.in);
        System.out.print("Horas ");hora=scan.nextInt();
        System.out.print("Minutos ");minuto=scan.nextInt();
        System.out.print("Segundos ");segundo=scan.nextInt();
*/
        System.out.println("Hora: "+hora+":"+minuto+":"+segundo);

        segundo = segundo + 1;
        if(segundo == 60){
            segundo = 0;

            minuto = minuto + 1;
            if(minuto == 60){
                minuto = 0;

                hora = hora + 1;
                if(hora == 24){
                    hora = 0;
                }
            }
        }
        System.out.println("Hora: "+hora+":"+minuto+":"+segundo);
    }
}
