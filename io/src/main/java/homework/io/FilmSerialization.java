package homework.io;

import java.io.*;
import java.util.ArrayList;

public class FilmSerialization {
    private ArrayList<Film> films;

    public FilmSerialization(ArrayList<Film> films){
        this.films = films;
    }

    public void serializeIt(){
        try(FileOutputStream out = new FileOutputStream("./io/src/main/resources/films.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)){
            objectOutputStream.writeObject(films);
        }
        catch (IOException e){
                e.printStackTrace();
        }
    }

    public ArrayList<Film> deserializeIt() throws ClassNotFoundException {
        ArrayList<Film> newFilms = null;
        try(FileInputStream input = new FileInputStream("./io/src/main/resources/films.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(input)) {
            newFilms = (ArrayList<Film>) objectInputStream.readObject();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return newFilms;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ArrayList<Film> films = new ArrayList<>();
        ArrayList<Actor> interstellarActors = new ArrayList<>();
        interstellarActors.add(new Actor("Matthew McConaughey", 48));
        interstellarActors.add(new Actor("Anne Hathaway", 35));
        films.add(new Film("Interstellar", "science fiction drama", interstellarActors));
        ArrayList<Actor> warDosActors = new ArrayList<>();
        warDosActors.add(new Actor("Jonah Hill", 33));
        warDosActors.add(new Actor("Miles Teller", 30));
        films.add(new Film("War Dogs", "comedy", warDosActors));
        FilmSerialization filmSerialization = new FilmSerialization(films);
        filmSerialization.serializeIt();
        ArrayList<Film> deserializedFilms = filmSerialization.deserializeIt();
        for (Film elem: deserializedFilms) {
            System.out.println(elem);
        }
    }
}
