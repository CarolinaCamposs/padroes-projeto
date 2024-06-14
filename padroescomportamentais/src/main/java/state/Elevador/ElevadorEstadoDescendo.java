package state.Elevador;

public class ElevadorEstadoDescendo extends ElevadorEstado {

    private ElevadorEstadoDescendo() {};
    private static ElevadorEstadoDescendo instance = new ElevadorEstadoDescendo();
    public static ElevadorEstadoDescendo getInstance() {
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
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        return true;
    }
}
