package zemana15;

public class libreria {

    private int cuadernos;
    private int Pen;
    private int Faber;
    private int Luxer;

    public libreria() {
        int cuadernos = 0;
        int Pen = 0;
        int Faber = 0;
        int Luxer = 0;
    }

    public void setCuadernos(int cuadernos) {
        this.cuadernos = cuadernos;

        if(cuadernos>4 && cuadernos<12){
            this.Luxer = (cuadernos)/4 ;
        }
        if(cuadernos>=12 && cuadernos<20){
            this.Faber = 2*((cuadernos)/4) ;
        }
        if(cuadernos>=20 ){
            this.Pen = 2*((cuadernos)/3) ;
        }
    }

    @Override
    public String toString() {
        return "libreria{" +
                "cuadernos=" + cuadernos +
                ", Pen=" + Pen +
                ", Faber=" + Faber +
                ", Luxer=" + Luxer +
                '}';
    }
}

