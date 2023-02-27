package patronesddi.Mediator;

public abstract class Team {
    private String nombre;
	private String ci;
	private ICanalComunicacion canalComunicacion;
	private String cargo;

	public Team(ICanalComunicacion canalComunicacion, String cargo) {
		this.canalComunicacion = canalComunicacion;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}

	public ICanalComunicacion getCanalComunicacion() {
		return canalComunicacion;
	}
	public void setCanalComunicacion(ICanalComunicacion canalComunicacion) {
		this.canalComunicacion = canalComunicacion;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void showInfo() {
		System.out.println("*****" + cargo + "*****");
		System.out.println("Nombre: " + nombre);
		System.out.println("CI: " + ci);
	}

	public abstract void sendMessage(String message);

	public abstract void reciveMessage(String message);

}
