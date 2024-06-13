package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorContatosTest {

    @Test
    void deveContarContattosAtivosAgenda() {
        Agenda agenda = new Agenda(
                new Contato("Marco", "123456789" ,true),
                new Contato("Joana", "123456789" ,true),
                new Contato("João", "123456789" ,false),
                new Contato("Maria", "123456789" ,true)
        );
        assertEquals(3, GerenciadorContatos.contarTotalContatosAtivosAgenda(agenda));
    }

    @Test
    void deveContarTotalContatosAgenda() {
        Agenda agenda = new Agenda(
                new Contato("Marco", "123456789" ,true),
                new Contato("Antonio", "123456789" ,true),
                new Contato("Jose", "123456789" ,false),
                new Contato("Maria", "123456789" ,true)
        );
        assertEquals(4, GerenciadorContatos.constarTotalContatosAgenda(agenda));
    }
}