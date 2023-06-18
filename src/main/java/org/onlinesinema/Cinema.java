package org.onlinesinema;

public class Cinema {
    private String name;
    private String genre;
    private double watch;

    public Cinema(String name, String genre, double watch) {
        this.name = name;
        this.genre = genre;
        this.watch = watch;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getWatch() {
        return watch;
    }
}
