package Semana3;

import java.util.Scanner;

/*
* Un  banco  paga  intereses  a  sus  clientes  por  un  monto  depositado  en  un  determinado
número de meses, según el siguiente cuadro:
*
1 – 12 --->3 %
13 – 24  --->5 %
25 a más --->7 %
*
Además  si  el  cliente  deposita  el  dinero  en  dólares  recibe  un  interés  adicional  del  2%.
Desarrolle un programa que muestre el monto total del interés ganado y el total a recibir al
retirar todo el dinero.
*
*
* */
public class S3_teoria_ToLowerCase_equals_if_s2_ejercicio0 {

    public static void main(String[] args) {

        int meses, factor_activador;
            factor_activador=0;
        double monto, interes, interes_mes, total;
        String moneda, terminacion_moneda;
        terminacion_moneda = "S/";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tiempo del deposito en meses:");
        meses = teclado.nextInt();

        System.out.println("Ingrese su tipo de moneda (soles o dolares):");
        moneda = teclado.next();
        moneda = moneda.toLowerCase();

        System.out.println("Ingrese el monto a depositar:");
        monto = teclado.nextDouble();

        if (meses>=1 && meses<=12){
            interes_mes = 0.03;
        }else if (meses>=13 && meses<=24){
            interes_mes = 0.05;
        }else if(meses>=25){
            interes_mes = 0.07;
        }else {
            interes_mes = 0;
        }

        if (moneda.equals("dolares")){
            factor_activador = 1;
            terminacion_moneda = "$";
        }

        total = monto + monto*(interes_mes + (0.02)*(factor_activador)) ;
        interes = total-monto;

        System.out.println("Su interes ganado: " + terminacion_moneda + interes);
        System.out.println("Su total acumulado: " + terminacion_moneda + total);


    }

}
/*
*  int meses;
        double monto, porctInt = 0, impInt, intAdic = 0, intTotal, impTotal;
        String tipoMon;
        Scanner scan = new Scanner(System.in);
        System.out.print("Meses ");
        meses = scan.nextInt();
        System.out.print("Monto ");
        monto = scan.nextDouble();
        System.out.print("Tipo MOneda:Soles-Dolares ");
        tipoMon = scan.next();
        // calculos
        if (meses >= 1 && meses <= 12)
            porctInt = 0.03;
        else {
            if (meses >= 13 && meses <= 24) {
                porctInt = 0.05;
            } else {
                if (meses >= 25)
                    porctInt = 0.07;
            }
        }
        impInt=monto * porctInt;
        tipoMon=tipoMon.toLowerCase();
        if(tipoMon.equals("soles"))
            intAdic=0;
        if(tipoMon.equals("dolares"))
            intAdic=0.02*monto;
        intTotal=impInt+intAdic;
        impTotal= monto + intTotal;

        // salida
        System.out.println("Monto "+monto+"\t"+tipoMon+"\n"+"Interes "+impInt+"\n"+"Int Adicional "+intAdic);
        System.out.println("Importe total "+impTotal);
*
* */



