package memento;

public class ElevadorEstadoPortaFechada implements ElevadorEstado {

    private ElevadorEstadoPortaFechada() {};
    private static ElevadorEstadoPortaFechada instance = new ElevadorEstadoPortaFechada();
    public static ElevadorEstadoPortaFechada getInstance() {
        return  instance;
    }

    public String getNomeEstado() {
        return "Porta fechada...";
    }

}
