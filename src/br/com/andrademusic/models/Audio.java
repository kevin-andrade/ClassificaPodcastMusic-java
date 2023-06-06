package br.com.andrademusic.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    //private double rating;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void enjoy() {
        this.totalLikes++;
    }

    public void reproduce() {
        this.totalReproductions++;
    }

}
