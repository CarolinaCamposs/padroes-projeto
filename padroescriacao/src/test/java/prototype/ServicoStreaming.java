package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoStreamingTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        AssinaturaStreaming assinatura = new AssinaturaStreaming("Premium", 59.99, 4);

        ServicoStreaming servicoOriginal = new ServicoStreaming("Netflix", assinatura);

        ServicoStreaming servicoClone = servicoOriginal.clone();
        servicoClone.setNome("Amazon Prime");
        servicoClone.getAssinatura().setTipo("Basic");
        servicoClone.getAssinatura().setPreco(14.99);
        servicoClone.getAssinatura().setQuantidadeTelas(2);

        assertEquals("ServicoStreaming{nome='Netflix', assinatura=AssinaturaStreaming{tipo='Premium', preco=59.99, quantidadeTelas=4}}", servicoOriginal.toString());
        assertEquals("ServicoStreaming{nome='Amazon Prime', assinatura=AssinaturaStreaming{tipo='Basic', preco=14.99, quantidadeTelas=2}}", servicoClone.toString());
    }
}