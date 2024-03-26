package abstractfactory;

public class NotaFiscalMotocicleta implements NotaFiscal {
    @Override
    public String emitir() {
        return "Emitindo Nota Fiscal para Motocicleta";
    }
}
