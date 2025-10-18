package a0310;

public class CachorroDomestico extends Cachorro{
    public CachorroDomestico(String n, int i) {
        super(n, i);
    }

    public void receberCuidadosEspeciais(){
        System.out.println("Tosa e Higiene feitas");
    }

    public static void main(String[] args){
        CachorroDomestico c2 = new CachorroDomestico("Theo", 4);
        c2.latir();
        c2.rosnar();
        c2.cagar();
        c2.mijar();
        c2.receberCuidadosEspeciais();
    }
}
