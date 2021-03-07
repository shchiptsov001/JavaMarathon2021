package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;  // название музыкальной группы
    private int year;     // год основания
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear(){
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String toString() {
        return "MusicBand{name=" + name + ", year=" + year + "}";
    }

    public static  void transferMembers(MusicBand groupA, MusicBand groupB) {
        for (MusicArtist member : groupA.getMembers())
            groupB.getMembers().add(member);

        groupA.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }
}
