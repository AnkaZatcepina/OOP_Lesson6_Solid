package solid2;

import solid2.srp.models.Input;
import solid2.srp.models.Order;
import solid2.srp.models.Persister;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Input().inputFromConsole();
        Persister persister = new Persister("order.json");
        persister.saveToJson(order);
    }
}
