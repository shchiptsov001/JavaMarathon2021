package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setYear(2016);
        myCar.setColor("Grey");
        myCar.setModel("Volvo S60");
        System.out.println(
                "Model - " + myCar.getModel() + ", Color - " + myCar.getColor() + ", Year - " + myCar.getYear());
    }
}

class Car {
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
}
