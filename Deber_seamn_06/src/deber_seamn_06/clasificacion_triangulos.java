package deber_seamn_06;
import java.util.Scanner;
public class clasificacion_triangulos {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la base del triangulo");
        a = teclado.nextDouble();
        System.out.println("ingrese el lado del triangulo");
        b = teclado.nextDouble();
        System.out.println("ingrese el lado del triangulo");
        c = teclado.nextDouble();
        d = b+c;
        if (d<a)
            System.out.println("no es un triangulo");
        else
            if (b==c)
                if(b==a)
                    System.out.println("es equilatero");
                else 
                        System.out.println("es escaleno");   
    }
}
