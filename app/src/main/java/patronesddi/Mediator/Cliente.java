package patronesddi.Mediator;

public class Cliente {
    public static void main(String[] args) {
		Skype skype = new Skype();

		QA brenda = new QA(skype);
		brenda.setCi("460");
		brenda.setNombre("Brenda");
		brenda.showInfo();

		QA khenya = new QA(skype);
		khenya.setCi("412");
		khenya.setNombre("Khenya");
		khenya.showInfo();

		QA rodrigo = new QA(skype);
		rodrigo.setCi("845");
		rodrigo.setNombre("Rodrigo");
		rodrigo.showInfo();

		skype.addQA(brenda);
		skype.addQA(khenya);
		skype.addQA(rodrigo);

		brenda.sendMessage("Tenemos una exception");

		DEV juan = new DEV(skype);
		juan.setCi("456");
		juan.setNombre("Juan");
		juan.showInfo();

		DEV ramiro = new DEV(skype);
		ramiro.setCi("457");
		ramiro.setNombre("Ramiro");
		ramiro.showInfo();

		DEV ander = new DEV(skype);
		ander.setCi("868");
		ander.setNombre("Ander");
		ander.showInfo();

		skype.addDEV(ander);
		skype.addDEV(ramiro);
		skype.addDEV(juan);

		juan.sendMessage("No puedo hacer push");

		SM alison = new SM(skype);
		alison.setCi("415");
		alison.setNombre("Alison");
		alison.showInfo();

		SM luis = new SM(skype);
		luis.setCi("648");
		luis.setNombre("Luis");
		luis.showInfo();

		SM tomas = new SM(skype);
		tomas.setCi("536");
		tomas.setNombre("Tomas");
		tomas.showInfo();

		skype.addSM(tomas);
		skype.addSM(luis);
		skype.addSM(alison);

		alison.sendMessage("Realicemos una reunion");
	}
}
