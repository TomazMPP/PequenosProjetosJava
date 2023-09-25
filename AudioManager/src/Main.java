import audioManager.Musicas;
import audioManager.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas();
        musica1.setTitulo("Inatingueto");
        musica1.setCantor("Gustavo Mioto");
        for (int i = 0; i < 13220; i++) {
            musica1.reproduz();
        }

        for (int x = 0; x < 8023; x++) {
            musica1.curte();
        }

        System.out.println(musica1.getTitulo() + " foi curtida " + musica1.getTotalCurtidas() + " vezes");
        System.out.println(musica1.getTitulo() + " foi reproduzida " + musica1.getTotalReproducoes() + " vezes");

        Podcasts podcast1 = new Podcasts();
        podcast1.setTitulo("Nerdcast");
        for (int y = 0; y < 3222; y++) {
            podcast1.setPessoasEscutando(y);
        }
        for (int curtidas = 0; curtidas < 1222; curtidas++) {
            podcast1.curte();
        }
        System.out.println(podcast1.getTitulo() + " está sendo escutado " + podcast1.getPessoasEscutando() + " pessoas");
        System.out.println(podcast1.getTitulo() + " foi curtido " + podcast1.getTotalCurtidas() + " vezes");
        if (podcast1.getClassificacao() >= 9) {
            System.out.println("Classificação: " + podcast1.getClassificacao() + ". Esse podcast é muito bom!");
        } else if (podcast1.getClassificacao() >= 6) {
            System.out.println("Classificação: " + podcast1.getClassificacao() + ". Esse podcast é bom!");
        } else {
            System.out.println("Classificação: " + podcast1.getClassificacao() + ". Esse podcast não é bom!");
        }
    }
}