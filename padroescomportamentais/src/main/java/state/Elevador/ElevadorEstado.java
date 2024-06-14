package state.Elevador;

public abstract class ElevadorEstado {

    public abstract String getEstado();

    public boolean parar(Elevador elevador) {
        return false;
    }

    public boolean subir(Elevador elevador) {
        return false;
    }

    public boolean descer(Elevador elevador) {
        return false;
    }
    public boolean abrirPorta(Elevador elevador) {
        return false;
    }
    public boolean fecharPorta(Elevador elevador) {
        return false;
    }

}
