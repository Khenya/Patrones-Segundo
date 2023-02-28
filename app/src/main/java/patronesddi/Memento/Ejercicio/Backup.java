package patronesddi.Memento.Ejercicio;

public class Backup {
    public String alias;
	private BD bd;

     public Backup(String alias, BD bd) {
        this.alias = alias;
        this.bd = new BD();
    }

    public void setBackup(BD backup){
        this.bd = new BD();
        this.bd.setPersonas(backup.getPersonas());
        
		this.bd.setPersonas(bd.getPersonas().stream().toList());
    }

    public String getAlias() {
		return alias;
	}

    public BD getBd() {
		System.out.format("Usando Backup: ", alias);
		return bd;
	}

    public BD restoreBackup(Memento memento){
        this.bd = new BD();
        this.bd.setPersonas(memento.getBd().getPersonas());
        System.out.println("La Base de Datos: " + memento.getAlias() + " se restauro");
        return this.bd;
    }
}
