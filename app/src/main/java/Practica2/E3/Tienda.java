package Practica2.E3;

import java.util.Vector;

public class Tienda {
    private int cantidadDeCelulares;
    private Vector<Celular> tiendaCelulares;
    private IStrategy strategy;


    public int getCantidadDeCelulares() {
        return cantidadDeCelulares;
    }
    public void setCantidadDeCelulares(int cantidadDeCelulares) {
        this.cantidadDeCelulares = cantidadDeCelulares;
    }
    
    public Vector<Celular> getTiendaCelulares() {
        return tiendaCelulares;
    }
    public void setTiendaCelulares(Vector<Celular> tiendaCelulares) {
        this.tiendaCelulares = tiendaCelulares;
    }
    
    public IStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void execute(int value, String busqueda, String modelo, int precio){
        if(cantidadDeCelulares>value){
            setStrategy(new MergeSort(busqueda,modelo,precio));
        }else{
            setStrategy(new BubbleSort(busqueda,modelo,precio));
        }
        this.strategy.execute(this);    
    }
}
