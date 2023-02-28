package patronesddi.Memento.Ejercicio;

public class Memento {
    private String alias;
	private BD bd;


    public Memento(String alias, BD bd) {
        this.alias = alias;
        this.bd = bd;
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
    public void setBd(BD bd) {
        this.bd = bd;
    }



}
