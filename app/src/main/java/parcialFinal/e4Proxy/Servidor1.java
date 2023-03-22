package parcialFinal.e4Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServer{
    
    private List<User> users;

    public Servidor1() {
        users = new ArrayList<>();
    }

    public void showAllUsers() {
        for(User usuario : users) {
            usuario.showInfo();
        }
    }


    @Override
    public void serverUser(User usuario) {

        System.out.println("Añadiendo usuario: " + usuario.getNombre() + " al Servidor 1");
        users.add(usuario);
        System.out.println("Usuarios totales del servidor 1: ");
        this.showAllUsers();
    }
    
}
