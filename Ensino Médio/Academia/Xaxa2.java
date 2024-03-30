package Academia;
import java.util.*;
import java.util.stream.IntStream;
import java.util.Random;

public class Xaxa2 {
    public static void main(String args[]) {
      Scanner cad = new Scanner(System.in);
      Random num = new Random();
      
      List<String> dado_Nome = new ArrayList<>(Arrays.asList());
      List<String> dado_Email = new ArrayList<>(Arrays.asList());
      List<Integer> modalidade = new ArrayList<>(Arrays.asList());
      List<Integer> matricula = new ArrayList<>(Arrays.asList());
      List<String> data = new ArrayList<>(Arrays.asList());
	  int opcao;
	  
      System.out.println("Sistema da Academia"
				+ "\n 1 - Cadastrar aluno"
				+ "\n 2 - Marcar exame físico"
				+ "\n 3 - Conferir alunos inscritos"
				+ "\n 4 - Conferir modalidade dos participantes"
				+ "\n 5 - Conferir data do exame físico"
				+ "\n 6 - Sair \n");
	  
	do {
		  System.out.println("Selecione uma opção: ");
		  opcao = cad.nextInt();
		  
		  switch(opcao) {
	    	case 1:
	    	  System.out.println("Dados");
	          System.out.println("Primeiro nome: ");
			  String cad_Nome = cad.next();
			  
			  System.out.println("E-mail: ");
			  String cad_Email = cad.next();
			  
			  System.out.println("Modalidade: "
							+ "\n 1 - Zumba "
							+ "\n 2 - Musculacao"
							+ "\n 3 - Jump");
			  int cad_Modalidade = cad.nextInt();
			 
			  System.out.println("Gerando matrícula...");
			  int cad_Matricula = num.nextInt(1000);
			  System.out.println("Matrícula: " + cad_Matricula);
			            
			  dado_Nome.add(cad_Nome);
			  dado_Email.add(cad_Email);
			  modalidade.add(cad_Modalidade);
			  matricula.add(cad_Matricula);
			  
			  break;
			  
			case 2:
			  System.out.println("Exame físico");
			  System.out.println("Caso o aluno não queria fazer o seu exame, "
			  					+ "\npreencher a data como 00/00/00");

			  System.out.println("Número da Matrícula: ");
			  int cad_Mat = cad.nextInt();
			  	  
			  if(matricula.contains(cad_Mat)) {
				  System.out.println("Data do Exame:   dd/mm/aaaa  ");
				  String cad_Data = cad.next();
			  	  
				  data.add(cad_Data);
				  }else {
					  System.out.println("Erro");
				  }
			  break;
			  
			case 3:
				
				  System.out.println("Checagem de alunos");
			      System.out.println("Alunos: " + dado_Nome);
			      System.out.println("Matrículas: " + matricula); 
			      System.out.println("Modalidades: " + modalidade); 
				  break;
				  
			case 4:
				  System.out.println("Checar modalidades");
			      System.out.println("Matrícula:");
				  int check_Moda = cad.nextInt();
				  int moda = 0;
				  
				  int indice = matricula.indexOf(check_Moda);
				  
				  for(int i: modalidade) {
					  moda = i;
				  }
				  
				  if(matricula.contains(check_Moda)) {
					  System.out.println("Aluno: " + dado_Nome.get(indice).toString().replace("[", "").replace("]", ""));
					  System.out.println("Matrícula: " + matricula.get(indice).toString().replace("[", "").replace("]", ""));
						
					  switch(moda) {
						case 1:
							System.out.println("Modalidade: Zumba");
							break;
						case 2:
							System.out.println("Modalidade: Musculação");
							break;
						case 3:
							System.out.println("Modalidade: Jump");
							break;
						}
				  }break;
			
			case 5:
				System.out.println("Checar exame físico");
			    System.out.println("Matrícula:");
				int check_exam = cad.nextInt();
				
				int ind = matricula.indexOf(check_exam);
				
				if(matricula.contains(check_exam)) {
					System.out.println("Aluno: " + dado_Nome.get(ind));
					System.out.println("Matrícula: " + check_exam);
					System.out.println("Data do exame: " + data.get(ind));
				}break;
		  }
	     }while(opcao != 6);
    }
}