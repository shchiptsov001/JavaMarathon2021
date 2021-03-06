package day11.task1;

public class Courier implements Worker {
    private Warehouse myWarehouse;
    private int salary;        // заработная плата
    private boolean isPayed;  // был выплачен бонус или нет

    public Courier(Warehouse myWarehouse) {
        this.myWarehouse = myWarehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "Заработная плата - " + salary + ". Был ли выплачен бонус? - " + isPayed;
    }

    public void doWork() {
        salary = salary + 100;
        myWarehouse.enlargeCountDeliveredOrders();
    }

    public void bonus() {
        if (myWarehouse.getCountDeliveredOrders() == 10000 && !isPayed) {
            salary += 50000;
            isPayed = true;
        }
        else if (myWarehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
        else if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
