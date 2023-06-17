package org.onlinesinema;

public class Viewer {
    private String nickName;
    private int age;
    private int numberOfFilmsWatched;

    public Viewer(String nickName, int age, int numberOfFilmsWatched) {
        this.nickName = nickName;
        this.age = age;
        this.numberOfFilmsWatched = numberOfFilmsWatched;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfFilmsWatched() {
        return numberOfFilmsWatched;
    }
}
