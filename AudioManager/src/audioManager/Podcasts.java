package audioManager;

public class Podcasts extends Audio {

    private int pessoasEscutando;

    public int getPessoasEscutando() {
        return pessoasEscutando;
    }

    public void setPessoasEscutando(int pessoasEscutando) {
        this.pessoasEscutando = pessoasEscutando;
    }

    @Override
    public int getClassificacao() {
        if (this.getPessoasEscutando() >= 500) {
            return 10;
        } else if (this.getPessoasEscutando() >= 220) {
            return 7;
        } else {
            return 4;
        }
    }
}
