package mediator;

public class CompanhiaAerea implements Setor {

    private static CompanhiaAerea instancia = new CompanhiaAerea();

    private CompanhiaAerea() {}

    public static CompanhiaAerea getInstancia() {
        return instancia;
    }

    public String reservarPassagem(String destino, String data) {
        return "Passagem reservada para " + destino + " na data " + data + ".\n" +
                "Aguarde enquanto processamos sua reserva.";
    }

    public String cancelarReserva(String reserva) {
        return "Reserva cancelada: " + reserva;
    }

    public String efetuarPagamento(String reserva, double valor) {
        return "Pagamento efetuado para reserva " + reserva + " no valor de R$" + valor + ".";
    }
}
