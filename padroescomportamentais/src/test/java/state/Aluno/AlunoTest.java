package state.Aluno;

import org.junit.jupiter.api.Test;
import state.Aluno.Aluno;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

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

    @Test
    void naoDeveMatricularAlunoTransferido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Transferido");
        aluno.matricular();
        assertEquals("Transferido", aluno.getEstado());
    }

    @Test
    void naoDeveMatricularAlunoEvadido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Evadido");
        aluno.matricular();
        assertEquals("Evadido", aluno.getEstado());
    }

    @Test
    void naoDeveMatricularAlunoJubilado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Jubilado");
        aluno.matricular();
        assertEquals("Jubilado", aluno.getEstado());
    }

    @Test
    void deveTransferirAlunoMatriculado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.transferir();
        assertEquals("Transferido", aluno.getEstado());
    }

    @Test
    void deveTransferirAlunoTrancado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.transferir();
        assertEquals("Transferido", aluno.getEstado());
    }

    @Test
    void naoDeveTransferirAlunoEvadido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Evadido");
        aluno.transferir();
        assertEquals("Evadido", aluno.getEstado());
    }

    @Test
    void naoDeveTransferirAlunoJubilado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Jubilado");
        aluno.transferir();
        assertEquals("Jubilado", aluno.getEstado());
    }

    @Test
    void naoDeveTransferirAlunoFormado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Formado");
        aluno.transferir();
        assertEquals("Formado", aluno.getEstado());
    }

    @Test
    void deveEvadirAlunoMatriculado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.evadir();
        assertEquals("Evadido", aluno.getEstado());
    }

    @Test
    void deveEvadirAlunoTrancado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.evadir();
        assertEquals("Evadido", aluno.getEstado());
    }

    @Test
    void naoDeveEvadirAlunoTransferido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Transferido");
        aluno.evadir();
        assertEquals("Transferido", aluno.getEstado());
    }

    @Test
    void naoDeveEvadirAlunoJubilado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Jubilado");
        aluno.evadir();
        assertEquals("Jubilado", aluno.getEstado());
    }

    @Test
    void naoDeveEvadirAlunoFormado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Formado");
        aluno.evadir();
        assertEquals("Formado", aluno.getEstado());
    }

    @Test
    void deveJubilarAlunoMatriculado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.jubilar();
        assertEquals("Jubilado", aluno.getEstado());
    }

    @Test
    void deveJubilarAlunoTrancado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.jubilar();
        assertEquals("Jubilado", aluno.getEstado());
    }

    @Test
    void naoDeveJubilarAlunoTransferido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Transferido");
        aluno.jubilar();
        assertEquals("Transferido", aluno.getEstado());
    }

    @Test
    void naoDeveJubilarAlunoEvadido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Evadido");
        aluno.jubilar();
        assertEquals("Evadido", aluno.getEstado());
    }

    @Test
    void naoDeveJubilarAlunoFormado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Formado");
        aluno.jubilar();
        assertEquals("Formado", aluno.getEstado());
    }

    @Test
    void deveTrancarAlunoMatriculado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.trancar();
        assertEquals("Trancado", aluno.getEstado());
    }

    @Test
    void naoDeveTrancarAlunoTrancado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.trancar();
        assertEquals("Trancado", aluno.getEstado());
    }

    @Test
    void naoDeveTrancarAlunoTransferido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Transferido");
        aluno.trancar();
        assertEquals("Transferido", aluno.getEstado());
    }

    @Test
    void naoDeveTrancarAlunoEvadido() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Evadido");
        aluno.trancar();
        assertEquals("Evadido", aluno.getEstado());
    }

    @Test
    void naoDeveTrancarAlunoJubilado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Jubilado");
        aluno.trancar();
        assertEquals("Jubilado", aluno.getEstado());
    }

    @Test
    void naoDeveTrancarAlunoFormado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Formado");
        aluno.trancar();
        assertEquals("Formado", aluno.getEstado());
    }
    

    @Test
    void devePermitirAlterarEstadoParaJubilado() {
        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.jubilar();
        assertEquals("Jubilado", aluno.getEstado());
    }
}
