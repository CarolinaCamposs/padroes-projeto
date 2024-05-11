package decorator;

public class ComputadorBasico implements Computador {
    @Override
    public String descricao() {
        return "Computador Básico: CPU, GPU integrada";
    }

    @Override
    public double preco() {
        return 500.0;
    }
}
