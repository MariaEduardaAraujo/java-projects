package aula220825;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        if(!n.equals(" ")){
            this.nome = n;
        }else{
            this.nome = "Não informado";
        }
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
