package abstractfactory2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontadoraVeiculosTest {

    @Test
    void deveFabricarCarro() {
        FabricaAbstrata fabricaCarro = new FabricaCarro();
        MontadoraVeiculos montadora = new MontadoraVeiculos(fabricaCarro);
        assertEquals("Fabricando Carro", montadora.fabricarVeiculo());
    }

    @Test
    void deveEmitirNotaFiscalCarro() {
        FabricaAbstrata fabricaCarro = new FabricaCarro();
        MontadoraVeiculos montadora = new MontadoraVeiculos(fabricaCarro);
        assertEquals("Emitindo Nota  Fiscal para Carro", montadora.emitirNotaFiscal());
    }

    @Test
    void deveFabricarMotocicleta() {
        FabricaAbstrata fabricaMotocicleta = new FabricaMotocicleta();
        MontadoraVeiculos montadora = new MontadoraVeiculos(fabricaMotocicleta);
        assertEquals("Fabricando Motocicleta", montadora.fabricarVeiculo());
    }

    @Test
    void deveEmitirNotaFiscalMotocicleta() {
        FabricaAbstrata fabricaMotocicleta = new FabricaMotocicleta();
        MontadoraVeiculos montadora = new MontadoraVeiculos(fabricaMotocicleta);
        assertEquals("Emitindo Nota Fiscal para Motocicleta", montadora.emitirNotaFiscal());
    }
}
