package deber_seamn_06;
import java.util.Scanner;
public class oprecion_mate {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("ingrese su numero para generar una operacion matematica [1...4  ]");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("suma");
                break;
            case 2:
                System.out.println("resta");
                break;
            case 3:
                System.out.println("division");
                break;
            case 4:
                System.out.println("multiplicacion");

                break;
            default:
                System.out.println("ingrese un numero del 1 a 4");
        }
    }
}
