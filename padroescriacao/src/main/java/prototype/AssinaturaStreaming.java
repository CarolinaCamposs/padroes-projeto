package prototype;

public class AssinaturaStreaming implements Cloneable{
    private String tipo;
    private double preco;
    private int quantidadeTelas;

    public AssinaturaStreaming(String tipo, double preco, int quantidadeTelas) {
        super();
        this.tipo = tipo;
        this.preco = preco;
        this.quantidadeTelas = quantidadeTelas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeTelas() {
        return quantidadeTelas;
    }

    public void setQuantidadeTelas(int quantidadeTelas) {
        this.quantidadeTelas = quantidadeTelas;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "AssinaturaStreaming{" +
                "tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", quantidadeTelas=" + quantidadeTelas +
                '}';
    }
}
