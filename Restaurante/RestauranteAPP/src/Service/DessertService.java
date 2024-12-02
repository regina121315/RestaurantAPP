package Service;

import Model.Dessert;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DessertService {
    public List<Dessert> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void mostarHelado() {
        Dessert b = new Dessert();
        System.out.println("Estos son las opciones de Helado en el menu");
        System.out.println("-----------------------");
        System.out.println("- Helado de chocolate");
        System.out.println("- Helado de vainilla");
        System.out.println("- Helado de fresas con crema");
        System.out.println("- Helado de galleta oreo");
               System.out.println("-----------------------");
        System.out.println("Ingresa tu eleccion");
        b.setHelado(sc.nextLine());
        ds.add(b);
        System.out.println(ds);
    }

    public void mostarTarta() {
        Dessert s = new Dessert();
        System.out.println("Estas son las opciones de Tarta en el menu");
        System.out.println("-----------------------");
        System.out.println("- Tarta mousse de chocolate y baileys");
        System.out.println("- Tarta de fresas con crema de vainilla");
        System.out.println("- Tarta Cheesecake de Nutella");
        System.out.println("- Tarta de chocolate");
        System.out.println("- Tarta de fresa");
        System.out.println("- Tarta de vainilla");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu eleccion");
        s.setTarta(sc.nextLine());
        ds.add(s);
        System.out.println(ds);
    }

}