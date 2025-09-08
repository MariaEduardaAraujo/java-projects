package a0509;

public class Banco {
    public static void main(String[] args) {
        Poupanca p1 = new Poupanca("Davi");
        Poupanca p2 = new Poupanca("Daniel");
        Poupanca p3 = new Poupanca("João");
        Poupanca p4 = new Poupanca("Maria");

        //Poupanca p5 = new Poupanca();

        p1.setNumeroConta("0001");
        p2.setNumeroConta("0002");
        p3.setNumeroConta("0003");
        p4.setNumeroConta("0004");
        
        System.out.print(p1);
        System.out.print(p2);
        System.out.print(p3);
        System.out.print(p4);
        //System.out.println(p5);

        System.out.println("Quantidade de Contas Abertas: " + Poupanca.qtdContasAbertas);
    }
}
