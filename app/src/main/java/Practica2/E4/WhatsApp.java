package Practica2.E4;

import java.util.Vector;

public class WhatsApp implements IMediator{
    private Vector<Persona> personas = new Vector<>();


    public WhatsApp addNuevoUsuario(Persona persona){
        personas.add(persona);
        return this;
    }

    @Override
    public void sendAllGroup(String message, String grupo, Persona persona) {
       
        personas.stream().filter(i->i.getGrupo().toLowerCase().equals(grupo.toLowerCase()) && persona.getNumber() != i.getNumber()).forEach(i->i.messageReceived(message, i));
    }

    @Override
    public void sendOneUser(String message, Persona persona) {
        persona.messageReceived(message,persona);
    }
    
}
