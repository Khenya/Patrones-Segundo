package parcialFinal.e2Bridge;

public class InstalacionAlcantarillado implements IInstalacion{
    public InstalacionAlcantarillado(IPago pago, boolean enHora) {
        this.pago = pago;
        this.enHora = enHora;
    }

    private IPago pago;
    private boolean enHora;
    private double precio=223;

    @Override
    public void factura() {
        System.out.println("*************** Factura Alcantarillado ***************");
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
