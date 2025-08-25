package aula220825.Robo;

public class LojaRobos {
    public static void main(String[] args) {
        Robo r1 = new Robo("GustavoGuanabô", 100, 0);
        Robo r2 = new Robo("KenjiBô", 35, 5);

        r1.andar();
        //r2.andar();
        r2.aumentarVelocidade(8);

        System.out.println("\n" + r1);
        System.out.println(r2);
    }
}