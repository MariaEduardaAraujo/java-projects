package a1411.Despertador;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DespertadorTest {
    private static final int HORA = 7;

    @Test
    public void deveTocarQuandoHoraIgual7H(){
        FonteTempoMock ftm= new FonteTempoMock(HORA);
        Despertador despt = new Despertador(ftm, HORA);

        assertTrue(despt.tocar(), "O alarme deve tocar quando for 7H");
    }

    @Test
    public void naoDeveTocarQuandoHoraIgual8H(){
        FonteTempoMock ftm = new FonteTempoMock(8);
        Despertador despt = new Despertador(ftm, 7);

        assertFalse(despt.tocar(), "O alarme não deve tocar quando for 8H");
    }
}
