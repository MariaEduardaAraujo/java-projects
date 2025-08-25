package a1508;

public class TerminalBancario { //extends Conta
    public static void main(String[] args) {
    Conta c1 = new Conta();
    Conta c2 = new Conta();
    
    //c1.setSaldo(89.40);
    c1.depositar(82);
    c2.setSaldo(100);

    c2.sacar(52);

    System.out.println("\nSaldo: " + c1.exibirSaldo());
    System.out.println("Saldo: " + c2.getSaldo());   

    c1.mostrarNumConta();
    c2.mostrarNumConta();
    }
}
