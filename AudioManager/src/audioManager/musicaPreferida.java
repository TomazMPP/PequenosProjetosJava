package audioManager;
import audioManager.Audio;

public class musicaPreferida {

    public void inclui(Audio audio) {
       if (audio.getClassificacao() > 7) {
           System.out.println("Sucesso absoluto e um dos títulos preferidos da galera!");
       } else {
           System.out.println("Um dos títulos que todo mundo está curtindo!");
       }
    }
}
