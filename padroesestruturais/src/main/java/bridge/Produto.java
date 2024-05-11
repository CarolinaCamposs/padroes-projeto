package bridge;

public abstract class Produto {
    protected TipoProduto tipoProduto;

    public Produto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public abstract String descricao();
}