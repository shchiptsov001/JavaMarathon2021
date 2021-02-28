package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike myMotorbike = new Motorbike(2007, "Black", "Triumph Speed Triple 955i");

        System.out.println(
                "Model - " + myMotorbike.getModel() + ", Color - " + myMotorbike.getColor() + ", Year - " + myMotorbike.getYear());
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

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
}
