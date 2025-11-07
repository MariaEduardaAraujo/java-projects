package a3110;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculaIdadeTest {
    private int anoInvalidoQuandoMaiorQueAnoAtual = 2026;
    private int anoValidoQuandoMenorIgualAnoAtual = 2025;
    private CalculaIdade calc;

    @Before
    public void setup() {
        this.calc = new CalculaIdade();
    }

    @Test
    public void anoNascimentoInvalido() {
        try {
            this.calc.validarAno(anoInvalidoQuandoMaiorQueAnoAtual);
        } catch (Exception e) {
            assertEquals("O ano de nascimento não pode ser maior que o ano atual!", e.getMessage());
        }
    }

    @Test
    public void anoNascimentoValido() {
        try {
            this.calc.validarAno(anoValidoQuandoMenorIgualAnoAtual);
        } catch(Exception e) {
            fail("Não deveria lançar exceção");
        }
    }

    @Test
    public void calcularIdadeValida() {
        try {
            //this.calc.calcular(anoValidoQuandoMenorIgualAnoAtual);
            assertEquals(0, this.calc.calcular(anoValidoQuandoMenorIgualAnoAtual));
        } catch(Exception e) {
            fail("Não deveria lançar exceção");
        }
    }

    @Test
    public void calcularComIdadeInvalida() {
        try {
            this.calc.calcular(anoInvalidoQuandoMaiorQueAnoAtual);
        } catch (Exception e) {
            assertEquals("O ano de nascimento não pode ser maior que o ano atual!", e.getMessage());
        }
    }

    @Test
    public void anoNascimentoIgualAnoAtual() {
        LocalDate dataAtual = LocalDate.now();
        int anoNascimento = dataAtual.getYear();

        try {
            assertEquals(0, this.calc.calcular(anoNascimento));
        } catch(Exception e) {
            fail("Não deveria lançar exceção");
        }
    }

    @After
    public void tearDown() {
        System.out.println("Finalizando os testes...");
    }
}