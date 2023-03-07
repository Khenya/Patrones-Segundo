package Practica2.E3;

import java.util.Vector;


public class Client {
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda();
        Tienda tienda2 = new Tienda();

        Vector<Celular> celulares1 = new Vector<>();
        Vector<Celular> celulares2 = new Vector<>();

        for(int i=0; i<10;i++){
            if ((int)Math.random()*10>5){
                Celular celular1 = generarCelularSamsung();
                celular1.setModelo("S21");
                celular1.setPrecio(300);
                celulares1.add(celular1);    
            } else{
                Celular celular2 = generarCelulariPhone();
                celular2.setModelo("14");
                celular2.setPrecio(300);
                celulares1.add(celular2);
            }
        }

        for(int i=0; i<10;i++){
            if ((int)Math.random()*10>5){
                Celular celular1 = generarCelularSamsung();
                celular1.setModelo("S21");
                celular1.setPrecio(300);
                celulares2.add(celular1);    
            } else{
                Celular celular2 = generarCelulariPhone();
                celular2.setModelo("14");
                celular2.setPrecio(300);
                celulares2.add(celular2);
            }
        }

        tienda1.setCantidadDeCelulares(10);
        tienda1.setTiendaCelulares(celulares1);

        tienda1.execute(5,"precio", "S21", 300);
        tienda1.execute(5,"modelo", "S21", 300);
        tienda1.execute(5,"precio-modelo", "S21", 300);

        
        tienda2.setCantidadDeCelulares(10);
        tienda2.setTiendaCelulares(celulares2);

        tienda2.execute(15,"precio", "14", 300);
        tienda2.execute(15,"modelo", "14", 300);
        tienda2.execute(15,"precio-modelo", "14", 300);
    }

    public static Celular generarCelularSamsung(){
        Celular cel1 = new Celular("X","Samsung", "alta", 0);
        return cel1;
    }
    public static Celular generarCelulariPhone(){
        Celular cel1 = new Celular("Y","iPhone", "alta", 0);
        return cel1;
    }

}
