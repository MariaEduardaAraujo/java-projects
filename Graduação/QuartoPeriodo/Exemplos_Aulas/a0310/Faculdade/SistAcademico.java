package a0310.Faculdade;

//import java.util.ArrayList;
import java.util.Scanner;

public class SistAcademico {
    //private ArrayList<Professor> professores = new ArrayList<Professor>();

    public void cadastrarProfessor(){
        Professor prof = new Professor();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do professor; ");
        String p = sc.next();
        System.out.print("Digite o e-mail do professor: ");
        String e = sc.next();
        
        prof.setNome(p);
        try{
            prof.setEmail(e);
        }catch (Exception x){
            System.out.println(x.getMessage());
        }
        sc.close();
    }   

    public void CadastrarEstudante(){
        Estudante est = new Estudante();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do estudante; ");
        String e = sc.next();
        System.out.print("Digite o e-mail do estudante: ");
        String em = sc.next();

        est.setNome(e);
        try{
            est.setEmail(em);
        }catch (Exception j){
            System.out.println(j.getMessage());
        }
        sc.close();
    }   

    public static void main(String[] args) {
        
    }
}
