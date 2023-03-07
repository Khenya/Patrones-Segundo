package Practica2.E6;

import java.util.List;

public interface ChatComunicacion {
    public void sendMessage(String message, Persona persona);
	public void setComunicationType(TipoComunicacion tipoComunicacion);
	public List<Persona> getUsuarios();
}
