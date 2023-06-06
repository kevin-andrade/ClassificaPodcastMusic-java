import br.com.andrademusic.calculus.RecommendationFilter;
import br.com.andrademusic.models.Music;
import br.com.andrademusic.models.Podcast;

public class ScriptTest {
    public static void main(String[] args) {

        //Teste Avaliacao Musica (+ 2000 visualizações)
        Music musicCharllie1 = new Music();
        musicCharllie1.setTitle("Beco sem saida");
        musicCharllie1.setArtiste("Charllie Brown Jr");
        musicCharllie1.setGenre("Rock");

        for (int i = 0; i < 3000; i++) {
            musicCharllie1.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            musicCharllie1.enjoy();
        }

        //Teste Avaliacao podcast (curtidas > 50)
        Podcast podInteligencia = new Podcast();
        podInteligencia.setPresenter("Rogerio Villela");
        podInteligencia.setTitle("Inteligência Limitada - Ltda");
        podInteligencia.setDescription("Desvendando a Inteligencia artificial");

        for (int i = 0; i < 1000; i++) {
            podInteligencia.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            podInteligencia.enjoy();
        }

        //Test Recomendacoes
        RecommendationFilter filter = new RecommendationFilter();
        musicCharllie1.cardMusic();
        filter.filtrate(musicCharllie1);

        podInteligencia.cardPodcast();
        filter.filtrate(podInteligencia);

    }

}

