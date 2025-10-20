package a1710.Pessoa;

public class Professor extends Servidor{
    //private String[] disciplinas;
    
    public Professor(int nivelAcad) throws Exception{
        super(nivelAcad);
    }

    public void calcularSalario(){
        double sal = 5000;
        this.setSalario(sal);
        if(super.nivelAcademico.equals(NivelAcademico.GRADUACAO)){
            
        }
    }
}
