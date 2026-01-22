import java.io.File;
import java.util.Scanner;
public class Files_ProcesarNotas {
    public static void main(String[] args) {
        
    }
    public static String [][] leerArchivo_LlenarMatriz(String nombreArchivo, int m, int n){
        String datosNotas[][] = new String[m][n];
        try {
            Scanner fin = new Scanner(new File(nombreArchivo));
            String linea = fin.nextLine();
            System.out.println(linea);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        
        return datosNotas;
    }
}
