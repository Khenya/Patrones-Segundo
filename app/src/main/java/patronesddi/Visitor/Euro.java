package patronesddi.Visitor;

public class Euro extends Moneda implements Intercanbiable {

	public Euro(double monto) {
		super(monto, "Europa");
	}

	@Override
	public void cambiarValor(Librecambista librecambista) {
		librecambista.cambiar(this);
	} 
    
}
