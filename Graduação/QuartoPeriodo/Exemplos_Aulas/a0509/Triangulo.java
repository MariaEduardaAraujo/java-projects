package a0509;

/* Crie uma classe de um Triangulo que possui as caracteristas (base e a altura) e realiza o cálculo da sua área. 
* Crie um construtor que recebe como parâmetro os valores da base e da altura.
*/  

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double b, double a){
        this.setBase(b);
        this.setAltura(a);
    }

    public double getBase(){
        return this.base;
    }
    public void setBase(double b){
        this.base = b;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }

    public double calcularArea(){
        return ((this.getBase()*this.getAltura())/2);
    }
}
