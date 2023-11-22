package deber_seamn_06;

import java.util.Scanner;

public class opera_mate {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;
        System.out.println("ingrese su numero");
        opcion = teclado.nextInt();
        switch (opcion) {

            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
                            default:
                System.out.println("ingrese un numero del 1 a 12");

        }
    }

}
