package day11.task1;

import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {
        Warehouse myWarehouse = new Warehouse();
        Courier myCourier = new Courier(myWarehouse);
        Picker myPicker = new Picker(myWarehouse);
        myCourier.doWork();
        myCourier.doWork();

        myPicker.doWork();
        myPicker.doWork();

        System.out.println(myWarehouse.toString());
        System.out.println(myCourier.toString());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
