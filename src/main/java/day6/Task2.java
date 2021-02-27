package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane("Ту-160", 2014,54,110000);
        myAirplane.setYear(2015);
        myAirplane.setLength(67);
        myAirplane.fillUp(6);
        myAirplane.fillUp(24);
        myAirplane.info();
    }
}