package abstractfactory2;

public class Carro  implements Veiculo{
    @Override
    public String fabricar() {
        return "Fabricando Carro";
    }
}
