package day6;


public class Motorbike {
    int year;
    String color;
    String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference (int inputYear) {
        year = inputYear - year;
        if (year >= 0) {
            return year;
        } else {
            return year * (-1);
        }
    }
}
