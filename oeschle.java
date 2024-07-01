import java.util.Scanner;

public class oeschle {
    Scanner scanner = new Scanner(System.in);
    private String nombre, apellido, dni;
    private int opcion;
    private double totalAcumulado = 0.0;

    String[] televisor = new String[]{"TELEVISOR - SAMSUNG AI TV ", "PAGO EN EFECTIVO", "TARJETA", "1169.90"};
    String[] celular = new String[]{"CELULAR - REDMI ", "PAGO EN EFECTIVO", "TARJETA", "995.95"};
    String[] tablet = new String[]{"TABLET - GALAXY TAB 6 ", "PAGO EN EFECTIVO", "TARJETA", "1,149.00"};
    String[] laptop = new String[]{"LAPTOP - LENOVO", "PAGO EN EFECTIVO", "TARJETA", "2,199.00"};
    String[] laptopgamer = new String[]{"LATOP GAMER - HP OMEN ", "PAGO EN EFECTIVO", "TARJETA", "6,299.00"};

    public void fDatosCliente() {
        System.out.println("Ingrese sus Datos Completos");
        System.out.println("Nombres:");
        nombre = scanner.nextLine();
        System.out.println("Apellidos:");
        apellido = scanner.nextLine();
        System.out.println("DNI:");
        dni = scanner.nextLine();
        this.fMenuPrincipal();
    }

    public void fMenuPrincipal() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido " + nombre + " " + apellido);
            System.out.println("ESCOGE ENTRE ESTAS OPCIONES");
            System.out.println("1: TELEVISOR - SAMSUNG AI TV - S/ " + televisor[3]);
            System.out.println("2: CELULAR - REDMI - S/ " + celular[3]);
            System.out.println("3: TABLET - GALAXY TAB 6 - S/ " + tablet[3]);
            System.out.println("4: LAPTOP - LENOVO - S/ " + laptop[3]);
            System.out.println("5: LAPTOP GAMER - HP OMEN - S/ " + laptopgamer[3]);
            System.out.println("6: FINALIZAR PEDIDO");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    this.mostrarSubMenu(televisor);
                    break;
                case 2:
                    this.mostrarSubMenu(celular);
                    break;
                case 3:
                    this.mostrarSubMenu(tablet);
                    break;
                case 4:
                    this.mostrarSubMenu(laptop);
                    break;
                case 5:
                    this.mostrarSubMenu(laptopgamer);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("El total a pagar por todos los pedidos es: " + totalAcumulado);
                    System.out.println("Gracias por su compra. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public void mostrarSubMenu(String[] opciones) {
        System.out.println(opciones[0]);
        System.out.println("1: " + opciones[1]);
        System.out.println("2: " + opciones[2]);
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                Pedido(Double.parseDouble(opciones[3]), opciones[1]);
                break;
            case 2:
                Pedido(Double.parseDouble(opciones[3]), opciones[2]);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public void Pedido(double precio, String tipo) {
        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        double total_pagar = precio * cantidad;

        System.out.println("¿Desea pedir algo más? (SI/NO)");
        String respuesta = scanner.nextLine();

        if (!respuesta.equalsIgnoreCase("SI")) {
            totalAcumulado += total_pagar;
            System.out.println("EL TOTAL A PAGAR POR ESTE PEDIDO ES: " + total_pagar);
            System.out.println("El total a pagar por todos los pedidos es: " + totalAcumulado);
            System.out.println("Gracias por su compra. ¡Hasta luego!");
            System.exit(0);
        } else {
            totalAcumulado += total_pagar;
            System.out.println("EL TOTAL A PAGAR POR ESTE PEDIDO ES: " + total_pagar);
        }
    }

    public static void main(String[] args) {
        System.out.println("----BIENVENIDO A OESCHLE---");
        oeschle sponja = new oeschle();
        sponja.fDatosCliente();
    }
}