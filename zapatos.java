import java.util.Scanner;
import java.util.Arrays;
public class zapatos {
    Scanner esponja = new Scanner(System.in);

    String[][] categorias = {
            {"ZATILLAS ADIDAS mujer", "ZAPATILLAS NIKE mujer"},
            {"ZAPATILLAS PUMA hombre", "ZAPATILLAS NIKE hombre", "ZAPATILLAS ADIDAS hombre"},
            {"ZAPATILLAS ADIDAS niño", "ZAPATILLAS PUMA niño", "ZAPATILLAS NIKE niño"},
            {"ZAPATILLAS NIKE mujer", "ZAPATILLAS NYHOPHY mujer", "ZAPATILLAS JORDAN mujer"}
    };

    double[][] precios = {
            {139.00, 119.00, 101.93},
            {65.96, 129.00, 239.00},
            {159.00, 129.00, 39.97}
    };

    double igv, subtotal, totalpagar;
    int[] carrito = new int[categorias[1].length];
    int opcion, cantidad;
    String metodo_pago, NOMBRE, DNI, clave;

    public String fCUENTA() {
        String correo = "", correo_in, contraseña, contraseña_in, nombre;
        boolean InicioSesion = false;
        while (!InicioSesion) {
            System.out.println("----<<<<<BIENVENIDOS A OECHSLE>>>>>----");
            System.out.println("REGISTRAR CUENTA");
            System.out.println("Ingrese su correo:");
            correo = esponja.nextLine();
            System.out.println("Ingrese su nombre:");
            nombre = esponja.nextLine();
            System.out.println("Ingrese su contraseña:");
            contraseña = esponja.nextLine();
            System.out.println("INICIAR SESION");
            System.out.println("Ingrese su correo:");
            correo_in = esponja.nextLine();
            System.out.println("Ingrese su contraseña:");
            contraseña_in = esponja.nextLine();
            if (correo.equals(correo_in) && contraseña.equals(contraseña_in)) {
                System.out.println("Bienvenido: " + nombre);
                System.out.println("Inicio de sesión exitoso");
                MenuPrincipal();
                InicioSesion = true;
            } else {
                System.out.println("VUELVA A INTENTARLO");
            }
        }
        return correo;
    }

    public void MenuPrincipal() {
        System.out.println("-----------BIENVENIDOS A OECHSLE-----------");
        System.out.println("ENCUENTRA TU STOCK FAVORITO AQUI");
        System.out.println("TENEMOS EN:");
        System.out.println(" 1.- ZAPATILLAS HOMBRE");
        System.out.println(" 2.- ZAPATILLLAS NIÑOS");
        System.out.println(" 3.- ZAPATILLAS MUJER");

        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                ComprarProductos(1);
                break;
            case 2:
                ComprarProductos(2);
                break;
            case 3:
                ComprarProductos(3);
                break;
            default:
                System.out.println("Opción no válida");
                MenuPrincipal();
                break;
        }
    }

    public void ComprarProductos(int categoria) {
        System.out.println("Elige una opción:");
        for (int i = 0; i < categorias[categoria].length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + categorias[categoria][i]);
        }
        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
            case 2:
            case 3:
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[opcion - 1] += cantidad;
                System.out.println("Ha pedido " + carrito[opcion - 1] + " de " + categorias[categoria][opcion - 1]);
                PagoMenus();
                break;
            default:
                System.out.println("Opción no válida");
                MenuPrincipal();
                break;
        }
    }

    public void PagoMenus() {
        double subtotalTotal = 0;
        for (int i = 0; i < carrito.length; i++) {
            subtotalTotal += carrito[i] * precios[i][opcion - 1];
        }

        igv = subtotalTotal * 0.18;
        totalpagar = subtotalTotal + igv;

        System.out.println("Subtotal: S/ " + subtotalTotal);
        System.out.println("IGV: S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);

        System.out.println("Seleccione tipo de pago:");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. Efectivo");
        metodo_pago = esponja.nextLine();

        switch (metodo_pago) {
            case "1":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("Ingrese su clave:");
                clave = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "2":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            default:
                System.out.println("Opción no válida");
                PagoMenus();
                break;
        }
    }

    public static void main(String[] args) {
        zapatos app = new zapatos();
        app.fCUENTA();
    }
}