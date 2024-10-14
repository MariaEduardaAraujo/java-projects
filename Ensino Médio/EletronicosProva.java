import java.util.Scanner;

/**
* Arquivo: Eletrônicos
* Aula: PROO - Prova 1
*
**/

public class EletronicosProva {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String cod, nome, perg2;
		int perg;
		double celular = 2200.90, tablet = 850.50, notebook = 3500, camera = 1500, hd = 490.80, pendrive = 40; 
		double total = 0;
		
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Marca do produto: ");
		cod = sc.nextLine();
		System.out.print("Nome do produto: ");
		nome = sc.nextLine();
		
		cod = cod.substring(0,3);
		nome = nome.substring(1);*/

		System.out.print("Quantos itens diferentes você deseja comprar? ");
		perg = sc.nextInt();		
		
		for(int i = perg; i <= perg; i++) {
			sc.nextLine();
			System.out.print("Qual o nome do produto? ");
			perg2 = sc.nextLine();
			perg2 = perg2.toLowerCase();
			
			if(perg2.equals("celular")) {
				total = total + 2200.90;
			}if(perg2.equals("tablet")) {
				total = total + 850.50;
			}if(perg2.equals("notebook")) {
				total = total + 3500;
			}if(perg2.equals("camera")) {
				total = total + 1500;
			}if(perg2.equals("hd")) {
				total = total +490.80;
			}if(perg2.equals("pendrive")) {
				total = total + 40;
			}if(total>5000) {
				System.out.println("Valor total: " + (total-(total*0.20)));
			}else {
				System.out.println("Valor total: " + total);
			}
		}
		sc.close();
	}
}
