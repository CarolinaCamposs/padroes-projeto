package factorymethod;

public class ServicoListaGenero implements IServico {

    @Override
    public String reproduzir() {
        return "Reproduzindo lista de gênero...";
    }

    @Override
    public String pausar() {
        return "Pausando reprodução da lista de gênero...";
    }
}
