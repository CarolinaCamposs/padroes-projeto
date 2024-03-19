package abstractfactory2;

public class MontadoraVeiculos {

    private Veiculo veiculo;
    private NotaFiscal notaFiscal;

    public MontadoraVeiculos(FabricaAbstrata fabrica) {
        this.veiculo = fabrica.criarVeiculo();
        this.notaFiscal = fabrica.criarNotaFiscal();
    }

    public  String fabricarVeiculo() {
        return this.veiculo.fabricar();
    }

    public String emitirNotaFiscal() {
        return this.notaFiscal.emitir();
    }
}
