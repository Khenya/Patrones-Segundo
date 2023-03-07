package Practica2.E6;

public interface Persona {
    public void sendGlobalMessage(String message);
	public void sendPersonalMessage(String message, Persona persona);
	public void receiveMessage(String message);
	public String getNickname();
	public void setComunicationChannel(ChatComunicacion chatComunicacion);
}
