package notes;

import java.util.Scanner;

public class ExLogin {
    public static void main(String[] args) {

        String Username;
        String Password;
        String UserInput;
        String PasswordInput;

        Username = "Julivillada";
        Password = "1234";
        UserInput = "Julivillada";
        PasswordInput = "1234";

        if (Username.equals(UserInput) && Password.equals(PasswordInput)) {
            System.out.println("Credenciales validas");
    } else { System.out.println("Credenciales invalidas");
        }
    }
}
