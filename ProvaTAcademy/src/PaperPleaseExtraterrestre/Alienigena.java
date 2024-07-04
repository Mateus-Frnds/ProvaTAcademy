package PaperPleaseExtraterrestre;
import java.time.LocalDate;

public class Alienigena {
    private int id;
    private String nome;
    private String especie;
    private String periculosidade;
    private LocalDate data;
    private boolean quarentena;

    public Alienigena(int id, String nome, String especie, String periculosidade, LocalDate data) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.periculosidade = periculosidade;
        this.data = data;
        this.quarentena = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPericulosidade() {
        return periculosidade;
    }

    public void setPericulosidade(String periculosidade) {
        this.periculosidade = periculosidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isQuarentena() {
        return quarentena;
    }

    public void setQuarentena(boolean quarentena) {
        this.quarentena = quarentena;
    }
}
