package abstractfactory;

public interface GeradorAbstrata {
    Contrato createContrato();
    Recibo createRecibo();
}
