package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.User;

public class UserService {
    public List<User> usr = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    // Método para agregar un nuevo usuario
    public void iniciarSesion() {
        User usuario = new User();
        System.out.println("Ingrese su nombre:");
        usuario.setName(in.next());
        System.out.println("Ingrese su correo electrónico:");
        usuario.setEmail(in.next());
        System.out.println("Ingrese una contraseña:");
        usuario.setPassword(in.next());
        
        usr.add(usuario);
        System.out.println("Usuario agregado correctamente: " + usuario);
    }

    // Método para eliminar
    // public void eliminarRegistro() {
    //     System.out.println("Ingrese el nombre para eliminar el registro:");
    //     String name = in.nextLine();
    //     boolean encontrado = false;
        
        // Iterar sobre la lista de usuarios para encontrar el que coincida con el nombre
    //     for (User user : usr) {
    //         if (user.getName().equals(name)!!()) {
    //             usr.remove(user);  // Eliminar el usuario de la lista
    //             System.out.println("Usuario eliminado: " + user);
    //             encontrado = true;
    //             break;  
    //         }
    //     }

    //     if (!encontrado) {
    //         System.out.println("Nombre de usuario no encontrado.");
    //     }
    // }

    // Método para cerrar sesión
    public void cerrar() {
        System.out.println("Sesión cerrada.");
    }
}
