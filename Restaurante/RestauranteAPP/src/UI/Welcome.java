package UI;

import java.util.Scanner;
import Service.RestaurantService;

public class Welcome extends RestaurantService {

    public void inicio() {
        int lol;
        Scanner s = new Scanner(System.in);
        
            System.out.println("Elegir el restaurante de tu preferencia");
            System.out.println("1:Casual Food ");
            System.out.println("2:Manuaw");
            System.out.println("3:Gino's");
            lol = s.nextInt();

            switch (lol) {
                case 1:
                    addAdress1();
                    break;

                case 2:
                    addAdress2();
                    break;
                case 3:
                    addAdress3();
                    ;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        
    }
}

// String us;
// Scanner sw = new Scanner(System.in);
// System.out.println("Nuestras opciones de restaurante son: KFC, House Toño,
// Donals");
// System.out.println();
// System.out.println("Escriba la opción del restaurante donde desea ordenar ");
// us = sw.next();
// /////////////////////////////////////////////
// System.out.println();
// System.out.println("Iztapalapa, Coapa, Azcapotzalco,Iztacalco");
// System.out.println();
// System.out.println("Ingrese la alcaldia mas cercana de su domicilio");//el
// domicilio hacerlo iterativo al usuario
// us = sw.next();

// }

// }
