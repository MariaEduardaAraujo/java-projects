package a1710.Animais;

public class Gato extends Animal{
    public Gato(String n, int i) {
        super(n, i);
    }

    public void miar(){
        System.out.println("Miau");
    }
    public void chorar(){ // -> Essa implementação se chama Generalização por Especialização
        System.out.println("Tadinho..." + this.getNome() + " está chorando.");
    }
}