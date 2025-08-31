package model;

public class Paciente {
    private int id;
    private String nome;
    private int idade;
    private String cpf;

    public Paciente() {
    }

    public Paciente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Paciente(int id, String nome, int idade, String cpf) { // Construtor para o banco de dados
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente: " + (nome != null ? nome : "N/A") +
                " | Idade: " + idade +
                " | CPF: " + (cpf != null ? cpf : "N/A");
    }
}
