import java.io.File;
import java.util.Scanner;
public class Files_ProcesarNotas {
    public static void main(String[] args) {
        int m = 10, n = 3;
        String matrizNotasIN[][] = new String [m][n]; 
        matrizNotasIN = leerArchivo_LlenarMatriz("NotasIn.csv", m, n);
    }
    public static String [][] leerArchivo_LlenarMatriz(String nombreArchivo, int m, int n){
        String datosNotas[][] = new String[m][n];
        try {
            Scanner fin = new Scanner(new File(nombreArchivo));
            String linea; 
            linea = fin.nextLine();
            while(fin.hasNext()){
                linea = fin.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        
        return datosNotas;
    }
}
