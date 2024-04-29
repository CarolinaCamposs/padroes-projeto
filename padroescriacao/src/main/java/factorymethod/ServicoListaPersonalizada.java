package factorymethod;

public class ServicoListaPersonalizada implements IServico {

    @Override
    public String reproduzir() {
        return "Reproduzindo lista personalizada...";
    }

    @Override
    public String pausar() {
        return "Pausando reprodução da lista personalizada...";
    }
}
