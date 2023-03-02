package patronesddi.Command.Ejercicio;

public class Cliente {
    public static void main(String[] args) {
        Personanje personanje = new Personanje("Brenda");

        Saltar saltar = new Saltar(personanje);
        Correr correr = new Correr(personanje);
        Golpear golpear = new Golpear(personanje);
        Protegerse protegerse = new Protegerse(personanje);
        Curarse curarse = new Curarse(personanje);

        NIvel nivel1 = new NIvel();
        nivel1.addNewCommand(correr);

        NIvel nivel2 = new NIvel();
        nivel2.addNewCommand(protegerse);
        nivel2.addNewCommand(curarse);
        
        NIvel nivel3 = new NIvel();
        nivel3.addNewCommand(saltar);
        nivel3.addNewCommand(correr);
        nivel3.addNewCommand(golpear);

        NIvel nivel4 = new NIvel();
        nivel4.addNewCommand(correr);
        nivel4.addNewCommand(saltar);
        nivel4.addNewCommand(correr);
        nivel4.addNewCommand(saltar);
        nivel4.addNewCommand(protegerse);
        nivel4.addNewCommand(golpear);
        nivel4.addNewCommand(curarse);
        nivel4.addNewCommand(correr);

        nivel1.run();
        nivel2.run();
        nivel3.run();
        nivel4.run();
        
    }
}
