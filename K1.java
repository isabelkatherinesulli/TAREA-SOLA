import java.util.Scanner;
import java.util.Arrays;
public class K1 {
    Scanner esponja = new Scanner(System.in);
    String[] RECIEN_NACIDOS = {"PIJAMA 2 PIEZAS PARA RECIEN NACIDO BABY CIRCUS PANTALON", "PIJAMA PARA RECIEN NACIDO ENTERIZO BABY CIRCUS MAMA", "MANTA PARA RECIEN NACIDO BABY CIRCUS"};

    String[] PERSONAJES_FAVORITOS = {"BARBIE POLO ROSADO NIÑA S/ 34.50", "SPIDERMAN POLO NEGRO NIÑO S/ 34.50", "KUNFU PANDA POLO CELESTE NIÑO 34.50"};

    String[] ZAPATOS = {"zapato de cuero escolar varon S/ 70.00", "zapato de cuero escolar mujer S/ 65.00", "zapatillas deportivas S/ 120.00"};

    double[] precio = {34.50, 34.50, 34.50, 70.00, 65.00, 120.00};  
    double igv, subtotal, totalpagar;
    int[] carrito = new int[RECIEN_NACIDOS.length];
    int[] carrito_PERSONAJES = new int[PERSONAJES_FAVORITOS.length];
    int[] carrito_ZAPATOS = new int[ZAPATOS.length];
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
        System.out.println(" 1.- RECIEN NACIDOS");
        System.out.println(" 2.- PERSONAJES FAVORITOS");
        System.out.println(" 3.- ZAPATOS");

        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                ComprarNACIDOS();
                break;
            case 2:
                ComprarPERSONAJES();
                break;
            case 3:
                ComprarZAPATOS();
                break;
            case 4:
                MenuPrincipal();
                break;
            default:
                System.out.println("Opción no válida");
                MenuPrincipal();
                break;
        }
    }
    public void ComprarNACIDOS() {
        System.out.println("Elige una opción:");
        for (int i = 0; i < RECIEN_NACIDOS.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + RECIEN_NACIDOS[i]);
        }
        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Qué color desea comprar?");
                System.out.println("1. Rosado S/ 34.50");
                System.out.println("2. Amarillo S/ 34.50");
                System.out.println("3. Blanco S/ 34.50");
                int opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[0] += cantidad;
                System.out.println("Ha pedido " + carrito[0] + " de " + RECIEN_NACIDOS[0]);
                PagoMenus();
                break;
            case 2:
                System.out.println("¿Qué color desea comprar?");
                System.out.println("1. Rosado S/ 34.50");
                System.out.println("2. Celeste S/ 34.50");
                System.out.println("3. Amarillo S/ 34.50");
                opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[1] += cantidad;
                System.out.println("Ha pedido " + carrito[1] + " de " + RECIEN_NACIDOS[1]);
                PagoMenus();
                break;
            case 3:
                System.out.println("¿Qué color desea comprar?");
                System.out.println("1. Blanco S/ 34.50");
                System.out.println("2. Negro S/ 34.00");
                System.out.println("3. Celeste S/ 34.00");
                opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[2] += cantidad;
                System.out.println("Ha pedido " + carrito[2] + " de " + RECIEN_NACIDOS[2]);
                PagoMenus();
                break;
            default:
                System.out.println("Opción no válida");
                MenuPrincipal();
                break;
        }
    }
    public void ComprarPERSONAJES() {
        System.out.println("Elige una opción:");
        for (int i = 0; i < PERSONAJES_FAVORITOS.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + PERSONAJES_FAVORITOS[i]);
        }
        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿Qué color desea comprar?");
                System.out.println("1. Rosado S/ 34.50");
                System.out.println("2. Amarillo S/ 34.50");
                System.out.println("3. Blanco S/ 34.50");
                int opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[0] += cantidad;

                System.out.println("Ha pedido " + carrito[0] + " de " + PERSONAJES_FAVORITOS[0]);
                PagoMenus();
                break;
            case 2:
                System.out.println("¿Qué color desea comprar?");
                System.out.println("1. Rosado S/ 34.50");
                System.out.println("2. Celeste S/ 34.50");
                System.out.println("3. Amarillo S/ 34.50");
                opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[1] += cantidad;
                System.out.println("Ha pedido " + carrito[1] + " de " + PERSONAJES_FAVORITOS[1]);
                PagoMenus();
                break;
            case 3:
                System.out.println("¿Qué color desea comprar?");
                System.out.println("1. Blanco S/ 34.50");
                System.out.println("2. Negro S/ 34.00");
                System.out.println("3. Celeste S/ 34.00");
                opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[2] += cantidad;
                System.out.println("Ha pedido " + carrito[2] + " de " + PERSONAJES_FAVORITOS[2]);
                PagoMenus();
                break;
            default:
                System.out.println("Opción no válida");
                MenuPrincipal();
                break;
        }
    }
    public void ComprarZAPATOS() {
        System.out.println("Elige una opción:");
        for (int i = 0; i < ZAPATOS.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + ZAPATOS[i]);
        }
        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("¿QUE TALLA DESEA?");
                System.out.println("1. TALLA 32");
                System.out.println("2. TALLA 30");
                System.out.println("3. TALLA 34");
                int opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[0] += cantidad;

                System.out.println("Ha pedido " + carrito[0] + " de " + ZAPATOS[0]);
                PagoMenus();
                break;
            case 2:
                System.out.println("¿QUE TALLA DESEA ?");
                System.out.println("1. TALLA 30");
                System.out.println("2. TALLA 32");
                System.out.println("3. TALLA 34");
                opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[1] += cantidad;
                System.out.println("Ha pedido " + carrito[1] + " de " + ZAPATOS[1]);
                PagoMenus();
                break;
            case 3:
                System.out.println("¿QUE TALLA DESEA?");
                System.out.println("1. TALLA 30");
                System.out.println("2. TALLA 32");
                System.out.println("3. TALLA 34");
                opcionColor = esponja.nextInt();
                esponja.nextLine();
                System.out.println("¿Cuántos desea comprar?");
                cantidad = esponja.nextInt();
                esponja.nextLine();
                carrito[2] += cantidad;
                System.out.println("Ha pedido " + carrito[2] + " de " + ZAPATOS[2]);
                PagoMenus();
                break;
            default:
                System.out.println("Opción no válida");
                MenuPrincipal();
                break;
        }
    }
    public void PagoMenus() {
        double subtotalRECIEN = Arrays.stream(carrito).sum() * precio[0];
        double subtotalPERSONAJES = Arrays.stream(carrito_PERSONAJES).sum() * precio[1];
        double subtotalZAPATOS = Arrays.stream(carrito_ZAPATOS).sum() * precio[2];

        double subtotalTotal = subtotalRECIEN + subtotalPERSONAJES + subtotalZAPATOS;
        igv = subtotalTotal * 0.18;
        totalpagar = subtotalTotal + igv;

        System.out.println("Subtotal RECIEN NACIDOS: S/ " + subtotalRECIEN);
        System.out.println("Subtotal PERSONAJES FAVORITOS: S/ " + subtotalPERSONAJES);
        System.out.println("Subtotal ZAPATOS: S/ " + subtotalZAPATOS);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal Total: S/ " + subtotalTotal);
        System.out.println("IGV : S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);

        System.out.println("seleccione tipo de pago11");
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
            case "3":
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
        K1 app = new K1();
        app.fCUENTA();
    }
}