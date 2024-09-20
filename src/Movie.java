import java.util.ArrayList;

public class Movie extends Media {
    int length;
    String description;
    double grossing;

    public Movie(String title, String rating, String director, ArrayList<String> cast, int length, String description, double grossing) {
        super(title, rating, director, cast);
        this.length = length;
        this.description = description;
        this.grossing = grossing;
    }

}


