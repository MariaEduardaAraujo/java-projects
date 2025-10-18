package a1710.Animais;

public class Petshop {
    public void atender(Animal an){
        if (an != null) {
            System.out.println("\nAtendimento iniciado...");
            System.out.println("Nome do animal: " + an.getNome());
            
            if (an.getClass().getSimpleName().equals("Cachorro")) {
                /*Cachorro c = (Cachorro) an -> Convertendo "animal" em "cachorro"
                c.latir();*/
                ((Cachorro) an).latir(); //Casting -> Conversão de tipos
            }
            if (an.getClass().getSimpleName().equals("Gato")) {
                ((Gato) an).miar();
            }
            
            an.cagar();
        }
    }
    
    public static void main(String[] args) {
        Petshop ps = new Petshop();
        
        Cachorro c1 = new Cachorro("Bidu", 3);
        Gato g1 = new Gato("Mingau", 5);
        
        ps.atender(c1);
        ps.atender(g1);
    }
}
