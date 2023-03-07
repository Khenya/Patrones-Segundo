package patronesddi.Visitor;

public class Client {
    public static void main(String[] args) {
        VIajeroLibrecambista vIajeroLibrecambista = new VIajeroLibrecambista();

        Boliviano boliviano = new Boliviano(100);
        Euro euro = new Euro(4650);
        Dolar dolar = new Dolar(540);

        boliviano.cambiarValor(vIajeroLibrecambista);
        euro.cambiarValor(vIajeroLibrecambista);
        dolar.cambiarValor(vIajeroLibrecambista);
    }
}
