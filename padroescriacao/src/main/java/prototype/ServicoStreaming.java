package prototype;

public class ServicoStreaming implements Cloneable{

    private String nome;
    private AssinaturaStreaming assinatura;

    public ServicoStreaming(String nome, AssinaturaStreaming assinatura) {
        this.nome = nome;
        this.assinatura = assinatura;
    }

    public String getNome() {
        return nome;
    }

    public ServicoStreaming setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public AssinaturaStreaming getAssinatura() {
        return assinatura;
    }

    public ServicoStreaming setAssinatura(AssinaturaStreaming assinatura) {
        this.assinatura = assinatura;
        return this;
    }

    @Override
    public ServicoStreaming clone() throws CloneNotSupportedException {
        ServicoStreaming servicoClone = (ServicoStreaming) super.clone();
        servicoClone.assinatura = (AssinaturaStreaming) servicoClone.assinatura.clone();
        return servicoClone;
    }

    @Override
    public String toString() {
        return "ServicoStreaming{" +
                "nome='" + nome + '\'' +
                ", assinatura=" + assinatura +
                '}';
    }
}
