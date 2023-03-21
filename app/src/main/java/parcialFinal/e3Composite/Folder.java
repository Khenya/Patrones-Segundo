package parcialFinal.e3Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IArchivo {
    private List<IArchivo> archivos = new ArrayList<>();

    @Override
    public int getNumberOfWords() {
        int n = 0;
        for (IArchivo i: archivos){
            n += i.getNumberOfWords();
        }
        return n;
    }

    @Override
    public void addChild(IArchivo archivo) {
        archivos.add(archivo);
    }

    @Override
    public void removeChild(IArchivo archivo) {
        archivos.remove(archivo);
    }

    @Override
    public IArchivo getChild(int index) {
        return archivos.get(index);
    }
}
