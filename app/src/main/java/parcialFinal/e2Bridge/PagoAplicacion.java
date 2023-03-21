package parcialFinal.e2Bridge;

public class PagoAplicacion implements IPago{

    @Override
    public void factura(double monto) {
        System.out.println("*************** Factura por Aplicacion ***************");
        System.out.println("El monto original: " + monto);
        System.out.println("El monto con descuento: " + (monto-monto*0.10));
    }
}
