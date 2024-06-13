package chainofresponsability;

public class TipoSolicitacaoIntermediaria implements TipoSolicitacao {

    private static TipoSolicitacaoIntermediaria tipoSolicitacaoIntermediaria = new TipoSolicitacaoIntermediaria();

    private TipoSolicitacaoIntermediaria() {}

    public static TipoSolicitacaoIntermediaria getTipoSolicitacaoIntermediaria() {
        return tipoSolicitacaoIntermediaria;
    }
}
