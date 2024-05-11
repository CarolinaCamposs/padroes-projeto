package decorator;

public class MemoriaRAMDecorator extends ComputadorDecorator {

    public MemoriaRAMDecorator(Computador computador) {
        super(computador);
    }
    @Override
    public String descricao() {
        return super.descricao() + ", 8 GB de RAM";
    }

    @Override
    public double precoAdicional() {
        return 150.0;
    }
}