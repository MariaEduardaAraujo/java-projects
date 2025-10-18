package aula1710.Pessoa;

public class SistAcad {
    public static void main(String[] args) {
        try {
            Professor p1 = new Professor(3);
            p1.calcularSalario();
            System.out.println(p1.getSalario());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
