package Conta;
public class Conta {
	 private int numero;
	 private double saldo;
	 private double limite;
	 
	 public Conta(int numero, double saldo, double limite) {
		 this.numero = numero;
		 this.saldo = saldo;
		 this.limite = limite;
	 }
	 public void setNumero(int num) {
		 numero = num;
	 }
	 public int getNumero() {
		 return numero;
	 }
	 public void setSaldo(double s) {
		 saldo = s;
	 }
	 public double getSaldo() {
		 return saldo;
	 }
	 public void setLimite(double l) {
		 limite = l;
	 }
	 public double getLimite() {
		 return limite;
	 }
	 public static void main(String[] args) {
		Conta c1 = new Conta(00, 500, 5000);
		Conta c2 = new Conta(01, 5000, 13000);
		
		System.out.println("Saldo 1: " + c1.getSaldo());
		System.out.println("Saldo 2: " + c2.getSaldo());
	}
}