package strategy;

public class PagamentoCartaoCredito implements CalculoPagamento {

    public float calcular(float valor) {
        return valor + (valor * 0.05f);
    }
}
