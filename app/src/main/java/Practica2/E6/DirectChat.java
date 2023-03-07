package Practica2.E6;

public class DirectChat implements TipoComunicacion {
    private Persona receptor;

	public Persona getReceptor() {
		return receptor;
	}
	public void setReceptor(Persona receptor) {
		this.receptor = receptor;
	}


    @Override
    public void notifyReceptors(String message, Persona persona) {
        message = message + "enviado por: " + persona.getNickname();
        receptor.receiveMessage(message);
    }
    
}
