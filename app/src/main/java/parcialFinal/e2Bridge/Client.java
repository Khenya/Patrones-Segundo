package parcialFinal.e2Bridge;

public class Client {
    public static void main(String[] args) {
        IInstalacion agua = new InstalacionAgua(new PagoAplicacion(), true);
        IInstalacion alcantarillado = new InstalacionAlcantarillado(new PagoTigoMoney(), false);
        IInstalacion electrica = new InstalacionElectrica(new PagoTransferancia(), true);
        agua.factura();
        alcantarillado.factura();
        electrica.factura();
    }
}
