package UI;

import java.util.Scanner;

public class CymbalsMenu extends Service.CymbalssService {

    public void mostarBebidas() {
        int a;
        Scanner op = new Scanner(System.in);
        System.out.println("Opciones disponibles de Platillos en el menu");
        System.out.println("-----------------------");
        System.out.println("1.- carnes");
        System.out.println("2.- pollos");
        System.out.println("3.- pescados");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu opcion");
        a = op.nextInt();
        op.close();

        switch (a) {
            case 1:
                mostrarPlatillodecarne();
                break;
            case 2:
                mostrarplatillosdepollo();
                break;
            case 3:
                mostrarplatillosdepesacado();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}