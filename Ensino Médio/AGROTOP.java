import java.util.*;
//import java.util.stream.IntStream;

public class AGROTOP {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		String[] usuario = new String [0]; 
		String[] produtos = new String [0];
		Integer[] valor = new Integer [0];
		
		List<String> user = new ArrayList<>(Arrays.asList(usuario));
		List<String> prod = new ArrayList<>(Arrays.asList(produtos));
		List<Integer> val = new ArrayList<>(Arrays.asList(valor));
		
		System.out.println("Dados do Usurio");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("E-mail: ");
		String email = sc.nextLine();
		System.out.println("Senha: ");
		String senha = sc.nextLine();
		
		System.out.println("Produto: ");
		String produto = sc.nextLine();
		
		System.out.println("Valor: ");
		/*valor = parseInt(sc.next());*/

		user.add(nome);
		user.add(email);
		user.add(senha);
		prod.add(produto);
		/*val.add(valor);*/
		
		System.out.println(user);
		
		System.out.println("Produtos: " + prod);
		
		for(float i : valor) {
			sum += i;
		}
		System.out.println("Valor: " + sum);
	}

}
