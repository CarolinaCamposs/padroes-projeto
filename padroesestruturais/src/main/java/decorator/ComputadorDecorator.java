package decorator;

public abstract class ComputadorDecorator implements Computador {
    protected Computador computador;

    public ComputadorDecorator(Computador computador) {
        this.computador = computador;
    }

    @Override
    public String descricao() {
        return computador.descricao();
    }

    @Override
    public double preco() {
        return computador.preco() + precoAdicional();
    }

    protected abstract double precoAdicional();
}
