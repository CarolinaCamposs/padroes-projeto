package visitor;

public class Bibliotecario implements Pessoa {

    private int id;
    private String nome;
    private String departamento;

    public Bibliotecario(int id,String nome, String departamento) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirBibliotecario(this);
    }
}
