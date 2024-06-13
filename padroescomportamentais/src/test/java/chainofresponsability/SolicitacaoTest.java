package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoTest {

    Funcionario suporteTerceiroNivel;
    Funcionario suporteSegundoNivel;
    Funcionario suportePrimeiroNivel;

    @BeforeEach
    void setUp() {
        suporteTerceiroNivel = new SuporteTerceiroNivel(null);
        suporteSegundoNivel = new SuporteSegundoNivel(suporteTerceiroNivel);
        suportePrimeiroNivel = new SuportePrimeiroNivel(suporteSegundoNivel);
    }

    @Test
    void deveRetornarSuportePrimeiroNivelParaSolicitacaoSimples() {
        assertEquals("Suporte de Primeiro Nível", suportePrimeiroNivel.tratarSolicitacao(new Solicitacao(TipoSolicitacaoSimples.getTipoSolicitacaoSimples())));
    }

    @Test
    void deveRetornarSuporteSegundoNivelParaSolicitacaoIntermediaria() {
        assertEquals("Suporte de Segundo Nível", suportePrimeiroNivel.tratarSolicitacao(new Solicitacao(TipoSolicitacaoIntermediaria.getTipoSolicitacaoIntermediaria())));
    }

    @Test
    void deveRetornarSuporteTerceiroNivelParaSolicitacaoComplexa() {
        assertEquals("Suporte de Terceiro Nível", suportePrimeiroNivel.tratarSolicitacao(new Solicitacao(TipoSolicitacaoComplexa.getTipoSolicitacaoComplexa())));
    }

    @Test
    void deveRetornarSemSuporteDisponivelParaSolicitacaoSemSuporte() {
        assertEquals("Sem suporte disponível", suportePrimeiroNivel.tratarSolicitacao(new Solicitacao(TipoSolicitacaoSemSuporte.getTipoSolicitacaoSemSuporte())));
    }
}
