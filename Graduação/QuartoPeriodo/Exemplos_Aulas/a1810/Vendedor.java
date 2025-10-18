package a1810;

public class Vendedor extends Pessoa implements IAutenticavel{
    public void logar(){
        System.out.println("Estou logado como um Vendedor");
    }
    public void deslogar(){
        System.out.println("Deslogando Vendedor...");
    }
    public void falar(){
        System.out.println("Estou falando coisas de Vendedor...");
    }
}