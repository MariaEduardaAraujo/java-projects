package a1411.Despertador;

public class Despertador{
    private final IHora hora;
    private final int horaAlarme;

    public Despertador(IHora hS, int horaAlarme){
        this.hora = hS;
        this.horaAlarme = horaAlarme;
    }

    public boolean tocar(){
        int horaAtual = hora.getHoraAtual();
        System.out.println("Hora atual: " + horaAtual);

        return horaAtual == horaAlarme;
    }
}