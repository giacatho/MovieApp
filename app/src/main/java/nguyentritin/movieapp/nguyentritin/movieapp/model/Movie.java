package nguyentritin.movieapp.nguyentritin.movieapp.model;

/**
 * Created by giacatho on 9/21/16.
 */

public class Movie {
    public static Movie[] movies = {
            new Movie("Movie 1"),
            new Movie("Movie 2")
    };

    public Movie(String name) {
        this.setName(name);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
