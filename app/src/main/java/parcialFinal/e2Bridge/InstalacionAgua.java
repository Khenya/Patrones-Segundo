package parcialFinal.e2Bridge;

public class InstalacionAgua implements IInstalacion{
    private IPago pago;
    private boolean enHora;
    private double precio=230;

    public InstalacionAgua(IPago pago, boolean enHora) {
        this.pago = pago;
        this.enHora = enHora;
    }

    @Override
    public void factura() {
        System.out.println("*************** Factura Agua ***************");
        System.out.println("El pago fue realizado en hora: " + enHora);
        pago.factura(precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean getEnHora() {
        return enHora;
    }

    @Override
    public void setEnHora(boolean enHora) {
        this.enHora= enHora;
    }
    
}
