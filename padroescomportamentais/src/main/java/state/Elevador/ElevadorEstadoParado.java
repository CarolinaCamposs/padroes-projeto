package state.Elevador;

public class ElevadorEstadoParado extends  ElevadorEstado {

    private ElevadorEstadoParado() {};
    private static ElevadorEstadoParado instance = new ElevadorEstadoParado();
    public static ElevadorEstadoParado getInstance() {
        return  instance;
    }

    public String getEstado() {
        return "Parado";
    }

    public boolean subir(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        return true;
    }

    public boolean descer(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        return true;
    }

    public boolean abrirPorta(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        return true;
    }

    public boolean fecharPorta(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        return true;
    }
}
