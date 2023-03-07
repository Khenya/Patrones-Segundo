package Practica2.E1;

public class Cliente {
    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        Estudiante estudiante = new Estudiante();

        Tesis tesis;
        tesis = new Tesis("Nuevo lenguaje de programacion", 45261, "Versión 1");
        estudiante.setTesis(tesis);
        tutor.addMemento(estudiante.creMemento());

        tesis = new Tesis("Nuevo lenguaje de programacion", 45262, "Versión 2");
        estudiante.setTesis(tesis);
        tutor.addMemento(estudiante.creMemento());

        tesis = new Tesis("Nuevo lenguaje de programacion", 45263, "Versión 3");
        estudiante.setTesis(tesis);
        tutor.addMemento(estudiante.creMemento());

        tesis = new Tesis("Nuevo lenguaje de programacion", 45264, "Versión 4");
        estudiante.setTesis(tesis);
        tutor.addMemento(estudiante.creMemento());

        tesis = new Tesis("Nuevo lenguaje de programacion", 45265, "Versión 5");
        estudiante.setTesis(tesis);
        tutor.addMemento(estudiante.creMemento());

        tesis.showInfo();

        System.out.println("Restaurando...");
        estudiante.restoreMemento(tutor.getMemento(2));


    }
}
