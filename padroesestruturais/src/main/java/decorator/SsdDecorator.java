package decorator;

public class SsdDecorator extends ComputadorDecorator {


    public SsdDecorator(Computador computador) {
        super(computador);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", SSD 1TB";
    }

    @Override
    public double precoAdicional() {
        return 400.0;
    }
}