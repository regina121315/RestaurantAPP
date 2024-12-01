package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Menu;

public class RestaurantService {
    public List<Menu> rest = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addAdress1() {
        Menu iu = new Menu();
        System.out.println("Estas son las opciones de las ubicaciones, escriba la alcaldía más cercana a su domilicio");
        System.out.println("-----------------------");
        System.out.println("Álvaro Obregón");
        System.out.println("Azcapotzalco");
        System.out.println("Benito Juárez");
        System.out.println("Coyoacan");
        System.out.println("Cuajimalpa de Morelos");
        System.out.println("-----------------------");
        iu.setAdress(in.nextLine());//pruebas de arraylist
        rest.add(iu);
        System.out.println(rest);
    }

    public void addAdress2() {
        Menu q=new Menu();
        System.out.println("Estas son las opciones de las ubicaciones, escriba la alcaldía más cercana a su domilicio");
        System.out.println("-----------------------");
        System.out.println("Cuauhtémoc");
        System.out.println("Gustavo A. Madero");
        System.out.println("Iztacalco");
        System.out.println("Tlahuac");
        System.out.println("Miguel Hidalgo");
        System.out.println("-----------------------");
        q.setAdress(in.nextLine());//pruebas de arraylist
        rest.add(q);
        System.out.println(rest);
    }

    public void addAdress3() {
        Menu md=new Menu();
        System.out.println("Estas son las opciones de las ubicaciones, escriba la alcaldía más cercana a su domilicio");
        System.out.println("-----------------------");
        System.out.println("Magdalena Contreras");
        System.out.println("Venustiano Carranza");
        System.out.println("Iztapalapa");
        System.out.println("Xochimilco");
        System.out.println("Tlalpan");
        System.out.println("-----------------------");
        md.setAdress(in.nextLine());
        rest.add(md);
        System.out.println(rest);
    }

}
