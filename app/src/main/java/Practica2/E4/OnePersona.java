package Practica2.E4;

public class OnePersona extends Persona {

    public OnePersona(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void messageReceived(String msg, Persona persona) {
        System.out.println("********** Mensaje nuevo **********");
        System.out.println("De: ");
        persona.showInfo();
        System.out.println("Mensaje: " + msg);
    }

    @Override
    public void sendAllGroup(String message, String grupo) {
        this.mediator.sendAllGroup(message, grupo,this);
        
    }

    @Override
    public void sendOneUser(String msg, Persona persona) {
        this.mediator.sendOneUser(msg, persona);
    }
    
}
