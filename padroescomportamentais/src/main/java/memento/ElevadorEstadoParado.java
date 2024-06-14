package memento;

public class ElevadorEstadoParado implements ElevadorEstado {

    private ElevadorEstadoParado() {};
    private static ElevadorEstadoParado instance = new ElevadorEstadoParado();
    public static ElevadorEstadoParado getInstance() {
        return  instance;
    }

    public String getNomeEstado() {
        return "Parado";
    }


}
