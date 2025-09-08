package a0509;

public class Aluno {
    private String cpf;
    private String nome;
    private String email;
    private String rg;
    static int qtdAlunos; //Static - mesmo valor para à classe como um todo
    
    public Aluno(String cpf, String nome) {
        this.setCpf(cpf);
        this.setNome(nome);
        Aluno.qtdAlunos++;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRg() {
        return this.rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome: " + this.nome + " | CPF: " + this.cpf + " | E-mail: " + this.email + " | RG: " + this.rg + "}";
    }
}