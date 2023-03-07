package Practica2.E7;

public class Cajero extends Asesor {

    @Override
    public void asesorPrestamo(Prestamo prestamo, double ingreso) {
        double totalAcumulado = prestamo.getTotalAcumulado();
		double totalPrestamo = prestamo.getTotal();
		if (totalAcumulado < totalPrestamo * 0.25) {
			prestamo.setTotalAcumulado(totalAcumulado + ingreso);
			prestamo.showInfo();
            System.out.println("El pago se realizo al cajero");
		} else {
			super.getAsesor().asesorPrestamo(prestamo, ingreso);	
    	}
    }
    
}
