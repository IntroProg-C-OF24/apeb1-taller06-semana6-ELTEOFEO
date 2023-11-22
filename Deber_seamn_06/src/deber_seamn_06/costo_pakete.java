package deber_seamn_06;
import java.util.Scanner;
public class costo_pakete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pesoP;
        System.out.println("ingrese el peso del pakete: ");
        System.out.println("si es menor de 5kg |1|");
        System.out.println("si se encuentra entre 5kg y 10kg|2|");
        System.out.println("si es mayor a 5kg|3|");
        pesoP = teclado.nextInt();
        switch (pesoP) {
            case 1:
                System.out.println("local, costo de 5$");
            case 2:
                System.out.println("nacional, costo 10$");
            default:
                System.out.println("costo de 15$");
        }
    }
}
