package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int userYear) {
        year = userYear;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String userColor) {
        color = userColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String userModel) {
        model = userModel;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int inputYear) {
        return Math.abs(inputYear - year);
    }
}
