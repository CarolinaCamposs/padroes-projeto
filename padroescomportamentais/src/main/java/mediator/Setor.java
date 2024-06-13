package mediator;

public interface Setor {

    String reservarPassagem(String destino, String data);
    String cancelarReserva(String reserva);
    String efetuarPagamento(String reserva, double valor);
}
