package adapter;

public class Usuario {

    IPermissao permissao;
    PermissaoAdapter controleAcesso;

    public Usuario() {
        permissao = new ControleAcessoTipo();
        controleAcesso = new PermissaoAdapter(permissao);
    }

    public void setPermissao(String tipo) {
        permissao.setTipo(tipo);
        controleAcesso.salvarTipo();
    }

    public String getPermissao() {
        return controleAcesso.recuperarTipo();
    }

    public void setNivelAcesso(String nivelAcesso) {
        controleAcesso.setNivelAcesso(nivelAcesso);
    }

    public String getNivelAcesso() {
        return controleAcesso.getNivelAcesso();
    }

}
