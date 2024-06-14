package state.Elevador;

public class ElevadorEstadoPortaAberta extends ElevadorEstado{

    private ElevadorEstadoPortaAberta() {};
    private static ElevadorEstadoPortaAberta instance = new ElevadorEstadoPortaAberta();
    public static ElevadorEstadoPortaAberta getInstance() {
        return  instance;
    }

    public String getEstado() {
        return "Porta aberta...";
    }

    public boolean fecharPorta(Elevador elevador) {
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        return true;
    }
}
