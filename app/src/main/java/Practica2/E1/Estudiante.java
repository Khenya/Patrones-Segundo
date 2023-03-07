package Practica2.E1;

public class Estudiante {
    private Tesis tesis;

    public void setTesis(Tesis tesis) {
        System.out.println("Nueva Tesis");
        tesis.showInfo();
        this.tesis = tesis;
    }

    public Memento creMemento(){
        return new Memento(tesis);
    }

    public void restoreMemento(Memento memento){
        System.out.println("Restore Tesis");
        tesis = memento.getTesis();
        tesis.showInfo();
    }
}
