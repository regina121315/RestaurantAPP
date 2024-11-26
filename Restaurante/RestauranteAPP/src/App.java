import UI.Welcome;
import UI.Sesion;

public class App {
    public static void main(String[] args) {

        System.out.println("Inicia tu experiencia");
        System.out.println();
        Sesion hi = new Sesion();
        hi.mostrarMenu();

        System.out.println();
        
        System.out.println("Bienvenido a la App :)");
        Welcome hello = new Welcome();
        hello.inicio();

    }
}