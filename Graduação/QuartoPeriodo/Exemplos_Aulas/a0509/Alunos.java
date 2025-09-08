package a0509;

public class Alunos {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(null, "Aluno 1");
        Aluno a2 = new Aluno(null, "Aluno 2");

        System.out.println("\n" + Aluno.qtdAlunos);
        System.out.println(a1);
        System.out.println(a2);
    }
}
