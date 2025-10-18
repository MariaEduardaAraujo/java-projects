package a2609;

import java.util.Scanner;

public class Investimento {
    Conta conta;
    TipoInvestimento tipoInvestimento;

    public Investimento(Conta c) {
        this.conta = c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tipo de investimento:");


        int i = 0;
        for (TipoInvestimento tipo : TipoInvestimento.values()) {
            i++;
            System.out.println(i+"- "+tipo);
        }

        int opcao = sc.nextInt();

        try {
            if(opcao == 1) {
                tipoInvestimento = TipoInvestimento.POUPANCA;
            }
            else if(opcao == 2) {
                tipoInvestimento = TipoInvestimento.FUNDOS_INVESTIMENTO;
            }
            else if(opcao == 3) {
                tipoInvestimento = TipoInvestimento.FII;
            }
            else if(opcao == 4) {
                tipoInvestimento = TipoInvestimento.CDB;
            }
            else if(opcao == 5) {
                tipoInvestimento = TipoInvestimento.TESOURO;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de investimento inválido: "+e.getMessage());
        }
        sc.close();
    }
}