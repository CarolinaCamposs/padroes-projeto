package adapter;

public class ControleAcessoTipo implements IPermissao {

    private String tipo;

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
