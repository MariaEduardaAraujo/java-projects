import java.util.*;
//import java.util.stream.IntStream;
import java.util.Random;

public class Aluno {
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String args[]) {
      Scanner cad = new Scanner(System.in);
      Random num = new Random();
      
      List<String> aluno_Nome = new ArrayList<>(Arrays.asList());
      List<Integer> aluno_Idade = new ArrayList<>(Arrays.asList());
      List<Integer> aluno_Matricula = new ArrayList<>(Arrays.asList());
      List<String> aluno_Curso = new ArrayList<>(Arrays.asList());
      List<String> aluno_Turno = new ArrayList<>(Arrays.asList());
      List<String> aluno_Disciplina = new ArrayList<>(Arrays.asList());
      List<Integer> aluno_Nota = new ArrayList<>(Arrays.asList());
      
      List<String> disciplina_Nome = new ArrayList<>(Arrays.asList());
      List<Integer> disciplina_Ch = new ArrayList<>(Arrays.asList());
      List<Integer> disciplina_Nota = new ArrayList<>(Arrays.asList());
      
      List<String> curso_Nome = new ArrayList<>(Arrays.asList());
      List<String> curso_Turno = new ArrayList<>(Arrays.asList());
      
	  int opcao;
	  int opcao2;
	  int cadastros = 0;
	  
	  do {
		  System.out.println("Sistema de Cadastros"
		  		+ "\n01 - Cadastrar cursos "
		  		+ "\n02 - Cadastrar disciplinas"
		  		+ "\n03 - Cadastrar aluno"
		  		+ "\n04 - Acessar 'Sistema do Aluno'");
		  opcao = cad.nextInt();
		  
		  switch(opcao) {
		   case 01:
			   	System.out.println("Nome do curso: ");
				String cad_Curso_Nome = cad.next();
				
				System.out.println("Turno: ");
				String cad_Curso_Turno = cad.next();
				
				curso_Nome.add(cad_Curso_Nome);
				curso_Turno.add(cad_Curso_Turno);
			  
				break;
			   
		   case 02:
			   	System.out.println("Cadastrar Disciplinas");
				System.out.println("Nome da disciplina: ");
				String cad_Disciplina_Nome = cad.next();
				
				System.out.println("Carga Horária: ");
				int cad_Disciplina_Ch = cad.nextInt();
				
				disciplina_Nome.add(cad_Disciplina_Nome);
				disciplina_Ch.add(cad_Disciplina_Ch);
				
				break;
			
		   case 03:
			   System.out.println("Cadastar aluno");
				System.out.println("Primeiro nome do aluno: ");
				String cad_Aluno_Nome = cad.next();
				
				System.out.println("Idade: ");
				int cad_Aluno_Idade = cad.nextInt();
				
				System.out.println("Gerando matrícula...");
				int cad_Aluno_Matricula = num.nextInt(1000);
				System.out.println("Matrícula: " + cad_Aluno_Matricula + "\n");
				
				System.out.println("Adicionar o aluno em um curso");
				System.out.println("Nome do curso: ");
				String cad_Aluno_Curso = cad.next();
				
				if(curso_Nome.contains(cad_Aluno_Curso)) {
					System.out.println("Turno: ");
					String cad_Aluno_Turno = cad.next();
					
					if(curso_Turno.contains(cad_Aluno_Turno)) {
						aluno_Curso.add(cad_Aluno_Curso);
						aluno_Turno.add(cad_Aluno_Turno);
					}
				}else {
					System.out.println("Curso não existente!");
				}
				System.out.println("\n");
				System.out.println("Cadastrar aluno em uma disciplina");
				System.out.println("Nome da disciplina: ");
				String cad_Aluno_Disciplina = cad.next();
				
				if(disciplina_Nome.contains(cad_Aluno_Disciplina)) {
					System.out.println("Nota do aluno: ");
					int cad_Aluno_Disciplina_Nota = cad.nextInt();
					
					aluno_Disciplina.add(cad_Aluno_Disciplina);
					aluno_Nota.add(cad_Aluno_Disciplina_Nota);
					disciplina_Nota.add(cad_Aluno_Disciplina_Nota);
				}else {
					System.out.println("Disciplina não existente!");
				}
				
				aluno_Nome.add(cad_Aluno_Nome);
				aluno_Idade.add(cad_Aluno_Idade);
				aluno_Matricula.add(cad_Aluno_Matricula);
		  }
	  }while(opcao != 04);
	  
      System.out.println("Sistema do Aluno"
				+ "\n1 - Gerenciar ALUNOS"
				+ "\n2 - Gerenciar DISCIPLINAS"
				+ "\n3 - Gerenciar CURSOS"
				+ "\n4 - SAIR \n");
	  
	do {
		  System.out.println("Selecione uma opção: ");
		  opcao2 = cad.nextInt();
		  
		  switch(opcao2) {
	    	case 1:
	    		System.out.println("Alunos matriculados: " + aluno_Nome.toString().replace("[", "").replace("]", ""));
	    		System.out.println("No cursos: " + aluno_Curso.toString().replace("[", "").replace("]", "") + " " + "e no turnos: " + aluno_Turno.toString().replace("[", "").replace("]", ""));
	    		System.out.println("Na disciplinas: " + aluno_Disciplina.toString().replace("[", "").replace("]", "") + " " + "com notas: " + aluno_Nota.toString().replace("[", "").replace("]", ""));
				
				break;
	    		
	    	case 2:
	    		System.out.println("Disciplinas: " + disciplina_Nome.toString().replace("[", "").replace("]", ""));
	    		System.out.println("Notas: " + disciplina_Nota.toString().replace("[", "").replace("]", ""));
	    		
	    		break;
				
	    	case 3:
	    		System.out.println("Curso: " + curso_Nome.toString().replace("[", "").replace("]", ""));
	    		System.out.println("Turno: " + curso_Turno.toString().replace("[", "").replace("]", ""));
	    		
	    		break;
		  	}
		  
		}while(opcao2 != 4);
    }
 }
