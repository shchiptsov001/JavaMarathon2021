package day12.task3;

public class MusicBand {
    private String name;  // название музыкальной группы
    private int year;     // год основания

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public String toString() {
        return "MusicBand{name=" + name + ", year=" + year + "}";
    }
}
