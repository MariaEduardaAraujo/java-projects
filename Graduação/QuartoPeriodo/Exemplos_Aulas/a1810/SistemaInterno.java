package a1810;

public class SistemaInterno {
    public void acessarSistema(IAutenticavel aut){
        aut.logar();
    }
    public void sairSistema(IAutenticavel aut){
        aut.deslogar();
    }

    public static void main(String[] args) {
        SistemaInterno i1 = new SistemaInterno();

        //Cliente c1 = new Cliente(); -> Não implementa a interface
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();

        i1.acessarSistema(g1);
        i1.sairSistema(g1);
        i1.acessarSistema(v1);
        i1.sairSistema(v1);
    }
}
