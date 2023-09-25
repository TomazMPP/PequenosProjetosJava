package audioManager;

public abstract class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
// System.out.println("Tocando " + this.titulo);
        this.totalReproducoes++;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

}

