package Practica2.E6;

public class Desarrollador implements Persona{
    private String name;
    private String nickname;
    private ChatComunicacion chatComunicacion;


    public Desarrollador(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public ChatComunicacion getChatComunicacion() {
        return chatComunicacion;
    }

    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("********** Mensaje **********");
        System.out.println("Nombre: " + name);
        System.out.println("Mensaje: " + message);
    }

    @Override
    public void sendGlobalMessage(String message) {
        GlobalMenssage globalMenssage = new GlobalMenssage();
        globalMenssage.setPersonas(chatComunicacion.getUsuarios());
        chatComunicacion.setComunicationType(globalMenssage);
        chatComunicacion.sendMessage(message, this);
    }

    @Override
    public void sendPersonalMessage(String message, Persona persona) {
        DirectChat directChat = new DirectChat();
        directChat.setReceptor(persona);
        chatComunicacion.setComunicationType(directChat);
        chatComunicacion.sendMessage(message, this);
    }

    @Override
    public void setComunicationChannel(ChatComunicacion chatComunicacion) {
        this.chatComunicacion=chatComunicacion;
    }
    
}
