package org.onlinesinema;

import java.util.List;

public class Viewer {
    private String nickName;
    private int age;
    private List<Cinema> cinemaList;

    public Viewer(String nickName, int age, List<Cinema> cinemaList) {
        this.nickName = nickName;
        this.age = age;
        this.cinemaList = cinemaList;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfFilmsWatched() {
        return this.cinemaList.size();
    }

    public List<Cinema> getCinemaList() {
        return this.cinemaList;
    }
}
