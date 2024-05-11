package decorator;

public class PlacaVideoDecorator extends ComputadorDecorator {
    private double precoPlacaVideo;

    public PlacaVideoDecorator(Computador computador) {
        super(computador);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Placa de vídeo";
    }

    @Override
    public double precoAdicional() {
        return 1000.0;
    }
}