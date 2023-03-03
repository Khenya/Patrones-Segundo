package patronesddi.Observer.Ejercicio;

public class Notificaciones {
    private String descripcion;
    private String titulo;

    public Notificaciones(String descripcion, String titulo) {
        this.descripcion = descripcion;
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void showInfo() {
        System.out.println("Notificacion: " + titulo);
        System.out.println("Descripcion: "+ descripcion);
    }
}
