package br.com.andrademusic.models;

import br.com.andrademusic.calculus.Rank;
import br.com.andrademusic.models.Audio;

public class Music extends Audio implements Rank {
    private String album;
    private String artiste;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public String getArtiste() {
        return artiste;
    }

    public String getGenre() {
        return genre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void cardMusic() {
        System.out.println("Nome: " + getTitle());
        System.out.println("Nome do(a) cantor(a): " + getArtiste());
        System.out.println("Total de visualizacões: " + getTotalReproductions());
    }

    @Override
    public int getRating() {
        if (this.getTotalReproductions() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

}
