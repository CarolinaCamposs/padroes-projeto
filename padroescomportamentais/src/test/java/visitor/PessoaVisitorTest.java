package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirAutor() {
        Autor autor = new Autor(1,"Machado de Assis", new Livro("Memórias Póstumas"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Autor{id=1, nome='Machado de Assis', livro=Memórias Póstumas}", visitor.exibir(autor));
    }

    @Test
    void deveExibirBibliotecario() {
        Bibliotecario bibliotecario = new Bibliotecario(1, "Marcia", "Seção de História");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Bibliotecario{id=1, nome='Marcia', departamento=Seção de História}", visitor.exibir(bibliotecario));
    }

    @Test
    void deveExibirVisitante() {
        Visitante visitante = new Visitante(1, "Maria", 25);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Visitante{id=1, nome='Maria', idade=25}", visitor.exibir(visitante));
    }
}