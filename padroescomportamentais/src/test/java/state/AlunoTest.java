package state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveFormarAlunoMatriculado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.formar();

        assertEquals("Formado", aluno.getEstado());

    }

    @Test
    void naoDeveFormarAlunoTrancado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.formar();

        assertEquals("Trancado", aluno.getEstado());

    }
}