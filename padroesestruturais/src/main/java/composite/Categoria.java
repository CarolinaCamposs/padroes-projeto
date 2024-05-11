package composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Produto {
    private List<Produto> produtos;

    public Categoria(String nome) {
        super(nome, 0);
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public String detalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Categoria: ").append(getNome()).append("\n");
        for (Produto produto : produtos) {
            detalhes.append("  ").append(produto.detalhes()).append("\n");
        }
        return detalhes.toString().trim();
    }
}