package state.Elevador;

public class Elevador {

    private ElevadorEstado estado;

    public Elevador() {
        this.estado = ElevadorEstadoParado.getInstance();
    }

    public void setEstado(ElevadorEstado estado) {
        this.estado = estado;
    }

    public boolean parar() {
        return estado.parar(this);
    }

    public boolean subir() {
        return estado.subir(this);
    }

    public boolean descer() {
        return estado.descer(this);
    }

    public boolean abrirPorta() {
        return estado.abrirPorta(this);
    }

    public boolean fecharPorta() {
        return estado.fecharPorta(this);
    }

    public ElevadorEstado getEstado() {
        return estado;
    }
}
