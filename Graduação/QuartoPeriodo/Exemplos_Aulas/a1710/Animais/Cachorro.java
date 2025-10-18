package a1710.Animais;

//       Classe Concreta  Classe Abstrata
public class Cachorro extends Animal{
    public Cachorro(String n, int i) {
        super(n, i);
    }

    public void latir(){
        System.out.println("Au au");
    }
    public void rosnar(){
        System.out.println("rrrrrrrrrrr");
    }
    public void chorar(){ // -> Métodos abstratos DEVEM ser implementados
        System.out.println(this.getNome() + " está chorando");
    }
}