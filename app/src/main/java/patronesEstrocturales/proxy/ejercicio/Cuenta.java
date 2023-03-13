package patronesEstrocturales.proxy.ejercicio;

public class Cuenta implements IBanco{

    private String id;
    private double monto;
    
    public Cuenta(String id, double monto) {
        this.id = id;
        this.monto = monto;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    @Override
    public void acceso(double m, String moneda) {
        System.out.println("Sa accedio a la cuenta : "+id);
        System.out.println("El saldo actual es: " + monto);
    }
    
}
