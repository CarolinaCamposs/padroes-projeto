package visitor;

public class Visitante implements Pessoa {

    private int id;
    private String nome;
    private int idade;

    public Visitante(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirVisitante(this);
    }
}
