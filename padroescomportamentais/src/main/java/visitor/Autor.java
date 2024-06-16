package visitor;

public class Autor implements Pessoa {

    private int id;
    private String nome;
    private Livro livro;

    public Autor(int id, String nome, Livro livro) {
        this.id = id;
        this.nome = nome;
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeLivro() {
        return this.livro.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAutor(this);
    }
}
