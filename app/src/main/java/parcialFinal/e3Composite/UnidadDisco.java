package parcialFinal.e3Composite;

import java.util.ArrayList;
import java.util.List;

public class UnidadDisco implements IArchivo{
    private List<IArchivo> folders = new ArrayList<>();

    @Override
    public int getNumberOfWords() {
        int f = 0;
        for (IArchivo folder: folders){
            f += folder.getNumberOfWords();
        }
        return f;
    }

    @Override
    public void addChild(IArchivo archivo) {
        folders.add(archivo);
    }

    @Override
    public void removeChild(IArchivo archivo) {
        folders.remove(archivo);
    }

    @Override
    public IArchivo getChild(int index) {
        return folders.get(index);
    }
}
