package notes;

public class While {
    public static void main(String[] args) {

        System.out.println("Escena he venido a negocear");

        String negociar = "no";

        while (negociar.equals("no")) {

            System.out.println("Socio he venido a negociar");
            negociar = ValidadorDeTipos.validarString();
        }
    }
}
