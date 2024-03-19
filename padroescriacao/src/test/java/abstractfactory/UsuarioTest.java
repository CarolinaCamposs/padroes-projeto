package abstractfactory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

 public class UsuarioTest {

    @Test
    void deveEmitirContratoPF() {
        GeradorAbstrata gerador = new GeradorPF();
        Usuario usuario = new Usuario(gerador);
        assertEquals("Contrato Pessoa Física", usuario.emitirContrato());
    }
}
