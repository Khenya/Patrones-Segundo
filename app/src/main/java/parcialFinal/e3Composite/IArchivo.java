package parcialFinal.e3Composite;

public interface IArchivo {
    int getNumberOfWords();
    void addChild(IArchivo archivo);
    void removeChild(IArchivo archivo);
    IArchivo getChild(int index);
}
