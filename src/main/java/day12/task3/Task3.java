package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Linkin Park", 1996);
        MusicBand band2 = new MusicBand("Слот", 2002);
        MusicBand band3 = new MusicBand("Thirty Seconds to Mars", 1998);
        MusicBand band4 = new MusicBand("ROCK PRIVET", 2017);
        MusicBand band5 = new MusicBand("Nirvana", 1987);
        MusicBand band6 = new MusicBand("Tracktor Bowling", 1996);
        MusicBand band7 = new MusicBand("Amatory", 2001);
        MusicBand band8 = new MusicBand("Breaking Benjamin", 1998);
        MusicBand band9 = new MusicBand("Bullet for My Valentine", 1998);
        MusicBand band10 = new MusicBand("Metallica", 1981);

        List<MusicBand> myMusicBand = new ArrayList<>();

        myMusicBand.add(band1);
        myMusicBand.add(band2);
        myMusicBand.add(band3);
        myMusicBand.add(band4);
        myMusicBand.add(band5);
        myMusicBand.add(band6);
        myMusicBand.add(band7);
        myMusicBand.add(band8);
        myMusicBand.add(band9);
        myMusicBand.add(band10);

        Collections.shuffle(myMusicBand);

        System.out.println(myMusicBand);
        System.out.println(groupsAfter2000(myMusicBand));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> myMusicBand) {
        List<MusicBand> myMusicBand2000 = new ArrayList<>();
        for (MusicBand band : myMusicBand) {
            if (band.getYear() > 2000)
                myMusicBand2000.add(band);
        }
        return myMusicBand2000;
    }
}



