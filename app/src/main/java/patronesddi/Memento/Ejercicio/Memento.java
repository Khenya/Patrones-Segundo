package patronesddi.Memento.Ejercicio;

public class Memento {
    private String alias;
	private BD bd;

    public void setBd(BD bd) {
		this.bd = new BD();
		this.bd.setPersonas(bd.getPersonas().stream().toList());
    }

    public Backup createBackup(String alias) {
		return new Backup(alias, bd);
	}

	public BD restore(Backup backup) {
		this.bd = backup.getBd();
		return this.bd;
	}

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public BD getBd() {
        return bd;
    }
   

}
