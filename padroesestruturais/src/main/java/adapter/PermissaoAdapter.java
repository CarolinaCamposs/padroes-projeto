package adapter;

public class PermissaoAdapter extends ControleAcessoNivel {

    private IPermissao controleTipo;

    public PermissaoAdapter(IPermissao controleTipo) {
        this.controleTipo = controleTipo;
    }

    public String recuperarTipo() {
        String nivelAcesso = this.getNivelAcesso();
        return determinarTipo(nivelAcesso);
    }

    private String determinarTipo(String nivelAcesso) {
        if ("Alto".equals(nivelAcesso)) {
            return "Administrador";
        } else if ("Médio".equals(nivelAcesso)) {
            return "Supervisor";
        } else if ("Baixo".equals(nivelAcesso)) {
            return "Usuário";
        } else {
            return "Visitante";
        }
    }

    public void salvarTipo() {
        String tipo = controleTipo.getTipo();
        if ("Administrador".equals(tipo)) {
            this.setNivelAcesso("Alto");
        } else if ("Supervisor".equals(tipo)) {
            this.setNivelAcesso("Médio");
        } else if ("Usuário".equals(tipo)) {
            this.setNivelAcesso("Baixo");
        } else {
            this.setNivelAcesso("Visitante");
        }
    }
}
