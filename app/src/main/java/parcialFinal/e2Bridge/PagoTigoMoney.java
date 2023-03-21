package parcialFinal.e2Bridge;

public class PagoTigoMoney implements IPago{

    @Override
    public void factura(double monto) {
        System.out.println("*************** Factura por Tigo Money ***************");
        System.out.println("El monto original: " + monto);
        System.out.println("El monto con descuento: " + (monto-monto*0.02));
    }
    
}
