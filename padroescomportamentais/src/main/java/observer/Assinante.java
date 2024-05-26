package observer;

import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Assinante(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(PortalNoticia portalNoticia) {
        portalNoticia.addObserver(this);
    }

    public void update(Observable portalNoticia, Object arg1) {
        this.ultimaNotificacao = this.nome + ", nova notícia publicada no " + portalNoticia.toString();
    }

}
