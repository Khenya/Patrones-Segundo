package parcialFinal.e4Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor2  implements IServer{
    private List<User> users;

    public Servidor2() {
        users = new ArrayList<>();
    }

    public void showAllUsers() {
        for(User user : users) {
            user.showInfo();
        }
    }


    @Override
    public void serverUser(User user) {
        System.out.println("Añadiendo usuario: " + user.getNombre() + " al Servidor 2");
        users.add(user);
        System.out.println("Usuarios totales en el servidor 2: ");
        this.showAllUsers();
    }
    
}
