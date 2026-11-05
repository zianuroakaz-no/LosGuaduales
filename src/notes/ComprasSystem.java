package notasdelogica;

import java.util.Scanner;

public class ComprasSystem {

    static String [] productos = new String[5];
    static double [] precios = new double[5];

    public static void main(String[] args) {
        menuCompras();
    }

    public static void agregarProductos(){
        // logica para agregar productos al arreglo con while

        int i=0;
        while (productos.length < 5){
            System.out.print("Ingrese producto: " + i);
            productos[i] = sc.nextLine();

            i++;
        }


    }


    public static void agregarPrecios(){
        // logica para agregar productos al arreglo con while
    }

    public static void mostrarProductos(){
        // logica para agregar productos al arreglo con while

        for(int i=0;i<productos.length;i++){
            System.out.println("producto" + i + ": " + productos[i]) ;
        }

    }

    public static void mostrarPrecios(){
        // logica para agregar productos al arreglo con while

        for(double precio:precios){
            System.out.println("precio: $" + precio);
        }
    }

    public static double calcularTotal(){
        // logica para agregar productos al arreglo con while
        return 0;
    }
    public static void actualizarProducto (int i){


    }

    public static void actualizaPrecio(int i){

    }

    public static void mostrarTablaProductoPrecio(){
    }


    public static void menuCompras(){
        // crear un menu con opciones para agregar productos, mostrar productos, calcular total y salir del programa

        System.out.println("Iniciar aplicacion presionando 1");

        int init = sc.nextInt();
        sc.nextline();

        while (init !=0){

            System.out.print("""
                    Selecione:
                    1.Agregar Producto
                    2.Agregar Precio
                    3.Mostrar Productos
                    4.Mostrar Precios
                    5.Calcular Total
                    6.Salir
                    """);

            int option = sc.nextLine();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Agregar Producto");
                    agregarPrecios();
                    break;
                case 2:
                    System.out.println("Agregar Precio");
                    agregarPrecios();

                case 3:
                    System.out.println("mostrar producto");
                    mostrarPrecios();
                    break;
                    case 4:
                        System.out.println("Mostrar Precios");
                        break;
                    case 6:
                        System.out.println("Salir");
                        init = 0;
                        break;
                default:
                    System.out.print("selecione una opcion valida");
            }
        }
    }
}
