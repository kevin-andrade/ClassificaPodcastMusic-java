package br.com.andrademusic.models;

import br.com.andrademusic.calculus.Rank;
import br.com.andrademusic.models.Audio;

public class Podcast extends Audio implements Rank {
    private String presenter;
    private String description;

    public String getPresenter() {
        return presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setPresenter(String presenter) {

        this.presenter = presenter;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void cardPodcast() {
        System.out.println("Nome Podcast: " + getTitle());
        System.out.println("NOme do(a) apresentador(a): " + getPresenter());
        System.out.println("Descrição: " + getDescription());
        System.out.println("Total de likes: " + getTotalLikes());
    }

    @Override
    public int getRating() {
        if (this.getTotalLikes() > 50) {
            return 10;
        } else {
            return 7;
        }
    }

}
