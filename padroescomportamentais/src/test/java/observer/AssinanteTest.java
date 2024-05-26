package observer;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class AssinanteTest {

    @Test
    void deveNotificarUmAssinante() {
        Date dataPublicacao = PortalNoticia.parseDate("26-05-2024");

        PortalNoticia portalNoticia = new PortalNoticia("Título da Notícia Esportiva", "Conteúdo da Notícia Esportiva", dataPublicacao, "Esportes", "Autor da Notícia");
        Assinante assinante = new Assinante("Assinante 1");
        assinante.cadastrar(portalNoticia);
        portalNoticia.publicarNoticias();
        assertEquals("Assinante 1, nova notícia publicada no PortalNoticia{titulo='Título da Notícia Esportiva', conteudo='Conteúdo da Notícia Esportiva', dataPublicacao=26-05-2024, secao='Esportes', autor='Autor da Notícia'}", assinante.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAssinantes() {
        Date dataPublicacao = PortalNoticia.parseDate("26-05-2024");

        PortalNoticia portalNoticia = new PortalNoticia("Título da Notícia Esportiva", "Conteúdo da Notícia Esportiva", dataPublicacao, "Esportes", "Autor da Notícia");
        Assinante assinante1 = new Assinante("Assinante 1");
        Assinante assinante2 = new Assinante("Assinante 2");
        assinante1.cadastrar(portalNoticia);
        assinante2.cadastrar(portalNoticia);
        portalNoticia.publicarNoticias();
        assertEquals("Assinante 1, nova notícia publicada no PortalNoticia{titulo='Título da Notícia Esportiva', conteudo='Conteúdo da Notícia Esportiva', dataPublicacao=26-05-2024, secao='Esportes', autor='Autor da Notícia'}", assinante1.getUltimaNotificacao());
        assertEquals("Assinante 2, nova notícia publicada no PortalNoticia{titulo='Título da Notícia Esportiva', conteudo='Conteúdo da Notícia Esportiva', dataPublicacao=26-05-2024, secao='Esportes', autor='Autor da Notícia'}", assinante2.getUltimaNotificacao());

    }

    @Test
    void naoDeveNotificarAssinante() {
        Date dataPublicacao = PortalNoticia.parseDate("26-05-2024");

        PortalNoticia portalNoticia = new PortalNoticia("Título da Notícia Esportiva", "Conteúdo da Notícia Esportiva", dataPublicacao, "Esportes", "Autor da Notícia");
        Assinante assinante = new Assinante("Assinante 1");
        portalNoticia.publicarNoticias();
        assertEquals(null, assinante.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAssinantePortalNoticiaA() {
        Date dataPublicacao = PortalNoticia.parseDate("26-05-2024");

        PortalNoticia portalNoticiaA = new PortalNoticia("Título da Notícia Esportiva", "Conteúdo da Notícia Esportiva", dataPublicacao, "Esportes", "Autor da Notícia");
        PortalNoticia portalNoticiaB = new PortalNoticia("Título da Notícia Esportiva", "Conteúdo da Notícia Esportiva", dataPublicacao, "Esportes", "Autor da Notícia");

        Assinante assinante1 = new Assinante("Assinante 1");
        Assinante assinante2 = new Assinante("Assinante 2");

        assinante1.cadastrar(portalNoticiaA);
        assinante2.cadastrar(portalNoticiaB);

        portalNoticiaA.publicarNoticias();

        assertEquals("Assinante 1, nova notícia publicada no PortalNoticia{titulo='Título da Notícia Esportiva', conteudo='Conteúdo da Notícia Esportiva', dataPublicacao=26-05-2024, secao='Esportes', autor='Autor da Notícia'}", assinante1.getUltimaNotificacao());
        assertEquals(null, assinante2.getUltimaNotificacao());
    }

}