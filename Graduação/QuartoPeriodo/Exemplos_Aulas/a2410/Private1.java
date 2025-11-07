package a2410;

public class Private1 {
    private void a(){
        System.out.println("O método a() foi chamado");
    }
    public void b(){ //-> Visibilidade Pública
        a();
    }
}
