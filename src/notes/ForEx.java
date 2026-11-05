package notes;

import java.util.Scanner;

public class ForEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] pagos = new double[5];

        //añadir con scanner usando while
        int i = 0;
        while (i < 5) {
            System.out.print("Ingrese pago "+ (i+1)+": ");
            pagos[i] = sc.nextDouble();
            i++;
        }
        Scanner.NextLine();
        //imprimir los pagos usando for
        System.out.print("Ingrese pago ");
        for(i=0;i<pagos.length;i++){
            System.out.println("pago"+ (i+1)+": "+pagos[i]);
        }
        
        String []categorias = new String[5];

        //añadir usando for

        //imprimir usando foreach
    }
}
