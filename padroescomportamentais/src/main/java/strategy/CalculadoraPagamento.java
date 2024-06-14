package strategy;

public class CalculadoraPagamento {

    private float valor;

    public CalculadoraPagamento(float valor) {
        this.valor = valor;
    }

    public float calcular(CalculoPagamento estrategia) {
        return estrategia.calcular(valor);
    }
}
