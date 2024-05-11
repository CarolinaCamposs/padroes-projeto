package composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveRetornarCatalogoDaLoja() {
        Produto produto1 = new ProdutoSimples("Camiseta", 50);
        Produto produto2 = new ProdutoSimples("Calça Jeans", 80);
        Produto produto3 = new ProdutoSimples("Tênis", 120);

        Categoria vestuario = new Categoria("Vestuário");
        vestuario.adicionarProduto(produto1);
        vestuario.adicionarProduto(produto2);

        Categoria calcados = new Categoria("Calçados");
        calcados.adicionarProduto(produto3);

        Categoria catalogo = new Categoria("Catálogo da Loja");
        catalogo.adicionarProduto(vestuario);
        catalogo.adicionarProduto(calcados);

        Loja loja = new Loja();
        loja.setCatalogo(catalogo);

        assertEquals("Categoria: Catálogo da Loja\n" +
                "  Categoria: Vestuário\n" +
                "  Produto: Camiseta - Preço: R$50.0\n" +
                "  Produto: Calça Jeans - Preço: R$80.0\n" +
                "  Categoria: Calçados\n" +
                "  Produto: Tênis - Preço: R$120.0", loja.getCatalogo());
    }

    @Test
    void deveRetornarExcecaoLojaSemCatalogo() {
        try {
            Loja loja = new Loja();
            loja.getCatalogo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Loja sem catálogo", e.getMessage());
        }
    }
}



