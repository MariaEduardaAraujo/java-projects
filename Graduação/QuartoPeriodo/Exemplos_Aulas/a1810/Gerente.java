package a1810;

public class Gerente extends Pessoa implements IAutenticavel{
    public void logar(){
        System.out.println("Estou logado como um Gerente");
    }
    public void deslogar(){
        System.out.println("Deslogando Gerente...");
    }
    public void falar(){
        System.out.println("Estou falando coisas de Gerente...");
    }
}