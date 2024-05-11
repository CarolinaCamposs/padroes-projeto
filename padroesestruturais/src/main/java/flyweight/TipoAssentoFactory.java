package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TipoAssentoFactory {

    private static Map<String, TipoAssento> tiposAssento = new HashMap<>();

    public static TipoAssento getTipoAssento(String tipo) {
        TipoAssento tipoAssento = tiposAssento.get(tipo);
        if (tipoAssento == null) {
            tipoAssento = new TipoAssento(tipo);
            tiposAssento.put(tipo, tipoAssento);
        }
        return tipoAssento;
    }

    public static int getTotalTiposAssento() {
        return tiposAssento.size();
    }
}
