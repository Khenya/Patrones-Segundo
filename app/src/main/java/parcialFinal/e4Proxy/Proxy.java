package parcialFinal.e4Proxy;

public class Proxy implements IServer{

    private Servidor1 servidor1;
    private Servidor2 servidor2;

    public Proxy() {
        this.servidor1 = new Servidor1();
        this.servidor2 = new Servidor2();
    }

    @Override
    public void serverUser(User user) {

        System.out.println("************ autenticacion ************");

        // verifica si la pwd es mayor a 8 caracteres, si es asi lo añade al primer grupo si no al segundo 
        if(user.getPwd().length() > 8) {
            servidor1.serverUser(user);
        } else {
            servidor2.serverUser(user);
        }

    }
    
}
