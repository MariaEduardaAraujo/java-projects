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
        if (validaTransacao(valor)){
            this.setSaldo(this.getSaldo() + valor);
        }else{
            System.out.println("Depósito negado!");
        }
    }
    public void sacar(double valor){
        if (validaTransacao(valor) && this.saldo >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque negado!");
        }
    }
    public boolean validaTransacao(double valor){
        if (valor <= 0){
            return false;
        }else{
            return true;
        }
    }
}
