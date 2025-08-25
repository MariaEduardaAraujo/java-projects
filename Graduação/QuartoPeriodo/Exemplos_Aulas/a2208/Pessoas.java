package aula220825;

public class Pessoas{
    public static void main(String[] args){
        //POJO - Plain Old Java Objects (Métodos Get e Set)
    
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome(" ");
        p2.setNome("Fulano");

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
    }
}