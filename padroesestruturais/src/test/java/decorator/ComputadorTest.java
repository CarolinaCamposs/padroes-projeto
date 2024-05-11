package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {
    @Test
    void deveRetornarPrecoComputadorBasico() {
        Computador computador = new ComputadorBasico();

        assertEquals(500.0, computador.preco());
    }

    @Test
    void deveRetornarPrecoComputadorBasicoComMemoriaRam() {
        Computador computador = new MemoriaRAMDecorator( new ComputadorBasico());

        assertEquals(650.0, computador.preco());
    }

    @Test
    void deveRetornarPrecoComputadorBasicoComMemoriaRamMaisPlacaDeVideo() {
        Computador computador = new PlacaVideoDecorator(new MemoriaRAMDecorator(new ComputadorBasico()));

        assertEquals(1650.0, computador.preco());
    }


    @Test
    void deveRetornarPrecoComputadorBasicoComMemoriaRamMaisPlacaDeVideoMaisProcessardor() {
        Computador computador = new MemoriaRAMDecorator(new PlacaVideoDecorator(new ProcessadorDecorator(new ComputadorBasico())));

        assertEquals(4650.0, computador.preco());
    }

    @Test
    void deveRetornarPrecoComputadorBasicoComMemoriaRamMaisPlacaDeVideoMaisProcessardorMaisSsd() {
        Computador computador = new MemoriaRAMDecorator(new PlacaVideoDecorator(new ProcessadorDecorator(new SsdDecorator(new ComputadorBasico()))));

        assertEquals(5050.0, computador.preco());
    }

    @Test
    void deveRetornarDescricaoComputadorBasico() {
        Computador computador = new ComputadorBasico();

        assertEquals("Computador Básico: CPU, GPU integrada", computador.descricao());
    }

    @Test
    void deveRetornarDescricaoComputadorBasicoComMemoriaRam() {
        Computador computador = new MemoriaRAMDecorator( new ComputadorBasico());

        assertEquals("Computador Básico: CPU, GPU integrada, 8 GB de RAM", computador.descricao());
    }

    @Test
    void deveRetornarDescricaoComputadorBasicoComMemoriaRamMaisPlacaDeVideo() {
        Computador computador = new PlacaVideoDecorator(new MemoriaRAMDecorator(new ComputadorBasico()));

        assertEquals("Computador Básico: CPU, GPU integrada, 8 GB de RAM, Placa de vídeo", computador.descricao());
    }


    @Test
    void deveRetornarDescricaoComputadorBasicoComMemoriaRamMaisPlacaDeVideoMaisProcessardor() {
        Computador computador = new ProcessadorDecorator(new PlacaVideoDecorator(new MemoriaRAMDecorator(new ComputadorBasico())));

        assertEquals("Computador Básico: CPU, GPU integrada, 8 GB de RAM, Placa de vídeo, Processador: Intel Core i9", computador.descricao());
    }

    @Test
    void deveRetornarDescricaoComputadorBasicoComMemoriaRamMaisPlacaDeVideoMaisProcessardorMaisSsd() {
        Computador computador = new SsdDecorator(new ProcessadorDecorator(new PlacaVideoDecorator(new MemoriaRAMDecorator(new ComputadorBasico()))));

        assertEquals("Computador Básico: CPU, GPU integrada, 8 GB de RAM, Placa de vídeo, Processador: Intel Core i9, SSD 1TB", computador.descricao());
    }
}


