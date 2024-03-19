package abstractfactory2;

public class FabricaCarro implements FabricaAbstrata {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return  new NotaFiscalCarro();
    }
}
