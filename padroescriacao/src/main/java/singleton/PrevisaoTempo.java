package singleton;

public class PrevisaoTempo {
    private PrevisaoTempo(){};
    private static PrevisaoTempo instance = new PrevisaoTempo();
    public static  PrevisaoTempo getInstance() {
        return instance;
    }

    private String previsaoTempo;
    private int temperatura;

    public String getPrevisaoTempo() {
        return previsaoTempo;
    }
    public void setPrevisaoTempo(String previsaoTempo) {
        this.previsaoTempo = previsaoTempo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

}
