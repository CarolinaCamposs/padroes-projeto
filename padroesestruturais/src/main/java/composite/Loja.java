package composite;

public class Loja {
    private Categoria catalogo;

    public void setCatalogo(Categoria catalogo) {
        this.catalogo = catalogo;
    }

    public String getCatalogo() {
        if (this.catalogo == null) {
            throw new NullPointerException("Loja sem catálogo");
        }
        return this.catalogo.detalhes();
    }
}
