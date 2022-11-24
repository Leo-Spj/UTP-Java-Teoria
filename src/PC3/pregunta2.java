package PC3;
/*
* Desarrollar una función, que reciba como parámetro una matriz de números enteros.

Obtener el promedio de los números pares de la matriz.

La función debe devolver dicho promedio (con 4 decimales).*/

public class pregunta2 {

    public static void main(String[] args) {
        int[][] matriz = {{1,22,3,4,5},{6,7,8,32,10},{11,12,13,16,18}};
        System.out.println("Prom n pares: " + promedioPares(matriz));

    }

    public static double promedioPares(int[][] matriz){
        double promedio = 0;
        int contador = 0;
        //recorro la matriz
        for (int i = 0; i < matriz.length; i++) {
            //recorro el arreglo
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]%2==0){
                    promedio += matriz[i][j];
                    contador++;
                }
            }
        }
        return Math.round(promedio/contador*10000)/10000.0;
    }
}
