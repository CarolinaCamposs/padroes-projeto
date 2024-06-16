package templatemethod;

public abstract class Pedido {

    private int id;
    protected String cliente;
    private float valorItem1;
    private float valorItem2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getValorItem1() {
        return valorItem1;
    }

    public void setValorItem1(float valorItem1) {
        this.valorItem1 = valorItem1;
    }

    public float getValorItem2() {
        return valorItem2;
    }

    public void setValorItem2(float valorItem2) {
        this.valorItem2 = valorItem2;
    }

    public float calcularTotal() {
        return this.valorItem1 + this.valorItem2;
    }

    public abstract String verificarDesconto();

    public String getTipo() {
        return "Pedido";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", cliente='" + this.cliente + '\'' +
                ", desconto=" + this.verificarDesconto() +
                '}';
    }
}

