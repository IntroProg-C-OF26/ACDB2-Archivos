import java.io.File;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
public class Files_ProcesarNotas {
    public static void main(String[] args) {
        int m = 10, n = 3;
        String matrizNotasIN[][] = new String [m][n]; 
        String matrizNotasOUT[][] = new String [m][n]; 
        matrizNotasIN = leerArchivo_LlenarMatriz("NotasIn.csv", m, n);
        matrizNotasOUT = procesarNotaIn(matrizNotasIN, m, n);
        persistirResultados("NotasOut.csv",matrizNotasIN, matrizNotasOUT);
    }
    public static void persistirResultados(String nombreArchivoOut, String matrizNotasIN[][], String matrizNotasOUT[][]){
        try {
            Formatter fout = new Formatter(new File(nombreArchivoOut));
            fout.format("%s\n", "NOMBRES;NOTA1;NOTA2;PROMEDIO;SUPLE;ESTADO;");
            for (int i = 0; i < matrizNotasIN.length; i++) {
                for (int j = 0; j < matrizNotasIN[0].length; j++) {
                    fout.format("%s;", matrizNotasIN[i][j]);
                }
                for (int j = 0; j < matrizNotasOUT[0].length; j++) {
                    fout.format("%s;", matrizNotasOUT[i][j]);
                }
                fout.format("%s","\n");
            }
            fout.close();
        } catch (Exception e) {
        }
    }
    public static String [][] procesarNotaIn(String matrizNotasIN[][], int m, int n){
        String datosNotas[][] = new String[m][n];
        Random ale = new Random();
        for (int i = 0; i < matrizNotasIN.length; i++) {
            double n1 = Double.valueOf(matrizNotasIN[i][1]); //Double.parseDouble()
            double n2 = Double.valueOf(matrizNotasIN[i][2]);
            double promedio = ( n1 + n2 ) / 2;
            double suple = (promedio < 6.5) ? ale.nextDouble(10) : 0.0 ;
            String estado = (promedio >= 6.5) ? "APROBADO" : ( (suple >= 6.5) ? "APROBADO" : "REPROBADO" ) ;
            datosNotas[i][0] = String.valueOf(promedio);
            datosNotas[i][1] = String.valueOf(suple);
            datosNotas[i][2] = estado;
        }
        return datosNotas;
    }
            
    public static String [][] leerArchivo_LlenarMatriz(String nombreArchivo, int m, int n){
        String datosNotas[][] = new String[m][n];
        int i = 0;
        try {
            Scanner fin = new Scanner(new File(nombreArchivo));
            String linea; 
            linea = fin.nextLine();
            while(fin.hasNext()){
                linea = fin.nextLine();
                String datos [] = linea.split(";");
                datosNotas[i][0] = datos[0]; //Nombre est.
                datosNotas[i][1] = datos[1]; //Nota1.
                datosNotas[i][2] = datos[2]; //NOta2.
                i++;
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        return datosNotas;
    }
}
