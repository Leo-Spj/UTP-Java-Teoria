package PC3;
/*Desarrollar una un objeto que tenga por función para el siguiente caso:

La función recibe como parámetro un arreglo que contiene el
importe de las ventas diarias de manzanas de varios días.

Calcular las ventas totales y el promedio de ventas realizada.*/

//venta de manzanas en un objeto, que tiene por funcion el setVentas:
public class pregunta1 {
    private int[] ventas;
    private double promedio;
    private int total;

    public pregunta1() {
        this.ventas = new int[0];
        this.promedio = 0;
        this.total = 0;
    }
    public void setVentas(int[] ventas) {
        this.ventas = ventas;

        for (int i = 0; i < ventas.length; i++) {
            this.total += ventas[i];
        }

        this.promedio = this.total*(1.0) / ventas.length;

    }
    @Override
    public String toString() {
        return "ventas{" +
                "ventas=" + ventas +
                ", promedio=" + promedio +
                ", total=" + total +
                '}';
    }
}
