package Semana7;

public class S7_Funcion_Repetitiv {
    public static double redondeo(double num){
        num=Math.round(num*100)/100.0;
        return num;
    }
    public static void main(String[] args) {
        int n,categoria,sueldoBasico;double porctBonif,impBonif,sueldoTotal;
        n=15;  int cont=0;
        String cadena="Empleado sueldo básico    categoría    bonif    impBonif     sueldo total";

        while (cont<n){
            cont++;

            categoria=(int)(Math.random()*(5-1+1)+1);
            sueldoBasico=(int)(Math.random()*(3000-1500+1)+1500);

            switch(categoria){
                case 1:porctBonif=0.12;break;
                case 2:porctBonif=0.10;break;
                case 3:porctBonif=0.08;break;
                default: porctBonif=0.06;break;
            }

            impBonif = sueldoBasico*porctBonif;
            impBonif = redondeo(impBonif);
            sueldoTotal = sueldoBasico+impBonif;
            cadena = cadena + (cont+"\t"+sueldoBasico+"\t\t\t"+categoria+"\t"+porctBonif+"\t"+impBonif+"\t\t"
                    +sueldoTotal+"\n");
        }
        System.out.println(cadena);
    }


}
