package bridge;

public class Acessorio extends Produto {
    public Acessorio(TipoProduto tipoProduto) {
        super(tipoProduto);
    }

    public String descricao() {
        return "Acessório " + tipoProduto.tipo();
    }
}