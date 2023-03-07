package Practica2.E4;

public abstract class Persona {
    protected IMediator mediator;
    private String name;
    private int number;
    private String grupo;


    public Persona(IMediator mediator) {
        this.mediator = mediator;
    }


    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void showInfo(){
        System.out.println("********** Persona **********");
        System.out.println("Nombre: " + name);
        System.out.println("Numero: " + number);
        System.out.println("Grupo: " + grupo);
    }

    public abstract void sendOneUser(String msg, Persona persona);
    public abstract void sendAllGroup(String message, String grupo);
    public abstract void messageReceived(String msg, Persona persona);
}
