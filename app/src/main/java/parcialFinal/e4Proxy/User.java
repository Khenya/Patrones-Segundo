package parcialFinal.e4Proxy;

public class User {
    private String nombre;
    private String pwd;

    public User( String nombre, String pwd) {
        this.nombre = nombre;
        this.pwd = pwd;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void showInfo() {
        System.out.println("************ Usuario ************");
        System.out.println("Nombre: " + nombre);
    }
}
