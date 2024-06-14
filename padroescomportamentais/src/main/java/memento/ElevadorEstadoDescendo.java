package memento;

public class ElevadorEstadoDescendo implements ElevadorEstado {

    private ElevadorEstadoDescendo() {};
    private static ElevadorEstadoDescendo instance = new ElevadorEstadoDescendo();
    public static ElevadorEstadoDescendo getInstance() {
        return  instance;
    }

    public String getNomeEstado() {
        return "Descendo...";
    }

}
