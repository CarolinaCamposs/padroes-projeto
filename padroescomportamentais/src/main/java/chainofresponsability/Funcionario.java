package chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoSolicitacao> listaSolicitacoes = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String tratarSolicitacao(Solicitacao solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return getDescricaoCargo();
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.tratarSolicitacao(solicitacao);
            } else {
                return "Sem suporte disponível";
            }
        }
    }
}