package Semana4;

import java.util.Scanner;

/*
* El  banco  “Pueblo  desconocido”  ha  decidido  aumentar  el  límite  de  crédito  de  las  tarjetas  de
crédito  de  sus  clientes,  para  esto  considera  que,  si  su  cliente  tiene  tarjeta  tipo  1,  el  aumento
será de 25 %; si tiene tipo 2, será de 35 %; si tiene tipo 3, de 40 %, y para cualquier otro tipo,
de  10  %.  Si  la  persona  tiene  deuda  con  el  banco  solo  se  le  dará  la  mitad  de  incremento,  si  es
que  es  cliente  1  o  2,  el  resto  no  tiene  incremento.  Realice  un  algoritmo  para  determinar  el
nuevo límite de crédito que tendrá una persona en su tarjeta.
* */

public class S4_teoria_Switch {

   public static void main(String[] args) {

      int tipo; double porctInc; String deuda;

      Scanner scan=new Scanner(System.in);

      System.out.print("Tipo "); tipo=scan.nextInt();
      System.out.print("Tiene deuda? (SI/NO ");
      deuda=scan.next();
      deuda=deuda.toUpperCase();


      switch(tipo){
         case 1: porctInc=0.25;
            break;
         case 2: porctInc=0.35;
            break;
         case 3: porctInc=0.40;
            break;
         default: porctInc=0.25;
      }

      if(deuda.equals("SI")){
         switch(tipo){
            case 1:
            case 2: porctInc=porctInc/2;
               break;
            default:porctInc=0;
         }
      }

      System.out.println("Porct Incremento "+porctInc);
   }

}
