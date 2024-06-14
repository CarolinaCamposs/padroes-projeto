package strategy;

public class PagamentoBoleto implements CalculoPagamento {

    public float calcular(float valor) {
        return valor - (valor * 0.02f);
    }
}
