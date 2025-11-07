package a3110;

import java.time.LocalDate;

public class CalculaIdade {
    private int anoNascimento;

    public void validarAno(int anoNascimento) throws Exception {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        
        if(anoNascimento > anoAtual) {
            throw new Exception("O ano de nascimento não pode ser maior que o ano atual!");
        }
    }

    public int calcular(int anoNascimento) {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();

        return anoAtual - anoNascimento;
    }
}