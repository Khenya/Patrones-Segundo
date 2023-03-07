package patronesddi.Visitor;

public class Dolar extends Moneda implements Intercanbiable {

	public Dolar(double monto) {
		super(monto, "Estado Unidense");
	}

	@Override
	public void cambiarValor(Librecambista librecambista) {
		librecambista.cambiar(this);
	}
}
