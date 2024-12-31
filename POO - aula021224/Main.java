public class Main {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        f1.nome = "João";
        f1.cpf = "123.123.123.12";
        f1.salario = 1000f;

        Funcionario f2 = new Funcionario();
        f2.nome = "Marcos";
        f2.cpf = "123.121.122.12";
        f2.salario = 3000f;

        Professor p1 = new Professor();
        p1.nome = "Elias";
        p1.cpf = "465.465.465.45";
        p1.salario = 6000f;
        p1.formacao = "História";

        Motorista m1 = new Motorista();
        m1.nome = "José";
        m1.cpf = "789.789.789.78";
        m1.salario = 2500f;
        m1.habilitacao = "D";

        Tecadmin t1 = new Tecadmin();
        t1.nome = "Roberto";
        t1.cpf = "159.159.159.15";
        t1.salario = 6500f;
        t1.setor = "Financeiro";

        System.out.println("O funcionário " + f1.nome + " receberá: " + f1.calcularImposto());
        System.out.println("O funcionário " + f2.nome + " receberá: " + f2.calcularImposto());
        System.out.println("");
        System.out.println("O funcionário " + p1.nome + " receberá: " + p1.calcularImposto());
        System.out.println("");
        System.out.println("O funcionário " + m1.nome + " receberá: " + m1.calcularImposto());
        System.out.println("");
        System.out.println("O funcionário " + t1.nome + " receberá: " + t1.calcularImposto());
    }
}
