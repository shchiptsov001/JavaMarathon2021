package day11.task1;

public class Picker extends Warehouse implements Worker {
    private Warehouse myWarehouse;
    private int salary;        // заработная плата
    private boolean isPayed;  // был выплачен бонус или нет

    public Picker(Warehouse myWarehouse) {
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
        salary += 80;
        myWarehouse.enlargeCountPickedOrders();
    }

    public void bonus() {
        if (myWarehouse.getCountPickedOrders() == 10000 && !isPayed) {
            salary += 70000;
            isPayed = true;
        }
        else if (myWarehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
        else if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
