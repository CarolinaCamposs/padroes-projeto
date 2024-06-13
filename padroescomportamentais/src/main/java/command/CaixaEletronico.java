package command;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

    private List<Operacao> operacoes = new ArrayList<>();

    public void executarOperacao(Operacao operacao) {
        operacoes.add(operacao);
        operacao.executar();
    }

    public String cancelarUltimaOperacao() {
        if (!operacoes.isEmpty()) {
            Operacao operacao = operacoes.remove(operacoes.size() - 1);
            operacao.cancelar();
            return "Operação cancelada com sucesso.";
        } else {
            return "Nenhuma operação para cancelar.";
        }
    }
}