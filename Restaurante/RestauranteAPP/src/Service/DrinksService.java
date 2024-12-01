package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Drinks;

public class DrinksService {
    public List<Drinks> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void mostarJugo() {
        Drinks b = new Drinks();
        System.out.println("Estos son las opciones de jugos en el menu");
        System.out.println("-----------------------");
        System.out.println("- Jugo de naranja");
        System.out.println("- Jugo de mango");
        System.out.println("- Jugo de piña");
        System.out.println("- Jugo de guayaba");
        System.out.println("- Jugo de maracuyá");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu eleccion");
        b.setJugo(sc.nextLine());
        ds.add(b);
        System.out.println(ds);
    }

    public void mostarAgua() {
        Drinks s = new Drinks();
        System.out.println("Estas son las opciones de agua en el menu");
        System.out.println("-----------------------");
        System.out.println("- Agua natural");
        System.out.println("- Agua mineral");
        System.out.println("- Agua de jamaica");
        System.out.println("- Agua de horchata");
        System.out.println("- Agua de limón con chía");
        System.out.println("- Agua de tamarindo");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu eleccion");
        s.setAgua(sc.nextLine());
        ds.add(s);
        System.out.println(ds);
    }

    public void mostarRefresco() {
        Drinks j = new Drinks();
        System.out.println("Estas son las opciones de refresco en el menu");
        System.out.println("-----------------------");
        System.out.println("- Coca Cola");
        System.out.println("- Pepsi");
        System.out.println("- Dr pepper");
        System.out.println("- Fanta de naranja");
        System.out.println("- Sprite");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu eleccion");
        j.setAgua(sc.nextLine());
        ds.add(j);
        System.out.println(ds);
    }
}