import java.util.InputMismatchException;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n1, n2, respuesta;
        System.out.print("Deme 2#: ");
        try {
            n1 = tcl.nextInt();
            n2 = tcl.nextInt();
            respuesta = n1 / n2;
            System.out.println("Espuesta = " + respuesta);
        } catch (InputMismatchException e) {
            System.out.println("ERROR DE INGRESO DE DATOS");
        } catch (ArithmeticException e) {
            System.out.println("ERROR MATEMATICO DIVISION PARA CERO");
        }
    }
}
