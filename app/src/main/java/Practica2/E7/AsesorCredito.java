package Practica2.E7;

public class AsesorCredito extends Asesor {

    @Override
    public void asesorPrestamo(Prestamo prestamo, double ingreso) {
       double totalAcumulado = prestamo.getTotalAcumulado();
       double totalPrestamo = prestamo.getTotal();

       if(totalAcumulado<totalPrestamo* 0.5){
            prestamo.setTotalAcumulado(totalAcumulado+ingreso);
            prestamo.showInfo();
            System.out.println("El banco puede refinanciar su prestamo");

       } else{
            super.getAsesor().asesorPrestamo(prestamo, ingreso);
       }
    }
    
}
