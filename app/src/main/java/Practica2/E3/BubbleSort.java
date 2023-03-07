package Practica2.E3;

import java.util.Vector;

public class BubbleSort implements IStrategy{
    private String busqueda;
    private String modelo;
    private int precio;

    
    public BubbleSort(String busqueda, String modelo, int precio) {
        this.busqueda = busqueda;
        this.modelo = modelo;
        this.precio = precio;
    }


    public String getBusqueda() {
        return busqueda;
    }
    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public Vector<Celular> bubbleSort(Vector<Celular> celulares){
        for(int i=0; i<celulares.size()-1; i++){
            for(int j=i; j<celulares.size(); j++){
                if (celulares.get(i).getPrecio()>celulares.get(j).getPrecio()){
                    Celular auxi = celulares.get(i);
                    celulares.set(i,celulares.get(j));
                    celulares.set(j, auxi);
                }
            }
        }
        return celulares;
    }
    @Override
    public void execute(Tienda tienda) {
        System.out.println("*********** Celulares disponibles con la " + busqueda + " ***********");

        if(busqueda.toLowerCase().equals("precio") ){
            Vector<Celular> vector = new Vector<>();

            tienda.getTiendaCelulares().stream().filter(i-> i.getPrecio() <= precio).forEach(i->vector.add(i));

            Vector<Celular> auxVector = bubbleSort(vector);

            auxVector.forEach(i->i.showInfo());
        } else if ( busqueda.toLowerCase().equals("modelo")){
            tienda.getTiendaCelulares().stream().filter(i->i.getModelo().equals(modelo)).forEach(i->i.showInfo());
        } else{
            Vector<Celular> vector = new Vector<>();
        
            tienda.getTiendaCelulares().stream().filter(i-> i.getPrecio() <= precio && i.getModelo().equals(modelo)).forEach(i->vector.add(i));
        
            Vector<Celular> auxVector = bubbleSort(vector);

            auxVector.forEach(i->i.showInfo());
        }
        
    }
    
}
