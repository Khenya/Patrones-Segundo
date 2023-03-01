package patronesddi.ChainOfResponsability.Ejercicio;

public class Falla {
    private String titulo;
    private String severidad;
    private String descripcion;

    public Falla(String titulo, String severidad, String descripcion) {
        this.titulo = titulo;
        this.severidad = severidad;
        this.descripcion = descripcion;
    }

    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getSeveridad() {
        return severidad;
    }
    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void showInfo(){
        System.out.println("Titulo:" + titulo);
        System.out.println("Severidad:"+severidad);
        System.out.println("Descripcion:" + descripcion);
    }
}
