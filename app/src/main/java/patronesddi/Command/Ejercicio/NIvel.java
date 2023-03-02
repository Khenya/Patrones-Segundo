package patronesddi.Command.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class NIvel {
    private List<ICommand> comandos = new ArrayList<>();
    
    public void addNewCommand(ICommand cmd){
        comandos.add(cmd);
    }

    public void run(){
        for (ICommand command:comandos) {
            command.execute();
        }
    }
}
