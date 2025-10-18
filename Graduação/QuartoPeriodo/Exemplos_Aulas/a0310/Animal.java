package a0310;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String n, int i){
        this.setNome(n);
        this.setIdade(i);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cagar(){
        System.out.println(getNome() + " está cagando");
    }
    public void mijar(){
        System.out.println(getNome() + " está mijando");
    }
}
