package PaperPleaseExtraterrestre;

public class Especie {
    private String nome;
    private String planeta;
    private String periculosidadeBase;

    public Especie(String nome, String planeta, String periculosidadeBase) {
        this.nome = nome;
        this.planeta = planeta;
        this.periculosidadeBase = periculosidadeBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getPericulosidadeBase() {
        return periculosidadeBase;
    }

    public void setPericulosidadeBase(String periculosidadeBase) {
        this.periculosidadeBase = periculosidadeBase;
    }
}
