package PC3.pregunta4;

public class indexAlumnos {
    public static void main(String[] args) {

        cAlumnoNotas[] alumnos = new cAlumnoNotas[5];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new cAlumnoNotas();
            alumnos[i].setNotas(new double[]{
                    Math.round(Math.random() * (20-3+1) * 100.0) / 100.0,
                    Math.round(Math.random() * (20-3+1) * 100.0) / 100.0,
                    Math.round(Math.random() * (20-3+1) * 100.0) / 100.0,
                    Math.round(Math.random() * (20-3+1) * 100.0) / 100.0,
                    Math.round(Math.random() * (20-3+1) * 100.0) / 100.0
            });
        }

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }

        double promedio = 0;
        for (int i = 0; i < alumnos.length; i++) {
            promedio += alumnos[i].promedio();
        }

        System.out.println("Promedio de notas: "+promedio/alumnos.length);

        int mejorNota = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getNota3() > 10){
                mejorNota++;
            }
        }

        System.out.println("Cantidad de alumnos con mejor nota: "+mejorNota);

    }
}

