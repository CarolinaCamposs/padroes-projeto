package memento;

import java.util.ArrayList;
import java.util.List;

public class Elevador {

    private ElevadorEstado estado;
    private List<ElevadorEstado> memento = new ArrayList<>();

    public ElevadorEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ElevadorEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ElevadorEstado> getEstados() {
        return this.memento;
    }
}