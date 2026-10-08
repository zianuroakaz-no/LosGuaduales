package notes;

import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso");

        float peso = sc.nextFloat();

        System.out.println("Ingrese su altura");

        float altura = sc.nextFloat();

        float imc = Math.round (peso/(altura*altura));


        if (imc<18.5){ System.out.println("bajo peso " + imc);}

        else if (imc>=18.5 && imc<25){ System.out.println("normal " + imc);}

        else if (imc>=25 && imc<30){ System.out.println("Sobrepeso " + imc);}

        else if (imc>30){ System.out.println("obesidad " + imc);}
    }
}
