package a2208.Robo;

/* Um robô possui algumas características:
 * - Nome;
 * - Carga da Bateria;
 * - Velocidade;
 * 
 * E possui algumas funcionalidades:
 * - Informar o nome do robô, caso não esteja preenchido, informar "Robô sem nome";
 * - Retornar valor de nome, a carga da bateria e velocidade;
 * - andar(): inicia a velocidade do robô em 2;
 * - Aumentar a velocidade: 
 *  - Informar, por parâmetro, a velocidade a acelerar (adiciona na velocidade atual);
 * - Reduzir a velocidade:
 *  - Informar, por parâmetro, a velocidade a reduzir (reduz da velocidade atual);
 *  - Não aceita valor negativo;
 *  - Se a velocidade for 0, não pode reduzir;
 */

public class Robo {
    private String nome;
    private int cargaBateria;
    private int velocidade;

    public Robo(String n, int cB, int v){
        this.setNome(n);
        this.setCargaBateria(cB);
        this.setVelocidade(v);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        if (n.equals(" ")) {
            this.nome = "Nome não informado";
        }else{
            this.nome = n;
        }
    }
    public int getCargaBateria() {
        return this.cargaBateria;
    }
    public void setCargaBateria(int cargaBat) {
        this.cargaBateria = cargaBat;
    }
    public int getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(int vel) {
        this.velocidade = vel;
    }
    public void andar(){
        if (this.getCargaBateria() > 0){
            this.setVelocidade(2);
            System.out.println(getNome() + " está andando...");
            //this.setCargaBateria(this.getCargaBateria() - 5);
        }
    }
    public void aumentarVelocidade(int v){
        if (this.getVelocidade() >= 0) {
            this.setVelocidade(this.getVelocidade() + v);
        }
    }
    public void reduzirVelocidade(int v){
        if (v > 0 && this.getVelocidade() > 0 && v <= this.getVelocidade()) {
            this.setVelocidade(this.getVelocidade() - v);
        }else{
            System.out.println("Velocidade não pode ser negativa");
        }
    }
    public void carregarBateria(int cB){
        if (this.getCargaBateria() < 100 && this.getCargaBateria() >= cB) {
            this.setCargaBateria(this.getCargaBateria() + cB);
        }
    }
    @Override
    public String toString() {
        return "Robô { " + "Nome: " + this.getNome() + " | Carga da Bateria: " + this.getCargaBateria() + " | Velocidade: " + this.getVelocidade() + "}";
    }
}
