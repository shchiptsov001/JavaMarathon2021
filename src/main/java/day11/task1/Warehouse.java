package day11.task1;

public class Warehouse {
    private int countPickedOrders;      // количество собранных заказов
    private int countDeliveredOrders;  // количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void enlargeCountPickedOrders() {
        countPickedOrders+=1;
    }

    public void enlargeCountDeliveredOrders() {
        countDeliveredOrders+=1;
    }

    public String toString() {
        return "Количество собранных заказов (countPickedOrders) - " + countPickedOrders +
                ", Количество доставленных заказов (countDeliveredOrders) - " + countDeliveredOrders;
    }
}
