package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaixaEletronicoTest {

    ContaBancaria contaJoao;
    ContaBancaria contaMaria;
    CaixaEletronico caixaEletronico;

    @BeforeEach
    void setUp() {
        contaJoao = new ContaBancaria("João", 1000.0);
        contaMaria = new ContaBancaria("Maria", 500.0);
        caixaEletronico = new CaixaEletronico();
    }

    @Test
    void deveSacarDinheiro() {
        Operacao sacar = new SacarDinheiroOperacao(contaJoao, 200.0);
        caixaEletronico.executarOperacao(sacar);
        assertEquals(800.0, contaJoao.getSaldo());
    }

    @Test
    void deveTransferirDinheiro() {
        Operacao transferir = new TransferirOperacao(contaJoao, contaMaria, 300.0);
        caixaEletronico.executarOperacao(transferir);
        assertEquals(700.0, contaJoao.getSaldo());
        assertEquals(800.0, contaMaria.getSaldo());
    }

    @Test
    void deveConsultarSaldo() {
        Operacao consultarSaldo = new ConsultarSaldoOperacao(contaJoao);
        caixaEletronico.executarOperacao(consultarSaldo);
        assertEquals(1000.0, contaJoao.getSaldo());
    }

    @Test
    void deveCancelarSaque() {
        Operacao sacar = new SacarDinheiroOperacao(contaJoao, 200.0);
        caixaEletronico.executarOperacao(sacar);
        caixaEletronico.cancelarUltimaOperacao();
        assertEquals(1000.0, contaJoao.getSaldo());
    }

    @Test
    void deveCancelarTransferencia() {
        Operacao transferir = new TransferirOperacao(contaJoao, contaMaria, 300.0);
        caixaEletronico.executarOperacao(transferir);
        caixaEletronico.cancelarUltimaOperacao();
        assertEquals(1000.0, contaJoao.getSaldo());
        assertEquals(500.0, contaMaria.getSaldo());
    }
}
