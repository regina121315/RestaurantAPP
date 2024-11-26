package UI;

import java.util.Scanner;

public class Sesion extends Service.UserService {// si no tiene el public, en App marca error

    public void mostrarMenu() {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("1:Iniciar Sesion");
        // System.out.println("2:Eliminar registro");
        System.out.println("0:Cerrar sesion");
        num = sc.nextInt();

        switch (num) {
            case 1:
                iniciarSesion();
                break;

            // case 2:
            // eliminarRegistro();
            // break;
            case 0:
                cerrar();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}