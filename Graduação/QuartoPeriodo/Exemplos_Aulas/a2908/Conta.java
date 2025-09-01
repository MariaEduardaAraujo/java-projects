package aula2908;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }
    
    // Setters não podem ser usados indiscriminadamente. O saldo não pode ser settado, ele deve ser manipulado via transações ou depósitos, por exemplo.''
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
