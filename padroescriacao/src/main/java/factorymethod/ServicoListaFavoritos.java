package factorymethod;

public class ServicoListaFavoritos implements IServico {

    @Override
    public String reproduzir() {
        return "Reproduzindo lista de favoritos...";
    }

    @Override
    public String pausar() {
        return "Pausando reprodução da lista de favoritos...";
    }
}
