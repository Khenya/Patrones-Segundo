package Practica2.E1;

public class Tesis {
    private String titulo;
    private int codigo;
    private String state;

    public Tesis(String titulo, int codigo, String state) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.state = state;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void showInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Codigo: " + codigo);
        System.out.println("Estado: " + state);
    }
}
