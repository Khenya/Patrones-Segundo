package Practica2.E4;

public interface IMediator {
 
    void sendOneUser(String message, Persona persona);
    void sendAllGroup(String message, String grupo, Persona persona);
}
