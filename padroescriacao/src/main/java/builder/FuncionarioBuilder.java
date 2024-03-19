package builder;

public class FuncionarioBuilder {
    private Funcionario funcionario;

    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (funcionario.getCpf().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (funcionario.getEmail().equals("")) {
            throw new IllegalArgumentException("Email Inválido");
        }
        return funcionario;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setIdade(int idade) {
        funcionario.setIdade(idade);
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo) {
        funcionario.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setSalario(double salario) {
        funcionario.setSalario(salario);
        return this;
    }


    public FuncionarioBuilder setDepartamento(String departamento) {
        funcionario.setDepartamento(departamento);
        return this;
    }


    public FuncionarioBuilder setMatricula(String matricula) {
        funcionario.setMatricula(matricula);
        return this;
    }


    public FuncionarioBuilder setEndereco(String endereco) {
        funcionario.setEndereco(endereco);
        return this;
    }
    public FuncionarioBuilder setTelefone(String telefone) {
        funcionario.setTelefone(telefone);
        return this;
    }


    public FuncionarioBuilder setEmail(String email) {
        funcionario.setEmail(email);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        funcionario.setCpf(cpf);
        return this;
    }

}


