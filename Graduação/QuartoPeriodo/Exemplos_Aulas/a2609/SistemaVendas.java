package a2609;

public class SistemaVendas {

    public void vender(Produto p) {

    }

    public static void main(String[] args) {
       //SistemaVendas sistema = new SistemaVendas();

        Produto p1 = new Produto("livro", 10);
        Produto p2 = new Produto("lápis", 0);
        
        System.out.println("Quantidade de produtos: "+p1.getQtdProdutos());
        System.out.println("Quantidade de produtos: "+p2.getQtdProdutos());

        //p1.setPreco(0);
    }
}
