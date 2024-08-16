import java.lang.annotation.*;
// import java.lang.reflect.*;

// Define the repeatable annotation @Game
@Repeatable(Games.class)
@interface Game {
    String name();
    String day();
}

// Define the container annotation @Games
@Retention(RetentionPolicy.RUNTIME)
@interface Games {
    Game[] value();
}

// Use the repeatable annotation @Game multiple times
@Game(name = "Cricket", day = "Sunday")
@Game(name = "Hockey", day = "Friday")
@Game(name = "Football", day = "Saturday")
public class RepeatingAnnotations {

    public static void main(String[] args) {
        // Retrieve annotations of type Game from RepeatingAnnotations class
        Game[] games = RepeatingAnnotations.class.getAnnotationsByType(Game.class);
        
        // Print each game's name and day
        for (Game game : games) {
            System.out.println(game.name() + " on " + game.day());
        }
    }
}

