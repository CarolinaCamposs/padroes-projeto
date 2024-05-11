package flyweight;

public class Reserva {

    private String nomeCliente;
    private String numeroAssento;
    private TipoAssento tipoAssento;

    public Reserva(String nomeCliente, String numeroAssento, TipoAssento tipoAssento) {
        this.nomeCliente = nomeCliente;
        this.numeroAssento = numeroAssento;
        this.tipoAssento = tipoAssento;
    }

    public String obterReserva() {
        return "Reserva{" +
                "cliente='" + this.nomeCliente + '\'' +
                ", assento='" + this.numeroAssento + '\'' +
                ", tipo='" + tipoAssento.getTipo() + '\'' +
                '}';
    }
}
