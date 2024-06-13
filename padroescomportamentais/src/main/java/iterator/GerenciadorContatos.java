package iterator;

import java.util.Iterator;

public class GerenciadorContatos {

    public static Integer contarTotalContatosAtivosAgenda(Agenda agenda) {
        int totalContatos = 0;
        for (Contato contato : agenda) {
            if (contato.isAtivo()) {
                totalContatos++;
            }
        }
        return totalContatos;
    }

    public static Integer constarTotalContatosAgenda(Agenda agenda) {
        int totalContatos = 0;
        for (Iterator c = agenda.iterator(); c.hasNext(); ) {
            totalContatos++;
            c.next();
        }
        return totalContatos;
    }
}
