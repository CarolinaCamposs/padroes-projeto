package memento;

public class ElevadorEstadoPortaAberta implements ElevadorEstado {

    private ElevadorEstadoPortaAberta() {};
    private static ElevadorEstadoPortaAberta instance = new ElevadorEstadoPortaAberta();
    public static ElevadorEstadoPortaAberta getInstance() {
        return  instance;
    }

    public String getNomeEstado() {
        return "Porta aberta...";
    }


}
