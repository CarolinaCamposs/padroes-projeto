package bridge;

public class Laptop extends Produto {
    public Laptop(TipoProduto tipoProduto) {
        super(tipoProduto);
    }

    public String descricao() {
        return "Laptop " + tipoProduto.tipo();
    }
}