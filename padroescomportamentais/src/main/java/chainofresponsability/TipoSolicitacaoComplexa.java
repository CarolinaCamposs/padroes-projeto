package chainofresponsability;

public class TipoSolicitacaoComplexa implements TipoSolicitacao {

    private static TipoSolicitacaoComplexa tipoSolicitacaoComplexa = new TipoSolicitacaoComplexa();

    private TipoSolicitacaoComplexa() {}

    public static TipoSolicitacaoComplexa getTipoSolicitacaoComplexa() {
        return tipoSolicitacaoComplexa;
    }
}
