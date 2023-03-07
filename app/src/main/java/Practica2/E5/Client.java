package Practica2.E5;

public class Client {
    public static void main(String[] args) {
        Git git = new Git();
        GitHub gitHub = new GitHub();
        Proyecto proyecto = new Proyecto("Patrones");

        Desarrollador desarrollador1 = new Desarrollador("d1");
        Desarrollador desarrollador2 = new Desarrollador("d2");
        Desarrollador desarrollador3 = new Desarrollador("d3");

        gitHub.addSuscriptor(desarrollador1);
        gitHub.addSuscriptor(desarrollador2);
        gitHub.addSuscriptor(desarrollador3);

        proyecto.setCodigo("p241");
        git.setLastVersion(proyecto);
        gitHub.addVersion(git.getLastVersion());


        proyecto.setCodigo("p242");
        git.setLastVersion(proyecto);
        gitHub.addVersion(git.getLastVersion());

        
        proyecto.setCodigo("p243");
        git.setLastVersion(proyecto);
        gitHub.addVersion(git.getLastVersion());

        proyecto.setCodigo("p244");
        git.setLastVersion(proyecto);
        gitHub.addVersion(git.getLastVersion());

        proyecto.setCodigo("p245");
        git.setLastVersion(proyecto);
        gitHub.addVersion(git.getLastVersion());


        git.setLastVersion(gitHub.getVersion(1));
        git.getLastVersion().showInfo();

        gitHub.removeSuscriptor(desarrollador1);
        gitHub.removeSuscriptor(desarrollador2);
        gitHub.removeSuscriptor(desarrollador3);

        Desarrollador desarrollador4 = new Desarrollador("d4");
        Desarrollador desarrollador5 = new Desarrollador("d5");
        Desarrollador desarrollador6 = new Desarrollador("d6");

        
        gitHub.addSuscriptor(desarrollador4);
        gitHub.addSuscriptor(desarrollador5);
        gitHub.addSuscriptor(desarrollador6);

        git.setLastVersion(gitHub.getVersion(5));
        git.getLastVersion().showInfo();
    }
}
