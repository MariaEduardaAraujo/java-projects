package a1411.Despertador;

public class FonteTempoMock implements IHora{
    private final int horaSimulada;
    
    public FonteTempoMock(int horaSimulada){
        this.horaSimulada = horaSimulada;
    }

    @Override
    public int getHoraAtual(){
        return this.horaSimulada;
    }
}