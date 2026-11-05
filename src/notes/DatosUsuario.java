package notes;

import java.util.Scanner;

public class DatosUsuario {

    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String[][] usuarios = new String[4][6];

        String[] datos = {
                "id",
                "Nombre",
                "Apellido",
                "Email",
                "Phone",
                "password"
        };

        for (int i = 0; i < 4; i++) {
            System.out.print("\nUsuario " + (i + 1));

            for (int j = 0; j < 6; j++) {
                System.out.print(datos[j] + ": ");
                usuarios[i][j] = sc.next();
            }
        }
            System.out.println("\n--- Lista de usuarios ---");

            for (int i = 0 ; i < 4; i++)
                System.out.println("\nUsuario " + (i + 1));
            for (int j = 0 ; j < 6; j++)
            {
                System.out.println(datos[j]+ ": " + usuarios[i][j]);
            }

        }
    }

