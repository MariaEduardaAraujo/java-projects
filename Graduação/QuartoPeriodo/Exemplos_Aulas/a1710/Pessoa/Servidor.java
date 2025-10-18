package a1710.Pessoa;

public abstract class Servidor extends Pessoa{
    private String matriculaSiape;
    private String lotacao;
    private double salario;
    NivelAcademico nivelAcademico;

    public Servidor(int tipoNA) throws Exception{
        if(tipoNA == 1) {
            nivelAcademico = NivelAcademico.GRADUACAO;
        }
        else if(tipoNA == 2) {
            nivelAcademico = NivelAcademico.ESPECIALIZACAO;
        }
        else if(tipoNA == 3) {
            nivelAcademico = NivelAcademico.MESTRADO;
        }
        else if(tipoNA == 4) {
            nivelAcademico = NivelAcademico.DOUTORADO;
        }
        else{
            throw new Exception("Tipo acadêmico inválido");
        }
    }

    public String getMatriculaSiape() {
        return matriculaSiape;
    }
    public void setMatriculaSiape(String matSiape) {
        this.matriculaSiape = matSiape;
    }
    public String getLotacao() {
        return lotacao;
    }
    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract void calcularSalario();
}