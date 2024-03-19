package abstractfactory2;

public class NotaFiscalCarro implements NotaFiscal{
    @Override
    public String emitir() {
        return "Emitindo Nota  Fiscal para Carro";
    }
}
