package Practica2.E7;

public class Persona {
    private String nombre;
    private int ci;
    private boolean garantia;


    public Persona(String nombre, int ci, boolean garantia) {
        this.nombre = nombre;
        this.ci = ci;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    
    public boolean isGarantia() {
        return garantia;
    }
    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }


    public void showInfo(){
        
        System.out.println("********** Persona **********");
        System.out.println("Nombre: " + nombre);
        System.out.println("CI: " + ci);
        System.out.println("Estado de la garantia: " + garantia);
    }

    public void solicitarPrestamo(String motivo, String fecha, Encargado encargado, double total) {
		encargado.aniadirPrestamo(this, motivo, fecha, total);
	}
	
	public void pagarPrestamo(double ingreso, Encargado encargado) {
		encargado.iniciarPago(this, ingreso);
	}
}
