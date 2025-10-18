package a0310.Faculdade;

public class Pessoa {
    private String cpf;
    private String nome;
    private String email;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) throws Exception {
        if (this.email.contains("@")) {
            this.email = email;   
        }else{
            throw new Exception("Formato de e-mail inválido!");
        }
    }
}
