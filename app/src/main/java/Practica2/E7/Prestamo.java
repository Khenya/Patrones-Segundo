package Practica2.E7;

public class Prestamo {
    private String motivo;
	private String fecha;
	private double total;
	private double totalAcumulado = 0;
	private Persona persona;

    
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }


    public double getTotalAcumulado() {
        return totalAcumulado;
    }
    public void setTotalAcumulado(double totalAcumulado) {
        this.totalAcumulado = totalAcumulado;
    }

    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void showInfo(){
        
        System.out.println("********** Prestamo **********");
        System.out.println("Motivoo del prestamo: " + motivo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total: " + total);
        System.out.println("Total acumulado: "+totalAcumulado);
        persona.showInfo();
    }

    public Prestamo(String motivo, String fecha, double total, double totalAcumulado, Persona persona) {
        this.motivo = motivo;
        this.fecha = fecha;
        this.total = total;
        this.totalAcumulado = totalAcumulado;
        this.persona = persona;
    }
}
