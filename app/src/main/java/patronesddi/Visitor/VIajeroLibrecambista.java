package patronesddi.Visitor;

public class VIajeroLibrecambista implements Librecambista {

	@Override
	public void cambiar(Boliviano boliviano) {
		System.out.println("********* Pais *********" + boliviano.getNacionalidad());
		System.out.println("Para el monto Bs:" + boliviano.getMonto());
		System.out.println("Dolares: " + boliviano.getMonto() / 7);
		System.out.println("Euro: " + boliviano.getMonto() / 8);

	}

	@Override
	public void cambiar(Dolar dolar) {
		System.out.println("********* Pais *********" + dolar.getNacionalidad());
		System.out.println("Para el monto $:" + dolar.getMonto());
		System.out.println("Bolivianos: " + dolar.getMonto() * 7);
		System.out.println("Euro: " + dolar.getMonto() * 7 / 8);

	}

	@Override
	public void cambiar(Euro euro) {
        
		System.out.println("********* Pais *********" + euro.getNacionalidad());
		System.out.println("Para el monto Euros:" + euro.getMonto());
		System.out.println("Dolares: " + euro.getMonto() * 8 / 7);
		System.out.println("Boliviano: " + euro.getMonto() * 8);

    }
}
