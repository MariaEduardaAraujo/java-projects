import java.io.*;
import java.util.Scanner;

public class CutTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o nome do arquivo (ou '-' para entrada padrão): ");
            String fonteEntrada = sc.nextLine();

            System.out.print("Digite o delimitador (o padrão é tabulação '\\t'): ");
            String delimitador = sc.nextLine();
            if (delimitador.isEmpty()) {
                delimitador = "\t";
            }

            System.out.print("Digite os campos a extrair (separados por vírgula, ex.: 1,2): ");
            String entradaCampos = sc.nextLine();
            String[] camposSelecionados = entradaCampos.split(",");

            BufferedReader leitor;
            if ("-".equals(fonteEntrada)) {
                leitor = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\n Ctrl + Z para fechar o terminal após digitar \n");
            } else {
                leitor = new BufferedReader(new FileReader(fonteEntrada));
            }

            System.out.println("Processando...");
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(delimitador);
                for (String campo : camposSelecionados) {
                    int indice = Integer.parseInt(campo.trim()) - 1;
                    if (indice >= 0 && indice < campos.length) {
                        System.out.print(campos[indice] + delimitador);
                    }
                }
                System.out.println();
            }
            leitor.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Formato de campo inválido: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
