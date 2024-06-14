package state.Elevador;

public class ElevadorEstadoPortaFechada extends ElevadorEstado{

    private ElevadorEstadoPortaFechada() {};
    private static ElevadorEstadoPortaFechada instance = new ElevadorEstadoPortaFechada();
    public static ElevadorEstadoPortaFechada getInstance() {
        return  instance;
    }

    public String getEstado() {
        return "Porta fechada...";
    }

    public boolean subir(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoSubir.getInstance());
        return true;
    }

    public boolean descer(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoDescer.getInstance());
        return true;
    }

    public boolean parar(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        return true;
    }

    public boolean abrirPorta(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        return true;
    }

}
