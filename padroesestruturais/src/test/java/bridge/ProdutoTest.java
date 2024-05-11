package bridge;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ProdutoTest {

    @Test
    void deveRetornarDescricaoSmartphoneAltaTecnologia() {
        TipoProduto tipoProduto = new AltaTecnologia();
        Produto smartphone = new Smartphone(tipoProduto);
        assertEquals("Smartphone de alta tecnologia", smartphone.descricao());
    }

    @Test
    void deveRetornarDescricaoLaptopMediaTecnologia() {
        TipoProduto tipoProduto = new MediaTecnologia();
        Produto laptop = new Laptop(tipoProduto);
        assertEquals("Laptop de média tecnologia", laptop.descricao());
    }

    @Test
    void deveRetornarDescricaoAcessorioBaixaTecnologia() {
        TipoProduto tipoProduto = new BaixaTecnologia();
        Produto acessorio = new Acessorio(tipoProduto);
        assertEquals("Acessório de baixa tecnologia", acessorio.descricao());
    }
}
