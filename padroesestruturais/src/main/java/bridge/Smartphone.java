package bridge;

public class Smartphone extends Produto {
    public Smartphone(TipoProduto tipoProduto) {
        super(tipoProduto);
    }

    public String descricao() {
        return "Smartphone " + tipoProduto.tipo();
    }
}