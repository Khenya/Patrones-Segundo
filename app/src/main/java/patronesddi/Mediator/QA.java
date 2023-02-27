package patronesddi.Mediator;

public class QA extends Team {
    public QA(ICanalComunicacion canalComunicacion) {
		super(canalComunicacion, "QA");
	}

	@Override
	public void sendMessage(String message) {
		String headerMessage = "Desde el equipo de QA para el equipo de QA:\n";
		String footerMessage = "By " + super.getNombre() + " - " + super.getCi() ;
		super.getCanalComunicacion().sendMessage(headerMessage + message + footerMessage, this);
	}

	@Override
	public void reciveMessage(String message) {
		System.out.println("Bandeja de " + super.getNombre() + ":");
		System.out.println(message);
	}
}
