package parcialFinal.e2Bridge;

public class PagoTransferancia implements IPago{

    @Override
    public void factura(double monto) {
        System.out.println("*************** Factura por Transferencia Bancaria ***************");
        System.out.println("El monto original: " + monto);
        System.out.println("El monto con descuento: " + (monto-monto*0.05));
    }
    
}
