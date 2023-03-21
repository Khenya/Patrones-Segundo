package parcialFinal.e3Composite;

public class Archivo implements IArchivo{

    private int numberOfWords;

    public Archivo(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    @Override
    public int getNumberOfWords() {
        return numberOfWords;
    }

    @Override
    public void addChild(IArchivo archivo) {
        // no va nada
    }

    @Override
    public void removeChild(IArchivo archivo) {
        // no va nada
    }

    @Override
    public IArchivo getChild(int index) {
        return null;
    }
}
