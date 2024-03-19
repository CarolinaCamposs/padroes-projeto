package abstractfactory;

public class GeradorPF  implements  GeradorAbstrata{

    @Override
    public  Contrato createContrato() {
        return new ContratoPF();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPF();
    }
}
