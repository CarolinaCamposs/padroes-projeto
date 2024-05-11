package adapter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UsuarioTest  {

    @Test
    public void deveRetornarPermissaoAdministrador() {
        Usuario usuario = new Usuario();
        usuario.setPermissao("Administrador");

        assertEquals("Alto", usuario.getNivelAcesso());
    }

    @Test
    public void deveRetornarPermissaoUsuario() {
        Usuario usuario = new Usuario();
        usuario.setPermissao("Usuário");

        assertEquals("Baixo", usuario.getNivelAcesso());
    }

    @Test
    public void deveRetornarTipoAdministrador() {
        Usuario usuario = new Usuario();
        usuario.setNivelAcesso("Alto");

        assertEquals("Administrador", usuario.getPermissao());
    }

    @Test
    public void deveRetornarTipoUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNivelAcesso("Baixo");

        assertEquals("Usuário", usuario.getPermissao());
    }

}