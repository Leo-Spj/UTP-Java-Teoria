package zemana11;

public class arreglo_bidimensional {
    public static void main(String[] args) {
        char[][] m = new char[9][3];
        int centero = 97;
        for(int i=0;i<m.length;i++ ){
            for(int j=0;j<m[0].length;j++){
                m[i][j]=(char)centero;
                centero++;
            }
        }
        for(int i=0;i<m.length;i++ ){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");;
            }
            System.out.println("");
        }

    }
}
