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
                String datos [] = linea.split(";");
                System.out.println(datos.length);
                datosNotas[i][0] = datos[0]; //Nombre est.
                datosNotas[i][1] = datos[1]; //Nota1.
                datosNotas[i][2] = datos[2]; //NOta2.
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        
        return datosNotas;
    }
}
