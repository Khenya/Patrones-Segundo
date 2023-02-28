package patronesddi.Memento.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        BackupContainer backupContainer = new BackupContainer();
        Memento memento = new Memento();
        BD bd = new BD();

        // backup 1
        List<Personas> personas = new ArrayList<>();
        
        Personas persona1 = new Personas("Brenda",45012345, 20);
        Personas persona2 = new Personas("Sonia",4685678, 21);
        
        personas.add(persona1);
        personas.add(persona2);
        
        bd.addPersona(personas.get(0));
        bd.addPersona(personas.get(1));

        memento.setBd(bd);
        backupContainer.addBackup(memento.createBackup("backupEnero"));

        // backup 2
        Personas persona3 = new Personas("Esteban",45639012, 54);
        Personas persona4 = new Personas("Carolila",45633456, 22);
        
        personas.add(persona3);
        personas.add(persona4);
        
        bd.addPersona(personas.get(2));
        bd.addPersona(personas.get(3));
        

        memento.setBd(bd);
        backupContainer.addBackup(memento.createBackup("backupFebrero"));

        // backup 3
        Personas persona5 = new Personas("Sofia",452789012, 15);
        Personas persona6 = new Personas("Fabian",750123456, 45);
        
        personas.add(persona5);
        personas.add(persona6);
        
        bd.addPersona(personas.get(4));
        bd.addPersona(personas.get(5));

        memento.setBd(bd);
        backupContainer.addBackup(memento.createBackup("backupMarzo"));

        // backup 4
        Personas persona7 = new Personas("Omar",745012345, 52);
        Personas persona8 = new Personas("Timon",54121210, 45);
        
        personas.add(persona7);
        personas.add(persona8);
        
        bd.addPersona(personas.get(6));
        bd.addPersona(personas.get(7));

        memento.setBd(bd);
        backupContainer.addBackup(memento.createBackup("backupAbril"));

        // backup 5
        Personas persona9 = new Personas("Nicole",45120122, 41);
        Personas persona10 = new Personas("Migguel",45245012, 12);
        
        personas.add(persona9);
        personas.add(persona10);
        
        bd.addPersona(personas.get(8));
        bd.addPersona(personas.get(9));
        
        memento.setBd(bd);
        backupContainer.addBackup(memento.createBackup("backupMayo"));

        bd = memento.restore(backupContainer.getBackup("backupEnero"));

		bd.showInfo();

    }
}
