package org.onlinesinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        Cinema movie1 = new Cinema("The Shawshank Redemption", "Drama", 2);
        Cinema movie2 = new Cinema("The Dark Knight", "Action", 2.5);
        Cinema movie3 = new Cinema("Forrest Gump", "Drama", 2.5);
        Cinema movie4 = new Cinema("Star Wars", "Fantasy", 2.25);
        Cinema movie5 = new Cinema("Jurassic Park", "Adventure", 2.25);

        List<Cinema> viewedMovies1 = new ArrayList<>();
        viewedMovies1.add(movie1);
        viewedMovies1.add(movie2);
        viewedMovies1.add(movie3);
        Viewer viewer1 = new Viewer("John", 22, viewedMovies1);

        List<Cinema> viewedMovies2 = new ArrayList<>();
        viewedMovies2.add(movie2);
        viewedMovies2.add(movie4);
        Viewer viewer2 = new Viewer("Jane", 30, viewedMovies2);

        List<Cinema> viewedMovies3 = new ArrayList<>();
        viewedMovies3.add(movie1);
        viewedMovies3.add(movie5);
        Viewer viewer3 = new Viewer("Bob", 27, viewedMovies3);

        List<Cinema> viewedMovies4 = new ArrayList<>();
        viewedMovies4.add(movie3);
        viewedMovies4.add(movie4);
        Viewer viewer4 = new Viewer("Alice", 25, viewedMovies4);

        List<Cinema> viewedMovies5 = new ArrayList<>();
        viewedMovies5.add(movie2);
        viewedMovies5.add(movie5);
        Viewer viewer5 = new Viewer("Mike", 20, viewedMovies5);

        List<Viewer> viewers = new ArrayList<>();
        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);

        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Average age: " + averageAge);
    }
}
