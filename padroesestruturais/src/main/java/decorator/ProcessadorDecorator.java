package decorator;

public class ProcessadorDecorator extends ComputadorDecorator {

    public ProcessadorDecorator(Computador computador) {
        super(computador);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Processador: Intel Core i9";
    }

    @Override
    public double precoAdicional() {
        return 3000.0;
    }
}