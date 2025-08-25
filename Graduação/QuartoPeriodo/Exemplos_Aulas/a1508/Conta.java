package a1508;

public class Conta {
    private int numConta;
    //private String cpfTitular;
    private double saldo;

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double exibirSaldo(){
        return this.getSaldo();
    }
    public void mostrarNumConta(){
        System.out.println("Número da conta: " + this.getNumConta());
    }
    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }
    public void sacar(double valor){
        if (this.saldo < 0 || valor > this.saldo) {
            System.out.println("Saque negado");
        }else{
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado!");
        }
    }
}
