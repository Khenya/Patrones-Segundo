package patronesEstrocturales.composite.template;

public abstract class Component {
    private String attrivute1;
    private String attrivute2;

    // gets and seds
    public String getAttrivute1() {
        return attrivute1;
    }
    public void setAttrivute1(String attrivute1) {
        this.attrivute1 = attrivute1;
    }
    public String getAttrivute2() {
        return attrivute2;
    }
    public void setAttrivute2(String attrivute2) {
        this.attrivute2 = attrivute2;
    }

    public abstract void operation();
    public abstract void add(Component composite);
    public abstract void remove(Component composite);
    public abstract Component get(int position);
    
}
