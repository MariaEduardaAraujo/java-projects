package a1710.Pessoa;

public class Administrativo extends Servidor{
    NivelAcademico nivelAcademico;
    public Administrativo(int nivelAcad) throws Exception {
        super(nivelAcad);
    }

    public void calcularSalario() {
        this.setSalario(2000);
    }
}
