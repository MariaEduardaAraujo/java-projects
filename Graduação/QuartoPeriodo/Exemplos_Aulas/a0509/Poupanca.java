package a0509;

import java.util.Scanner;

/*Classe Poupança precisa saber:
 * Nome do correntista, Número da conta, Saldo
 * Toda poupança ao ser aberta, o banco credita 100 reais na conta e deve obrigatoriamente constar o nome do correntista
 * O banco precisa saber quantas pessoas possuem conta aberta
 */

public class Poupanca {
    static int qtdContasAbertas;
    private String nomeCorrentista;
    private String numeroConta;
    private double saldo;
    
    public Poupanca(String nomCor){
        this.setNomeCorrentista(nomCor);
        this.ConfigAberturaConta();
    }

    //Pedindo valores dentro do construtor
    public Poupanca() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do correntista: ");
        String nc = sc.next();

        this.setNomeCorrentista(nc);
        this.ConfigAberturaConta();

        sc.close();
    }

    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    public String getNumeroConta() {
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ConfigAberturaConta(){
        this.setSaldo(100);
        Poupanca.qtdContasAbertas++;
    }

    @Override
    public String toString() {
        return "\nConta {" + " Nome do Correntista: " + this.nomeCorrentista + " | Número da Conta: " + this.numeroConta + " | Saldo da Conta: " + this.saldo + "}";
    }
}
