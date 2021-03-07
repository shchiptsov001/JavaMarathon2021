package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;  // название музыкальной группы
    private int year;     // год основания
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear(){
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public String toString() {
        return "MusicBand{name=" + name + ", year=" + year + "}";
    }

    public static  void transferMembers(MusicBand groupA, MusicBand groupB) {
        for (String member : groupA.getMembers())
            groupB.getMembers().add(member);

        groupA.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }
}
