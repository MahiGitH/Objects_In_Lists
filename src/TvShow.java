public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String showName, int numberOfEpisodes, String genre){
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }
    public String getShowName() {
        return showName;
    }
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the TV show is "+ getShowName() + " with " + getNumberOfEpisodes()+ " numbers of episodes."
                + " The genre is " + getGenre() + ".";
    }
}
