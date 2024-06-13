package chainofresponsability;

public class SuporteTerceiroNivel extends Funcionario {

    public SuporteTerceiroNivel(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoComplexa.getTipoSolicitacaoComplexa());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte de Terceiro Nível";
    }
}
