package state.Aluno;

public class Aluno {

    private String estado;

    public Aluno() {
        this.estado = "Matriculado";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void matricular() {
        if (this.estado.equals("Trancado")) {
            this.estado = "Matriculado";
        }
    }

    public void transferir() {
        if (this.estado.equals("Trancado") || this.estado.equals("Matriculado")) {
            this.estado = "Transferido";
        }
    }

    public void evadir() {
        if (this.estado.equals("Trancado") || this.estado.equals("Matriculado")) {
            this.estado = "Evadido";
        }
    }

    public void jubilar() {
        if (this.estado.equals("Trancado") || this.estado.equals("Matriculado")) {
            this.estado = "Jubilado";
        }
    }

    public void formar() {
        if (this.estado.equals("Matriculado")) {
            this.estado = "Formado";
        }
    }

    public void trancar() {
        if (this.estado.equals("Matriculado")) {
            this.estado = "Trancado";
        }
    }

}