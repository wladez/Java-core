package homework.io;

import java.io.Serializable;
import java.util.ArrayList;

public class Film implements Serializable {
    private String name;
    private String genre;
    private ArrayList<Actor> actors;

    public Film(String name, String genre, ArrayList<Actor> list){
        this.name = name;
        this.genre = genre;
        actors = list;
    }

    @Override
    public String toString() {
        return name + " " + genre + " " + actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }
}
