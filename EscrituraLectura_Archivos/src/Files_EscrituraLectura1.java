
import java.io.File;
import java.util.Formatter;
import java.util.Random;

public class Files_EscrituraLectura1 {
    public static void main(String[] args) {
        Random ale = new Random();
        String nomb [] = {"Tomas","Erick","Renata","Daniela"};
        String apel [] = {"Cordova","Ruiz","Alvarado","Perez"};
        try {
            Formatter fout = new Formatter(new File("NotasIn.csv"));
            fout.format("%s\n","NOMB;NOTA1;NOTA2;PROMEDIO;ESTADO");
            for (int i = 1; i <= 1000000; i++) {
                fout.format("%s;%d;%d\n", nomb[ale.nextInt(4)] + " " + apel[ale.nextInt(4)],
                                        ale.nextInt(11), ale.nextInt(11));
            }
            fout.close();
        } catch (Exception e) {
            System.out.println("Error de división para cero");
        }
    }
}
