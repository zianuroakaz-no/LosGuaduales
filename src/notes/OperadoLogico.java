package notes;

public class OperadoLogico {
    public static void main(String[] args) {

        // Operadores logicos &&, || , !

        int key = 3030;
        int keyUser = 3030;
        boolean validateKey = keyUser == key;

        String user = "Juan";
        String userUser = "Juan";

        boolean validateUser = userUser.equals(user);

        boolean validateCredentials = validateKey && validateUser;

        System.out.println("Inicia sesión: " + validateCredentials);
    }
}
