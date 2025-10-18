package a1710.Pessoa;

public class SistAcad {
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
