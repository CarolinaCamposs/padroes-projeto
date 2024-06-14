package strategy;

public class Cliente {

    private float total;

    public float getTotal() {
        return total;
    }

    public void pagarComCartaoCredito(float valor) {
        CalculadoraPagamento calculadora = new CalculadoraPagamento(valor);
        this.total = calculadora.calcular(new PagamentoCartaoCredito());
    }

    public void pagarComCartaoDebito(float valor) {
        CalculadoraPagamento calculadora = new CalculadoraPagamento(valor);
        this.total = calculadora.calcular(new PagamentoCartaoDebito());
    }

    public void pagarComBoleto(float valor) {
        CalculadoraPagamento calculadora = new CalculadoraPagamento(valor);
        this.total = calculadora.calcular(new PagamentoBoleto());
    }

    public void pagarComTransferencia(float valor) {
        CalculadoraPagamento calculadora = new CalculadoraPagamento(valor);
        this.total = calculadora.calcular(new PagamentoTransferencia());
    }
}
