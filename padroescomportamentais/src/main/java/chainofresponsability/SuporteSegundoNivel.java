package chainofresponsability;

public class SuporteSegundoNivel extends Funcionario {

    public SuporteSegundoNivel(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoIntermediaria.getTipoSolicitacaoIntermediaria());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte de Segundo Nível";
    }
}
