package patronesddi.Mediator;

public class DEV extends Team {
    public DEV(ICanalComunicacion canalComunicacion) {
		super(canalComunicacion, "DEV");
	}

	@Override
	public void sendMessage(String message) {
		String headerMessage = "Desde el equipo DEV para el equipo DEV: ";
		String footerMessage = "By " + super.getNombre() + " - " + super.getCi();
		super.getCanalComunicacion().sendMessage(headerMessage + message + footerMessage, this);
	}

	@Override
	public void reciveMessage(String message) {
		System.out.println("Bandeja de " + super.getNombre() + ":");
		System.out.println(message);
    }
}
