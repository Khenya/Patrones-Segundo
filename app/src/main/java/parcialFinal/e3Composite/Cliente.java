package parcialFinal.e3Composite;

public class Cliente {
    public static void main(String[] args) {
        IArchivo archivo1 = new Archivo(522);
        IArchivo archivo2 = new Archivo(4200);
        IArchivo archivo3 = new Archivo(400);
        IArchivo archico4 = new Archivo(510);

        IArchivo folder1 = new Folder();
        IArchivo folder2 = new Folder();
        
        UnidadDisco disco1 = new UnidadDisco();


        folder1.addChild(archivo1);
        folder1.addChild(archivo2);

        folder2.addChild(archivo3);
        folder2.addChild(archico4);

        disco1.addChild(folder1);
        disco1.addChild(folder2);

        System.out.println("El numero de palabras en la unidad de disco es: " + disco1.getNumberOfWords());
 
    }
}
