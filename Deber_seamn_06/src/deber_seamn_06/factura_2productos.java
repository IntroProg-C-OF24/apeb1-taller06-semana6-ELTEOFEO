package deber_seamn_06;

import java.util.Scanner;

public class factura_2productos {

    public static void main(String[] args) {
        double p1, p2, env, d, imp, dt, desc, envS, tt, tp;
        desc = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("SI USTED COMPRA SOLO UN ASRTICULO INGRESAR EN UNO DE LOS SIGUIENTES PREGUNTAS 0");
        System.out.println("INGRESE EL VALOR DEL PRIMER PRODUCTO");
        p1 = teclado.nextDouble();
        System.out.println("INGRESE LE PRECIO DEL SEGUNDO PRODUCTO");
        p2 = teclado.nextDouble();
        System.out.println("INGRESE EL VALOR DEL ENVIO");
        env = teclado.nextDouble();
        d = p2 + p1;
        imp = d * 0.12;
        dt = imp + d;
        if (d > 5000) {
            desc = (dt * 0.2);
            envS = env * 0;
            tt = dt - desc;
            tp=tt+envS;
        } else {
            if (d > 1000) {
                desc = dt * 0.2;
                envS = env;
                tt = dt - desc + envS;
                tp=tt+envS;
            } else {
                desc = dt * 0.05;
                envS = env;
                tt = dt - desc;
                tp=tt+envS;
            }
        }
        System.out.println("==============================================================================================================================");
        System.out.println("SU PRDUCTO 1, SU VALOR ES DE:" + p1);
        System.out.println("SU PRDUCTO 2, SU VALOR ES DE:" + p2);
        System.out.println("SU SUBTOTAL; " + d);
        System.out.println("SU IVA ES DE: " + imp);
        System.out.println("SU SUBTOTAL+IVA; " + dt);
        System.out.println("SU DESCUNETO ES DE: " + desc);
        System.out.println("SU TOTTAL A PAGAR MENOS EL DESCUNETO ES DE: " + tt);
        System.out.println("SU GASTO DE ENVIO ES DE: " + envS);
        System.out.println("TOTAL A PAGAR: " + tp);
    }
}
