package builder;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private String departamento;
    private String matricula;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;

    public Funcionario() {
        this.nome = "";
        this.cpf = "";
        this.email = "";
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Funcionario setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Funcionario setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Funcionario setDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public String getMatricula() {
        return matricula;
    }

    public Funcionario setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Funcionario setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Funcionario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Funcionario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Funcionario setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }
}
