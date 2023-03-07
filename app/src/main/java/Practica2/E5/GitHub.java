package Practica2.E5;

import java.util.ArrayList;
import java.util.List;

public class GitHub implements GestorComunidad, GestorVersiones{

    private List<Proyecto> proyectoVersiones = new ArrayList<>();
    private List<SuscriptorGitHub> suscriptoresGitHub = new ArrayList<>();


    @Override
    public void addSuscriptor(SuscriptorGitHub suscriptorGitHub) {
        suscriptoresGitHub.add(suscriptorGitHub);
    }

    @Override
    public void notifyComunidad(String message) {
        for (SuscriptorGitHub suscriptor : suscriptoresGitHub) {
			suscriptor.showNotificaciones(message);
		}
    }

    @Override
    public void removeSuscriptor(SuscriptorGitHub suscriptorGitHub) {
        suscriptoresGitHub.remove(suscriptorGitHub);
    }

    @Override
    public void addVersion(Proyecto proyecto) {
        proyectoVersiones.add(proyecto);
        notifyComunidad(""+proyectoVersiones.size());
    }

    @Override
    public Proyecto getVersion(int version) {
        Proyecto proyecto = proyectoVersiones.get(version-1);

        return proyecto;
    }
    
}
