package chainofresponsability;

public class TipoSolicitacaoSimples implements TipoSolicitacao {

    private static TipoSolicitacaoSimples tipoSolicitacaoSimples = new TipoSolicitacaoSimples();

    private TipoSolicitacaoSimples() {}

    public static TipoSolicitacaoSimples getTipoSolicitacaoSimples() {
        return tipoSolicitacaoSimples;
    }
}
