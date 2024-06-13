package chainofresponsability;

public class TipoSolicitacaoSemSuporte implements  TipoSolicitacao {

    private static TipoSolicitacaoSemSuporte tipoSolicitacaoSemSuporte = new TipoSolicitacaoSemSuporte();

    private TipoSolicitacaoSemSuporte() {}

    public static TipoSolicitacaoSemSuporte getTipoSolicitacaoSemSuporte() {
        return tipoSolicitacaoSemSuporte;
    }
}
