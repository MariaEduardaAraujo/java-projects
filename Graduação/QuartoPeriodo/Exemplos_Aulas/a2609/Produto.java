package a2609;

public class Produto {
    private static int qtdProdutos;
    private String nome;
    private double preco;
    private final double PRECO_MINIMO = 2.99;


    Produto(String nome, double preco) {
        //PRECO_MINIMO = 20; nao pode alterar o valor de uma constante.

        if(nome != "") {
            this.nome = nome;
            setPreco(preco);
            Produto.qtdProdutos++;
        }
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    private void setPreco(double preco) {
        if(preco <= 0) {
            this.preco = PRECO_MINIMO;
        }
        else {
            this.preco = preco;
        }
    }


    public static void main(String[] args) {
        Produto p1 = new Produto("livro", 20.0);
        Produto p2 = new Produto("livro", 0);

        System.out.println(p1.getPreco());
        System.out.println(p2.getPreco());
    }
}
