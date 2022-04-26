public class Computador {
		boolean monitor;
		boolean gabinete;
		double preco;
		
		void monitor() {
			if (monitor == true) {
				System.out.println("Tem monitores");
			}
			else {
				System.out.println("Não tem");
			}
		}
		void ganinete() {
			if (gabinete) {
				System.out.println("Tem gabinetes");
			}
			else {
				System.out.println("Não tem");
			}
		}
		void preco() {
			System.out.println("Preço de cada computador: " + preco);
		}

}
