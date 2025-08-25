class Funcionario{
    String nome;
    String cpf;
    Float salario;

    Float calcularImposto(){
        if (this.salario < 2000) {
            return this.salario;
        }

        if (this.salario < 2000 && this.salario < 5000) {
            return this.salario * 0.9f;
        }
        return this.salario * 0.8f;
    }
}