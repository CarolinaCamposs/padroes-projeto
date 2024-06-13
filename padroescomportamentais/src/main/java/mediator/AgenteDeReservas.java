package mediator;

public class AgenteDeReservas implements Setor {

    private static AgenteDeReservas instancia = new AgenteDeReservas();

    private AgenteDeReservas() {}

    public static AgenteDeReservas getInstancia() {
        return instancia;
    }

    @Override
    public String reservarPassagem(String destino, String data) {
        return "Passagem reservada para " + destino + " na data " + data + " pelo Agente de Reservas.";
    }

    @Override
    public String cancelarReserva(String reserva) {
        return "Reserva cancelada pelo Agente de Reservas: " + reserva;
    }

    @Override
    public String efetuarPagamento(String reserva, double valor) {
        return "Pagamento efetuado para reserva " + reserva + " no valor de R$" + valor + " pelo Agente de Reservas.";
    }
}
