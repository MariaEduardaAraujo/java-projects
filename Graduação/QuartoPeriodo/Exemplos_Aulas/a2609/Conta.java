package a2609;

public class Conta {
    private Pessoa pessoa;
    private double saldo;
    private int numConta;

    public void abrirConta() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fulano");
        pessoa.setCpf("1234");

        setPessoa(pessoa);
    }


    public Pessoa getPessoa() {
        return this.pessoa;
    }

    private void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }

}
