package Practica2.E7;

public class Client {
    public static void main(String[] args) {
        Encargado encargado = new Encargado();

		Persona persona1 = new Persona("Persona1", 5412034, true);
		Persona persona2 = new Persona("Persona2", 1650012, true);

		persona1.showInfo();
		persona2.showInfo();

		persona1.solicitarPrestamo("Nueva casa", "07-05-2020", encargado, 15000);
		persona2.solicitarPrestamo("Conmpra de un auto", "01-03-2023", encargado, 7000);


		persona1.showInfo();
		persona2.showInfo();

		for (int i = 0; i < 7; i++) {
			persona2.pagarPrestamo(1000, encargado);
		}
        for (int i = 0; i < 15; i++) {
			persona1.pagarPrestamo(1000, encargado);
		}
    }
}
