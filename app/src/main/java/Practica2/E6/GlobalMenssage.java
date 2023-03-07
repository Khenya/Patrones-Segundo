package Practica2.E6;

import java.util.List;

public class GlobalMenssage implements TipoComunicacion {

    private List<Persona> personas;


    public List<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }


    @Override
    public void notifyReceptors(String message, Persona persona) {
       message = message + "enviado por: " + persona.getNickname();
       for (Persona persona2 : personas){
        if(!persona2.equals(persona)){
            persona2.receiveMessage(message);
        }
       }
    }
    
}
