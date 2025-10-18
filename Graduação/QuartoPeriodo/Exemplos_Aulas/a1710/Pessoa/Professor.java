package a1710.Pessoa;

public class Professor extends Servidor{
    private String[] disciplinas;
    public Professor(int nivelAcad) throws Exception{
        super(nivelAcad);
    }

    public void calcularSalario(){
        double sal = 5000;
        this.setSalario(sal);
        if(super.nivelAcademico.equals(NivelAcademico.GRADUACAO)){
            
        }
    }

    public static void main(String[] args) {
        Professor p1 = new Professor(2);
        try {
            p1.calcularSalario();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p1.getSalario());
    }
}
