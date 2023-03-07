package Practica2.E3;

import java.util.Vector;


public class MergeSort implements IStrategy {
    private String busqueda;
    private String modelo;
    private int precio;


    public String getBusqueda() {
        return busqueda;
    }
    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }


    public MergeSort(String busqueda, String modelo, int precio) {
        this.busqueda = busqueda;
        this.modelo = modelo;
        this.precio = precio;
    }


    public void merge(Vector<Celular> vector, int left, int middle, int right){
        int leftVectorSize=middle-left+1;
        int rightVectorSize=right- middle;

        Vector<Celular> leftVector = new Vector<>();
        Vector<Celular> rightVector = new Vector<>();

        for (int i=0; i<leftVectorSize;i++){
            leftVector.add(vector.get(left+ i));

        }
        
        for (int i=0; i<rightVectorSize;i++){
            rightVector.add(vector.get(1 + middle + i));

        }
        int i = 0;
        int j = 0;

        int k = left;
        while(i < leftVectorSize && j < rightVectorSize){
            if(leftVector.get(i).getPrecio() <= rightVector.get(j).getPrecio()){
                vector.set(k, leftVector.get(i));
                i++;
            }else{
                vector.set(k, rightVector.get(j));
                j++;
            }
            k++;
        }

        while(i<leftVectorSize){
            vector.set(k, leftVector.get(i));
            i++;
            k++;
        }

        while(j<rightVectorSize){
            vector.set(k, rightVector.get(j));
            j++;
            k++;
        }

    }
    public Vector<Celular> mergeSort(Vector<Celular> vector, int left,int right){
        if(left<right){
            int middle = (left + (right -1))/2;

            mergeSort(vector, left,middle);
            mergeSort(vector,middle + 1, right);
            merge(vector, left,middle, right);
        }
        return vector;
    }

    @Override
    public void execute(Tienda tienda) {
        System.out.println("*********** Celulares disponibles con la " + busqueda + " ***********");

        if(busqueda.toLowerCase().equals("precio") ){
            final Vector<Celular> vector = new Vector<>();

            tienda.getTiendaCelulares().stream().filter(i-> i.getPrecio() <= precio).forEach(i->vector.add(i));

            final Vector<Celular> auxVector = mergeSort(vector,0,vector.size()-1);

            auxVector.forEach(i->i.showInfo());
        } else if ( busqueda.toLowerCase().equals("modelo")){
            tienda.getTiendaCelulares().stream().filter(i->i.getModelo().equals(modelo)).forEach(i->i.showInfo());
        } else{
            Vector<Celular> vector = new Vector<>();
        
            tienda.getTiendaCelulares().stream().filter(i-> i.getPrecio() <= precio && i.getModelo().equals(modelo)).forEach(i->vector.add(i));
        
            Vector<Celular> auxVector = mergeSort(vector,0,vector.size());

            auxVector.forEach(i->i.showInfo());
        }
        
    }
    
}
