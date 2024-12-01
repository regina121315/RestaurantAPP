package UI;

import java.util.Scanner;

public class DrinksMenu extends Service.DrinksService {

    public void mostarBebidas() {
        int a;
        Scanner op = new Scanner(System.in);
        System.out.println("Opciones disponibles de bebidas en el menu");
        System.out.println("-----------------------");
        System.out.println("1.- Jugos");
        System.out.println("2.- Aguas");
        System.out.println("3.- Refresco");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu opcion");
        a = op.nextInt();
        op.close();

        switch (a) {
            case 1:
                mostarJugo();
                break;
            case 2:
                mostarAgua();
                break;
            case 3:
                mostarRefresco();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}