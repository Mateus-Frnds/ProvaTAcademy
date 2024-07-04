package PaperPleaseExtraterrestre;
import java.util.ArrayList;
import java.util.List;

public class Planeta {
    private String nome;
    private List<Especie> especies;

    public Planeta(String nome) {
        this.nome = nome;
        this.especies = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    public void addEspecie(Especie especie) {
        especies.add(especie);
    }
}
