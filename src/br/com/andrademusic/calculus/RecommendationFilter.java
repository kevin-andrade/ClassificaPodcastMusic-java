package br.com.andrademusic.calculus;

public class RecommendationFilter {

    public void filtrate (Rank rank) {
        if (rank.getRating() >= 10) {
            System.out.println("Está com uma excelente classificação!");
        } else if (rank.getRating() >=7 ) {
            System.out.println("Está com uma boa classificação!");
        } else {
            System.out.println("Adicione em sua playlist para assistir depois");
        }
    }

}
