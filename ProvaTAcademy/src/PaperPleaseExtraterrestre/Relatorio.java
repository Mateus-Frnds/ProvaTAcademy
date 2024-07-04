package PaperPleaseExtraterrestre;
import java.util.List;

public class Relatorio {
    public void gerarRelatorio(List<Alienigena> alienigenas) {
        for (Alienigena alienigena : alienigenas) {
            System.out.println("nome: " + alienigena.getNome());
            System.out.println("especie: " + alienigena.getEspecie());
            System.out.println("quarentena: " + (alienigena.isQuarentena() ? "sim" : "nao"));
            System.out.println("periculosidade: " + alienigena.getPericulosidade());
            System.out.println("data de entrada: " + alienigena.getData());
            System.out.println("--------------------------");
        }
    }
}
