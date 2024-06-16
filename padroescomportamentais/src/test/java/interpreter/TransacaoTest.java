package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void  deveCalcularExpressaoComFormula() {
        Transacao transacao = new Transacao();
        transacao.setValor1(100.0);
        transacao.setValor2(200.0);

        assertEquals(400.0, transacao.calcularTotal());
    }

}