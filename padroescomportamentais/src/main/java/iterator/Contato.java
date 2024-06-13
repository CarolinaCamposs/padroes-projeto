package iterator;

public class Contato {

    private String nome;
    private String telefone;
    private boolean ativo;

    public Contato(String nome, String telefone, boolean ativo) {
        this.nome = nome;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}