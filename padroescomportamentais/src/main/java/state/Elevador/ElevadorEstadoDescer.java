package state.Elevador;

public class ElevadorEstadoDescer extends ElevadorEstado {

    private ElevadorEstadoDescer() {};
    private static ElevadorEstadoDescer instance = new ElevadorEstadoDescer();
    public static ElevadorEstadoDescer getInstance() {
        return  instance;
    }

    public String getEstado() {
        return "Descendo...";
    }

    public boolean parar(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        return true;
    }

    public boolean subir(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoSubir.getInstance());
        return true;
    }
}
