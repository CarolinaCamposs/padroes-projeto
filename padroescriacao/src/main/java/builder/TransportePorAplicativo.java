package builder;

public class TransportePorAplicativo {
    private String nomeMotorista;
    private String modeloCarro;
    private String placaCarro;
    private String cidade;
    private double tarifaBase;
    private double tarifaPorKm;
    private boolean disponivel;
    private int avaliacaoMedia;
    private String numeroTelefone;
    private String email;

    public TransportePorAplicativo() {
        this.nomeMotorista = "";
        this.placaCarro = "";
        this.email = "";
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public TransportePorAplicativo setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
        return this;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public TransportePorAplicativo setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
        return this;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public TransportePorAplicativo setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
        return this;
    }

    public String getCidade() {
        return cidade;
    }

    public TransportePorAplicativo setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public TransportePorAplicativo setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
        return this;
    }

    public double getTarifaPorKm() {
        return tarifaPorKm;
    }

    public TransportePorAplicativo setTarifaPorKm(double tarifaPorKm) {
        this.tarifaPorKm = tarifaPorKm;
        return this;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public TransportePorAplicativo setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    public int getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public TransportePorAplicativo setAvaliacaoMedia(int avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
        return this;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public TransportePorAplicativo setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public TransportePorAplicativo setEmail(String email) {
        this.email = email;
        return this;
    }
}

