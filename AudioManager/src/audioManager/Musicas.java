package audioManager;

public class Musicas extends Audio {
    private String cantor;
    private String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
