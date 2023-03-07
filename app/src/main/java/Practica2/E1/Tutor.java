package Practica2.E1;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private List<Memento> tesis = new ArrayList<>();
    public Tutor addMemento(Memento memento){
        tesis.add(memento);
        return this;
    }

    public Memento getMemento(int index){
        return tesis.get(index);
    }
}
