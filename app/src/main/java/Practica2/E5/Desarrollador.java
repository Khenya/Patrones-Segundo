package Practica2.E5;

public class Desarrollador implements SuscriptorGitHub {

    private String name;
    
    public Desarrollador(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showNotificaciones(String message) {
        
        System.out.println("********** Commit **********");
        System.out.println("Nombre: " + name);
        System.out.println("Mensaje: " + message);
    }
    
}
