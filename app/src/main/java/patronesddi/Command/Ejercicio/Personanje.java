package patronesddi.Command.Ejercicio;

public class Personanje {
    private String nombre;
    
    public Personanje(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saltar(){
        System.out.println(nombre + " esta saltando");
    }
    public void correr(){
        System.out.println(nombre + " esta corriendo");
    }
    public void golpear(){
        System.out.println(nombre + " esta golpeando");
    }
    public void proteger(){
        System.out.println(nombre + " se esta proteginedo");
    }
    public void curar(){
        System.out.println(nombre + " se esta curando");
    }



    public void showInfo(){
        System.out.println("Nombre del jugador: " + nombre);
    }
}
