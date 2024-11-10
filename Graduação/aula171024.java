//import java.util.Scanner;

//Lista 02

/*1) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se
formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser
menor que a soma dos outros 2 lados.

public class aula171024 {
  public static void main(String[] args) {
    int a, b, c;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite três valores: ");
    System.out.print("A: ");
    a = sc.nextInt();
    System.out.print("B: ");
    b = sc.nextInt();
    System.out.print("C: ");
    c = sc.nextInt();

    if (a < (b+c) && b < (a+c) && c < (b+a)) {
      System.out.println("Formam um triângulo!");
    }else{
      System.out.println("Não formam um triângulo");
    }
    
    sc.close();
  }
}*/

/*2) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser
apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro
valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a
mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem
‘Acesso permitido’.

public class aula171024 {
  public static void main(String[] args) {
    int cod = 1234, senha = 9999;
    int user, novSenha;

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o código: ");
    user = sc.nextInt();

    if (cod == user) {
      System.out.print("Digite a senha: ");
      novSenha = sc.nextInt();

      if (senha == novSenha) {
        System.out.println("Acesso permitido");
      }else{
        System.out.println("Senha incorreta");
      }
    }else{
      System.out.println("Usuário inválido!");
    }

    sc.close();
  }
}*/

/*3) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

public class aula171024 {
    public static void main(String args[]) {
        int a, b, c, maior;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três valores: \n");
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();

        maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        
        System.out.println("O maior valor é: " + maior);

        sc.close();
    }
}*/

/*4) Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja
maior que 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor somado seja
menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

public class aula171024 {
    public static void main(String[] args) {
      int num1, num2, soma;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite dois valores para serem somados: ");
      System.out.print("Valor 1: ");
      num1 = sc.nextInt();
      System.out.print("Valor 2: ");
      num2 = sc.nextInt();

      soma = num1 + num2;

      if (soma > 20) {
        System.out.println("O valor da soma desses dois números é: " + (soma + 8));
      }else if (soma <= 20) {
        System.out.println("O valor da soma desses dois números é: " + (soma - 5));
      }
      sc.close();
    }
}*/

/*5) Faça um algoritmo que leia um número e mostre uma das mensagens: é múltiplo de 3 ou
não é múltiplo de 3. 

public class aula171024 {
  public static void main(String[] args) {
    int num;

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    num = sc.nextInt();

    if (num % 3 == 0) {
      System.out.println("É multiplo de 3");
    }else{
      System.out.println("Não é múltiplo de 3");
    }

    sc.close();
  }
}*/