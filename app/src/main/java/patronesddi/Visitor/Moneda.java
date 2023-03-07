package patronesddi.Visitor;

public class Moneda {
    private double monto;
	private String nacionalidad;
    public Moneda(double monto, String nacionalidad) {
        this.monto = monto;
        this.nacionalidad = nacionalidad;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
