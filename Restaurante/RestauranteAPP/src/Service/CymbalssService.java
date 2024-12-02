package Service;

import Model.Cymbals;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CymbalssService {
    public List<Cymbals> ds = new ArrayList<>(); 
    Scanner sc = new Scanner(System.in);

    public void mostrarPlatillodecarne() { 
        Cymbals plato = new Cymbals(); 
        System.out.println("Estos son las opciones de platillos en el menu:");
        System.out.println("-----------------------");
        System.out.println("- Platillo de carne asada");
        System.out.println("- Platillo de carne al carbon");
        System.out.println("- Platillo de carne empanizada");
        System.out.println("- Platillo carne enchilada");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu eleccion:");
        plato.setCarne(sc.nextLine()); 
        ds.add(plato);
        System.out.println(ds);
    }

    public void mostrarplatillosdepollo() { 
      Cymbals pollo = new Cymbals();
        System.out.println("Estas son las opciones de helados en el menu:");
        System.out.println("-----------------------");
         System.out.println("- Platillo pollo asado");
         System.out.println("- Platillo pollo enchilado");
         System.out.println("- Platillo pollo empanizado");
         System.out.println("- Platillo pollo asado");
        System.out.println("-----------------------");
        System.out.println("Ingresa tu eleccion:");
        pollo.setPollo(sc.nextLine()); 
        ds.add(pollo);
        System.out.println(ds);
    }
    public void mostrarplatillosdepesacado() { 
        Cymbals pez = new Cymbals();
          System.out.println("Estas son las opciones de helados en el menu:");
          System.out.println("-----------------------");
           System.out.println("- Platillo pescado asado");
           System.out.println("- Platillo pescado a la parrilla");
           System.out.println("- Platillo pescado a la diabla");
           System.out.println("- Platillo pescado empanizado");
                    System.out.println("-----------------------");
          System.out.println("Ingresa tu eleccion:");
          pez.setPollo(sc.nextLine()); 
          ds.add(pez);
          System.out.println(ds);
      }
  }

