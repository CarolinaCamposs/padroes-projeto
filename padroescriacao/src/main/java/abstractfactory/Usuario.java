package abstractfactory;

public class Usuario {

    private Contrato contrato;
    private Recibo recibo;

    public  Usuario (GeradorAbstrata gerador) {
        this.contrato = gerador.createContrato();
        this.recibo = gerador.createRecibo();
    }

    public  String emitirContrato() {
        return this.contrato.emitir();
    }

    public  String emitirRecibo() {
        return this.recibo.emitir();
    }
}
