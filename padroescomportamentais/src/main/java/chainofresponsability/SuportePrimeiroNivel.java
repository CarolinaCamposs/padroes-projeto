package chainofresponsability;

public class SuportePrimeiroNivel extends Funcionario {

    public SuportePrimeiroNivel(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoSimples.getTipoSolicitacaoSimples());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte de Primeiro Nível";
    }
}
