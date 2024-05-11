package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Reserva> reservas = new ArrayList<>();

    public void fazerReserva(String nomeCliente, String numeroAssento, String tipoAssento) {
        TipoAssento tipo = TipoAssentoFactory.getTipoAssento(tipoAssento);
        Reserva reserva = new Reserva(nomeCliente, numeroAssento, tipo);
        reservas.add(reserva);
    }

    public List<String> obterReservas() {
        List<String> saida = new ArrayList<>();
        for (Reserva reserva : this.reservas) {
            saida.add(reserva.obterReserva());
        }
        return saida;
    }
}
