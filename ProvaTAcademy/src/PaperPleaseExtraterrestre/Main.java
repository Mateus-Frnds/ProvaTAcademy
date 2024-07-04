package PaperPleaseExtraterrestre;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Especie especie1 = new Especie("Xenomorph ", "Xenomorph Prime", "Perigoso");
        Especie especie2 = new Especie("Predator", "Yautja Prime", "Imprevisível");

        Alienigena alien1 = new Alienigena(1, "Cleiton", "Xenomorph",
                "", LocalDate.now());
        Alienigena alien2 = new Alienigena(2, "Marcos", "Predator",
                "", LocalDate.now());

        Planeta planeta = new Planeta("Terra");
        planeta.addEspecie(especie1);
        planeta.addEspecie(especie2);

        Registro registro = new Registro();
        registro.registrar(alien1);
        registro.registrar(alien2);

        List<Especie> especiesPlaneta = planeta.getEspecies();
        registro.nivelPericulosidade(especiesPlaneta);

        registro.colocarEmQuarentena(alien2);

        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio(registro.getAlienigenas());

        registro.rankingPericulosidade();
        registro.listarPlanetas(List.of(planeta));
        registro.listarEspecies(especiesPlaneta);
        List<Alienigena> alienigenasEspecie = registro.buscarPorEspecie("et bilu");
        List<Alienigena> alienigenasRecentes = registro.buscarPorEntradaRecente();
    }
}
