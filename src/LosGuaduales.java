import java.util.Scanner;

    public class LosGuaduales {

        static Scanner teclado = new Scanner(System.in);

        // Muestra el menú principal
        public static void mostrarMenu() {
            System.out.println(" LOS GUADUALES - CONTROL DE AGUA ");
            System.out.println("1. Registrar consumo de un apartamento");
            System.out.println("2. Consultar factura de un apartamento");
            System.out.println("3. Ver reporte general del conjunto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
        }

        // Valida que el apartamento esté entre 1 y 6
        public static int pedirApartamento() {
            int apartamento;

            System.out.print("Ingrese el número de apartamento (1 a 6): ");
            apartamento = teclado.nextInt();

            while (apartamento < 1 || apartamento > 6) {
                System.out.println("Número de apartamento inválido.");
                System.out.print("Ingrese el número de apartamento (1 a 6): ");
                apartamento = teclado.nextInt();
            }

            return apartamento;
        }

        // Registra o reemplaza el consumo de un apartamento
        public static void registrarConsumo(double[] consumos) {

            int apartamento;
            double consumo;

            apartamento = pedirApartamento();

            System.out.print("Ingrese el consumo en m³: ");
            consumo = teclado.nextDouble();

            while (consumo <= 0) {
                System.out.println("El consumo debe ser mayor que 0.");
                System.out.print("Ingrese el consumo en m³: ");
                consumo = teclado.nextDouble();
            }

            // Restamos 1 porque el arreglo empieza en posición 0
            consumos[apartamento - 1] = consumo;

            System.out.println("Consumo registrado correctamente.");
        }

        // Consulta la factura de un apartamento
        public static void consultarFactura(double[] consumos) {

            int apartamento;

            apartamento = pedirApartamento();

            if (consumos[apartamento - 1] == 0) {
                System.out.println(
                        "El apartamento " + apartamento + " no tiene consumo registrado"
                );
            } else {
                imprimirFactura(apartamento, consumos[apartamento - 1]);
            }
        }

        // Calcula e imprime la factura
        public static void imprimirFactura(int apartamento, double consumo) {

            double tarifa;
            double valorConsumo;
            double cargoFijo = 12000;
            double subtotal;
            double recargo = 0;
            double total;

            // Determinar la tarifa
            if (consumo <= 10) {
                tarifa = 3000;
            } else if (consumo <= 20) {
                tarifa = 4500;
            } else {
                tarifa = 6000;
            }

            // Calcular valor del consumo
            valorConsumo = consumo * tarifa;

            // Calcular subtotal
            subtotal = cargoFijo + valorConsumo;

            // Aplicar recargo si supera 25 m³
            if (consumo > 25) {
                recargo = subtotal * 0.10;
            }

            // Calcular total
            total = subtotal + recargo;

            System.out.println("FACTURA ");
            System.out.println("Apartamento: " + apartamento);
            System.out.println("Consumo: " + consumo + " m³");
            System.out.println("Tarifa aplicada: $" + tarifa + " por m³");
            System.out.println("Valor del consumo: $" + valorConsumo);
            System.out.println("Cargo fijo: $" + cargoFijo);
            System.out.println("Recargo: $" + recargo);

            if (consumo > 25) {
                System.out.println("ALERTA: consumo excesivo");
            }

            System.out.println("TOTAL A PAGAR: $" + total);

        }

        // Genera el reporte general del conjunto
        public static void generarReporte(double[] consumos) {

            double consumoTotal = 0;
            double consumoPromedio;
            double mayorConsumo = 0;

            int apartamentoMayor = 0;
            int apartamentosRegistrados = 0;
            int apartamentosSinRegistro = 0;
            int consumosExcesivos = 0;

            // Recorrer el arreglo
            for (int i = 0; i < consumos.length; i++) {

                if (consumos[i] > 0) {

                    // Acumular consumo
                    consumoTotal += consumos[i];

                    // Contar registrados
                    apartamentosRegistrados++;

                    // Buscar mayor consumo
                    if (consumos[i] > mayorConsumo) {
                        mayorConsumo = consumos[i];
                        apartamentoMayor = i + 1;
                    }

                    // Contar consumos mayores a 25 m³
                    if (consumos[i] > 25) {
                        consumosExcesivos++;
                    }

                } else {
                    // No tiene consumo registrado
                    apartamentosSinRegistro++;
                }
            }

            // Si no hay ningún apartamento registrado
            if (apartamentosRegistrados == 0) {
                System.out.println("Aún no hay consumos registrados");
                return;
            }

            // Calcular promedio
            consumoPromedio = consumoTotal / apartamentosRegistrados;

            System.out.println("REPORTE GENERAL ");
            System.out.println("Consumo total del conjunto: "
                    + consumoTotal + " m³");

            System.out.println("Consumo promedio: "
                    + consumoPromedio + " m³");

            System.out.println("Apartamento con mayor consumo: "
                    + apartamentoMayor);

            System.out.println("Consumo del apartamento con mayor consumo: "
                    + mayorConsumo + " m³");

            System.out.println("Apartamentos sin registro: "
                    + apartamentosSinRegistro);

            System.out.println("Apartamentos con consumo excesivo: "
                    + consumosExcesivos);

        }

        // Programa principal
        public static void main(String[] args) {

            // Arreglo de 6 posiciones
            double[] consumos = new double[6];

            int opcion;

            // Menú que se repite hasta seleccionar 4
            do {

                mostrarMenu();
                opcion = teclado.nextInt();

                switch (opcion) {

                    case 1:
                        registrarConsumo(consumos);
                        break;

                    case 2:
                        consultarFactura(consumos);
                        break;

                    case 3:
                        generarReporte(consumos);
                        break;

                    case 4:
                        System.out.println("Programa finalizado.");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } while (opcion != 4);

            teclado.close();
        }
    }


