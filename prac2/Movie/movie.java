package Movie;

import java.util.ArrayList;
import java.util.List;

public class movie {
    private List<MovieItem> MovieItems;

    public movie() {
        this.MovieItems = new ArrayList<>();
    }
    public void add
    MovieItem(MovieItem item) {
        MovieItems.add(item);
    }
    public void printMovieDetails() {
        for (MovieItem item : MovieItems) {
            item.printDetails();
        }
    }
}
