public class Filme {
    private String nome;
    private int anoLancamento;
    private double bilheteria;

    public Filme(String nome, int anoLancamento, double bilheteria) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.bilheteria = bilheteria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(double bilheteria) {
        this.bilheteria = bilheteria;
    }
}
