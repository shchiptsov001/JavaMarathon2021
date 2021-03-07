package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Matthew Tuck", 41));
        members1.add(new MusicArtist("Michael Paget", 42));
        members1.add(new MusicArtist("Jamie Mathias", 40));
        members1.add(new MusicArtist("Jason Bowld", 40));

        MusicBand band1 = new MusicBand("Bullet for My Valentine", 1998, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Benjamin Burnley", 42));
        members2.add(new MusicArtist("Aaron Bruch", 48));
        members2.add(new MusicArtist("Shaun Foist", 37));
        members2.add(new MusicArtist("Jasen Rauch", 39));
        members2.add(new MusicArtist("Keith Wallen", 41));

        MusicBand band2 = new MusicBand("Breaking Benjamin", 1999, members2);

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
