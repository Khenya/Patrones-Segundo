package Practica2.E4;

import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        WhatsApp whatsApp = new WhatsApp();

        Vector<Persona> personas = new Vector<>();

        for(int i=0; i<10; i++){
            OnePersona onePersona = new OnePersona(whatsApp);
            onePersona.setName("persona" + i);
            onePersona.setGrupo("grupo 1");
            onePersona.setNumber(7013141+i);

            personas.add(onePersona);
            whatsApp.addNuevoUsuario(onePersona);
        }

        OnePersona onePersona1 = new OnePersona(whatsApp);
        onePersona1.setName("persona541");
        onePersona1.setGrupo("grupo 2");
        onePersona1.setNumber(70620437);

        personas.get(0).sendOneUser("Holaaaaa", personas.get(1));
        personas.get(3).sendAllGroup("Hola grupo :)", "grupo 1");
    }
}
