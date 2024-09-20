import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         ArrayList<String> cast=new ArrayList<>();
         cast.add("Sam");
         cast.add("Jimmy");
        Media homeAlone =new Media("Home Alone","PG:13","Frank" ,cast);
        Movie seattle = new Movie("Seattle","PG-13","Steve",cast,34,"Action",1000000);
        TvShow friends =new TvShow("Friends","PG-13","Megan",cast,55,"Comedy",300000,6,140);
        System.out.println(homeAlone.getTitle());
        System.out.println(cast);
        System.out.println(seattle.getDirector());
        System.out.println(seattle.length);
        System.out.println(friends.getEpisodes());
        System.out.println(friends.getRating());




    }
}