package memento;

public class ElevadorEstadoSubindo implements ElevadorEstado {

    private ElevadorEstadoSubindo() {};
    private static ElevadorEstadoSubindo instance = new ElevadorEstadoSubindo();
    public static ElevadorEstadoSubindo getInstance() {
        return  instance;
    }

    public String getNomeEstado() {
        return "Subindo...";
    }

}
