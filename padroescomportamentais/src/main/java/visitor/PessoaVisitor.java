package visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAutor(Autor autor) {
        return "Autor{" +
                "id=" + autor.getId() +
                ", nome='" + autor.getNome() + '\'' +
                ", livro=" + autor.getNomeLivro() +
                '}';
    }

    @Override
    public String exibirBibliotecario(Bibliotecario bibliotecario) {
        return "Bibliotecario{" +
                "id=" + bibliotecario.getId() +
                ", nome='" + bibliotecario.getNome() + '\'' +
                ", departamento=" + bibliotecario.getDepartamento() +
                '}';
    }

    @Override
    public  String exibirVisitante(Visitante visitante) {
        return "Visitante{" +
                "id=" + visitante.getId() +
                ", nome='" + visitante.getNome() + '\'' +
                ", idade=" + visitante.getIdade() +
                '}';
    }
}
