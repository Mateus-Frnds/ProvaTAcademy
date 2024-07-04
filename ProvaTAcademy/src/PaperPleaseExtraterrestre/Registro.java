package PaperPleaseExtraterrestre;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Alienigena> alienigenas;

    public Registro() {
        this.alienigenas = new ArrayList<>();
    }

    public void registrar(Alienigena alienigena){
        alienigenas.add(alienigena);
    }

    public void nivelPericulosidade(List<Especie> especies) {
        for (Alienigena alienigena : alienigenas) {
            for (Especie especie : especies) {
                if (alienigena.getEspecie().equals(especie.getNome())) {
                    alienigena.setPericulosidade(avaliarPericulosidade(alienigena, especie));
                }
            }
        }
    }

    private String avaliarPericulosidade(Alienigena alienigena, Especie especie) {
        String periculosidadeBase = especie.getPericulosidadeBase();
        return periculosidadeBase;
    }

    public void colocarEmQuarentena(Alienigena alienigena){
        alienigena.setQuarentena(true);
    }

    public void gerarRelatorio() {
        for (Alienigena alienigena : alienigenas) {
            System.out.println("nome: " + alienigena.getNome());
            System.out.println("espécie: " + alienigena.getEspecie());
            System.out.println("quarentena: " + (alienigena.isQuarentena() ? "sim" : "não"));
            System.out.println("periculosidade: " + alienigena.getPericulosidade());
            System.out.println("data: " + alienigena.getData());
            System.out.println("------------------------------------");
        }
    }

    public List<Alienigena> getAlienigenas() {
        return alienigenas;
    }

    public void setAlienigenas(List<Alienigena> alienigenas) {
        this.alienigenas = alienigenas;
    }

    public void rankingPericulosidade() {
    }

    public void listarPlanetas(List<Planeta> planetas) {
        for (Planeta planeta : planetas) {
            System.out.println("planeta: " + planeta.getNome());
        }
    }

    public void listarEspecies(List<Especie> especies) {
        for (Especie especie : especies) {
            System.out.println("espécie: " + especie.getNome());
        }
    }

    public List<Alienigena> buscarPorEspecie(String nomeEspecie) {
        List<Alienigena> resultado = new ArrayList<>();
        for (Alienigena alienigena : alienigenas) {
            if (alienigena.getEspecie().equals(nomeEspecie)) {
                resultado.add(alienigena);
            }
        }

        return resultado;
    }

    public List<Alienigena> buscarPorEntradaRecente() {
        List<Alienigena> resultado = new ArrayList<>();
        LocalDate dataLimite = LocalDate.now().minusMonths(6);
        for (Alienigena alienigena : alienigenas) {
            if (alienigena.getData().isAfter(dataLimite)) {
                resultado.add(alienigena);
            }
        }

        return resultado;
    }
}
