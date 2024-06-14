package state.Elevador;

public class ElevadorEstadoSubir extends ElevadorEstado{

    private ElevadorEstadoSubir() {};
    private static ElevadorEstadoSubir instance = new ElevadorEstadoSubir();
    public static ElevadorEstadoSubir getInstance() {
        return  instance;
    }

    public String getEstado() {
        return "Subindo...";
    }

    public boolean parar(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        return true;
    }

    public boolean descer(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoDescer.getInstance());
        return true;
    }
}
