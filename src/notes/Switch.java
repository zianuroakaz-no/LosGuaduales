package notes;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Seleccione 1. Cuenta de ahorro\n" +
                "2. Crédito\n" + "3. Inversión\n" +
                "4. Mis datos");

        int option = ValidadorDeTipos.validarEnteros();

        System.out.println(option);
        switch (option){
            case 1:
                System.out.println("Usted está en cuenta de ahorro");
                break;

                case 2:
                    System.out.println("Usted está en crédito");
                    break;

                    case 3:
                        System.out.println("Usted está en inversión");
                        break;

            case 4:
                System.out.println("Usted está en mis dato");
                break;
                        default:
                            System.out.println("Opción no válida");
        }
    }


}
