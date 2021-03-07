package day12.task5;

public class MusicArtist {
    private String name;    // имя
    private int age;        // возраст

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "MusicArtist{name=" + name + ", age=" + age + "}";
    }
}
