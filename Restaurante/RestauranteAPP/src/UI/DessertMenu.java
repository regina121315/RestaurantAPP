package UI;

import java.util.Scanner;

public class DessertMenu extends Service.DessertService {

    public void mostarPostres() {
        int a;
        Scanner op = new Scanner(System.in);
        System.out.println("Opciones disponibles de Postres en el menu");
        System.out.println("-----------------------");
        System.out.println("1.- Helados");
        System.out.println("2.- Tartas");
            System.out.println("-----------------------");
        System.out.println("Ingresa tu opcion");
        a = op.nextInt();
        op.close();

        switch (a) {
            case 1:
            mostarHelado();
                break;
            case 2:
            mostarTarta();
                break;
                default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}