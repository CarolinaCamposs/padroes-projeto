package builder;

public class TransportePorAplicativoBuilder {
    private TransportePorAplicativo transportePorAplicativo;

    public TransportePorAplicativoBuilder() {
        transportePorAplicativo = new TransportePorAplicativo();
    }

    public TransportePorAplicativo build() {
        if (transportePorAplicativo.getNomeMotorista().equals("")) {
            throw new IllegalArgumentException("Nome do motorista não pode ser vazio");
        }
        if (transportePorAplicativo.getModeloCarro().equals("")) {
            throw new IllegalArgumentException("Modelo do carro não pode ser vazio");
        }
        if (transportePorAplicativo.getPlacaCarro().equals("")) {
            throw new IllegalArgumentException("Placa do carro não pode ser vazia");
        }
        if (transportePorAplicativo.getCidade().equals("")) {
            throw new IllegalArgumentException("Cidade não pode ser vazia");
        }
        if (transportePorAplicativo.getEmail().equals("")) {
            throw new IllegalArgumentException("E-mail não pode ser vazio");
        }
        return transportePorAplicativo;
    }

    public TransportePorAplicativoBuilder setNomeMotorista(String nomeMotorista) {
        transportePorAplicativo.setNomeMotorista(nomeMotorista);
        return this;
    }

    public TransportePorAplicativoBuilder setModeloCarro(String modeloCarro) {
        transportePorAplicativo.setModeloCarro(modeloCarro);
        return this;
    }

    public TransportePorAplicativoBuilder setPlacaCarro(String placaCarro) {
        transportePorAplicativo.setPlacaCarro(placaCarro);
        return this;
    }

    public TransportePorAplicativoBuilder setCidade(String cidade) {
        transportePorAplicativo.setCidade(cidade);
        return this;
    }

    public TransportePorAplicativoBuilder setTarifaBase(double tarifaBase) {
        transportePorAplicativo.setTarifaBase(tarifaBase);
        return this;
    }

    public TransportePorAplicativoBuilder setTarifaPorKm(double tarifaPorKm) {
        transportePorAplicativo.setTarifaPorKm(tarifaPorKm);
        return this;
    }

    public TransportePorAplicativoBuilder setDisponivel(boolean disponivel) {
        transportePorAplicativo.setDisponivel(disponivel);
        return this;
    }

    public TransportePorAplicativoBuilder setAvaliacaoMedia(int avaliacaoMedia) {
        transportePorAplicativo.setAvaliacaoMedia(avaliacaoMedia);
        return this;
    }

    public TransportePorAplicativoBuilder setNumeroTelefone(String numeroTelefone) {
        transportePorAplicativo.setNumeroTelefone(numeroTelefone);
        return this;
    }

    public TransportePorAplicativoBuilder setEmail(String email) {
        transportePorAplicativo.setEmail(email);
        return this;
    }
}
