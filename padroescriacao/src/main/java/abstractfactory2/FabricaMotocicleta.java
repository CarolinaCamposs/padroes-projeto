package abstractfactory2;

public class FabricaMotocicleta implements FabricaAbstrata {
    @Override
    public Veiculo criarVeiculo() {
        return new Motocicleta();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalMotocicleta();
    }
}
