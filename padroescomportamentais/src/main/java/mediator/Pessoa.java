package mediator;

public class  Pessoa {

    public String reservarPassagem(String destino, String data) {
        return CompanhiaAerea.getInstancia().reservarPassagem(destino, data);
    }

    public String cancelarReserva(String reserva) {
        return CompanhiaAerea.getInstancia().cancelarReserva(reserva);
    }

    public String efetuarPagamento(String reserva, double valor) {
        return CompanhiaAerea.getInstancia().efetuarPagamento(reserva, valor);
    }
}
