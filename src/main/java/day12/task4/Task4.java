package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Matthew Tuck");
        members1.add("Michael Paget");
        members1.add("Jamie Mathias");
        members1.add("Jason Bowld");

        MusicBand band1 = new MusicBand("Bullet for My Valentine", 1998, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Benjamin Burnley");
        members2.add("Aaron Bruch");
        members2.add("Shaun Foist");
        members2.add("Jasen Rauch");
        members2.add("Keith Wallen");

        MusicBand band2 = new MusicBand("Breaking Benjamin", 1999, members2);

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
