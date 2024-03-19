package abstractfactory;

public class GeradorPJ implements  GeradorAbstrata{

    @Override
    public  Contrato createContrato() {
        return new ContratoPJ();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPJ();
    }
}
