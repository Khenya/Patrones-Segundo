package Practica2.E7;

public class Supervisor extends Asesor{
    private NotificadorBanco notificadorBanco;

	public Supervisor(NotificadorBanco notificadorBanco) {
		this.notificadorBanco = notificadorBanco;
	}

    @Override
    public void asesorPrestamo(Prestamo prestamo, double ingreso) {
        double totalAcumulado = prestamo.getTotalAcumulado() + ingreso;
		double totalPrestamo = prestamo.getTotal();
		prestamo.setTotalAcumulado(totalAcumulado);
		prestamo.showInfo();

		if (totalAcumulado >= totalPrestamo) {
			notificadorBanco.cerrarPrestamo(prestamo);
            System.out.println("Se te seran devueltos tus documentos");
		} else {
			System.out.println("El banco cuenta con otros tipos de prestamos: ");
			System.out.println("Prestamo vivienda");
			System.out.println("Prestamo emprendimiento");
			System.out.println("Prestamo automovil");
		}

    }
    
}
