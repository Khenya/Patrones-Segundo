package patronesddi.Visitor;

public class Boliviano extends Moneda implements Intercanbiable {

	public Boliviano(double monto) {
		super(monto, "Boliviano");
	}

	@Override
	public void cambiarValor(Librecambista librecambista) {
		librecambista.cambiar(this);
	}
}
