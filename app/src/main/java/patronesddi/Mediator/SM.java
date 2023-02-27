package patronesddi.Mediator;

public class SM extends Team {

	public SM(ICanalComunicacion canalComunicacion) {
		super(canalComunicacion, "SM");
	}

	@Override
	public void sendMessage(String message) {
		String headerMessage = "Desde el equipo de SM para todo el personal de desarrollo:";
		String footerMessage = "By " + super.getNombre() + " - " + super.getCi() + " urgente!!!";
		super.getCanalComunicacion().sendMessage(headerMessage + message + footerMessage, this);
	}

	@Override
	public void reciveMessage(String message) {
		System.out.println("Bandeja de " + super.getNombre() + ":");
		System.out.println(message);
		System.out.println();
	}

}