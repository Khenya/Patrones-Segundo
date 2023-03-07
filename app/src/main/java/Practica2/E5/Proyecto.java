package Practica2.E5;

public class Proyecto implements ProyectoPrototype{
    private String nombre;
	private String codigo;
	private int cambios;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCambios() {
        return cambios;
    }
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }


    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.codigo = "";
        this.cambios = 0;
    }

    
    @Override
    public Proyecto clone() {
        Proyecto clonProyecto = new Proyecto(nombre);
		clonProyecto.setCodigo(codigo);
		clonProyecto.setCambios(cambios);
		return clonProyecto;
    }
    

    public void showInfo() {
		System.out.println("********** Proyecto "  + nombre + " **********");
		System.out.println("Codigo:" + codigo);
		System.out.println("Cambios: " + cambios);
	}
}
