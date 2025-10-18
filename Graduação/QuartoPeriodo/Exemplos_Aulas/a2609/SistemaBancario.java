package a2609;

public class SistemaBancario {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.abrirConta();
        Investimento investimento = new Investimento(c1);

        System.out.println(investimento.conta.getPessoa().getNome());
        System.out.println(investimento.tipoInvestimento);
    }
}
