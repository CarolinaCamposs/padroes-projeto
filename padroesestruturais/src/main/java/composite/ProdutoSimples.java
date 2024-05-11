package composite;

public class ProdutoSimples extends Produto {
    public ProdutoSimples(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String detalhes() {
        return "Produto: " + getNome() + " - Preço: R$" + getPreco();
    }
}