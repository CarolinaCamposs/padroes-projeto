package visitor;

public interface Visitor {

    String exibirAutor(Autor autor);
    String exibirBibliotecario(Bibliotecario bibliotecario);
    String exibirVisitante(Visitante visitante);
}
