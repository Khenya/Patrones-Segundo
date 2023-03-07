package Practica2.E6;

import java.util.List;


public class Telegram implements ChatComunicacion {

    private TipoComunicacion tipoComunicacion;
    private List<Persona> personas;


	public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public TipoComunicacion getTipoComunicacion() {
        return tipoComunicacion;
    }
    @Override
    public List<Persona> getUsuarios() {
        return personas;
    }

    @Override
    public void sendMessage(String message, Persona persona) {
        tipoComunicacion.notifyReceptors(message, persona);
    
    }

    @Override
    public void setComunicationType(TipoComunicacion tipoComunicacion) {
        this.tipoComunicacion= tipoComunicacion;    
    }
    
}
