import java.util.Scanner;

public class CalculadoraTemperatura {
	public static void main(String[] args) {
		double cel = 0, far = 0, kel = 0, valor = 0;
		String temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome temperatura que você quer converter: ");
		temp = sc.nextLine();
		System.out.print("Valor da temperatura: ");
		valor = sc.nextDouble();
		
		if(temp.equals("celsius") && valor > 0 || valor < 0) {
			far = (1.8*valor) + 32;
			System.out.println("Temperatura em Fahrenheit: " + Math.ceil(far));
			kel = valor + 273;
			System.out.println("Temperatura em Kelvin: " + Math.ceil(kel));
		}else if(temp.equals("kelvin") && valor >0 || valor < 0) {
			cel = valor - 273;
			System.out.println("Temperatura em Celsius: " + Math.ceil(cel));
			far = (valor * 9/5) - 459.67;
			System.out.println("Temperatura em Fahrenheit: " + Math.ceil(far));
		}else if(temp.equals("fahrenheit") && valor >0 || valor < 0) {
			kel = (valor + 459.67) * 5/9;
			System.out.println("Temperatura em Kelvin: " + Math.ceil(kel));
			cel = (valor - 32) * 5/9;
			System.out.println("Temperatura em Celsius: " + Math.ceil(cel));
		}

		sc.close();
	}

}
