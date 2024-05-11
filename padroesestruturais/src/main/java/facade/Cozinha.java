package facade;

public class Cozinha extends Restaurante{

    private static Cozinha cozinha = new Cozinha();

    private Cozinha() {};

    public static Cozinha getInstancia() {
        return cozinha;
    }
}
