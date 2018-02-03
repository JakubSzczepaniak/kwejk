package pl.projekt.kwejk.model;

public class Gif {

    private String name;

    private String username;

    private boolean favorite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getThymeleafFilePath(){
        return"/gifs/"+getName()+".gif";
    }
    public Gif(String name){
        this.name = name;
    }

    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }
}
