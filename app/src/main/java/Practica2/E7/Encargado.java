package Practica2.E7;

import java.util.HashMap;
import java.util.Map;

public class Encargado extends Asesor implements NotificadorBanco {

    private Cajero cajero;
    private AsesorCredito asesorCredito;
    private Supervisor supervisor;
    private Map<Persona,Prestamo> prestamos;

    public Encargado() {
		this.cajero = new Cajero();
		setAsesor(cajero);
		this.asesorCredito = new AsesorCredito();
		cajero.setAsesor(asesorCredito);
		this.supervisor = new Supervisor(this);
		asesorCredito.setAsesor(supervisor);
		prestamos = new HashMap<>();
	}

    public void aniadirPrestamo(Persona newDeudor, String motivo, String fecha, double total) {
		if (prestamos.containsKey(newDeudor)) {
			System.out.println("Ya existe un prestamo a tu nombre:");
			newDeudor.showInfo();
		} else {
            System.out.println("Se esta creando el nuevo prestamo...");
			prestamos.put(newDeudor, new Prestamo(motivo, fecha, total, total, newDeudor));
			newDeudor.setGarantia(false);
		}
	}


    @Override
    public void cerrarPrestamo(Prestamo prestamo) {
        System.out.println("Se finalizo el prestamo");
		prestamos.remove(prestamo.getPersona());
		prestamo.getPersona().setGarantia(true);
		prestamo.getPersona().showInfo();
    }

    @Override
    public void asesorPrestamo(Prestamo prestamo, double ingreso) {
       super.getAsesor().asesorPrestamo(prestamo, ingreso);

    }

    public void iniciarPago(Persona persona, double ingreso) {
		if (prestamos.containsKey(persona)) {
			asesorPrestamo(prestamos.get(persona), ingreso);
		} else {
            persona.showInfo();
		}
	}
    
}
