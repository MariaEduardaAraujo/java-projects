package Academia;
import java.util.*;
import java.util.stream.IntStream;

@SuppressWarnings("unused")
public class Xaxa {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
      Scanner cad = new Scanner(System.in);

      List<String> dado_Nome = new ArrayList<>(Arrays.asList());
      List<String> dado_Email = new ArrayList<>(Arrays.asList());
      List<String> escolha = new ArrayList<>(Arrays.asList());
      
      System.out.println("Dados");
      System.out.println("Nome: ");
      String cad_Nome = cad.nextLine();
      System.out.println("E-mail: ");
      String cad_Email = cad.nextLine();
      
      System.out.println("Modalidade: "
      		+ "\n 1 - Zumba "
      		+ "\n 2 - Musculacao "
      		+ "\n 3 - Jump");
      String cad_Escolha = cad.nextLine();
      
      escolha.add(cad_Escolha);
      
      dado_Nome.add(cad_Nome);
      dado_Email.add(cad_Email);

      for(String e: dado_Email){
          System.out.println("E-mails:" + dado_Email);
      }
      for(String n : dado_Nome){
        System.out.println("Nomes: " + dado_Nome);
      }
      System.out.println("Escolhas: " + escolha);
    }
}
