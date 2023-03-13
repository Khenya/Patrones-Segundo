package patronesEstrocturales.proxy.ejercicio;

public class TarjetaDebito implements IBanco{
    private String nombre;
    private int nTarjeta;
    private Cuenta cuenta;


    public TarjetaDebito(String nombre, int nTarjeta, Cuenta cuenta) {
        this.nombre = nombre;
        this.nTarjeta = nTarjeta;
        this.cuenta = cuenta;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnTarjeta() {
        return nTarjeta;
    }
    public void setnTarjeta(int nTarjeta) {
        this.nTarjeta = nTarjeta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


    @Override
    public void acceso(double monto, String moneda) {
       if (cuenta.getMonto() - monto<=0){
            System.out.println("No hay saldo suficiente en su cuenta");
       } else if (moneda.equals("Bs")){
            System.out.println("Se realizo el retiro de: " + monto);
            cuenta.setMonto(cuenta.getMonto()-monto);    
            System.out.println("Su cuenta tiene de saldo: " + cuenta.getMonto());
       } else if(moneda.equals("US")){
            System.out.println("Combirtiendo: " + moneda + " a bolivianos ");
            this.acceso(monto*7, "Bs");
       } else if(moneda.equals("E")){
            System.out.println("Combirtiendo: " + moneda + " a bolivianos ");
            this.acceso(monto*8, "Bs");
        } 
    }
    
}
