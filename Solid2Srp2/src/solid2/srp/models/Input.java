package solid2.srp.models;

public class Input {
    public Order inputFromConsole(){
        String clientName = Utils.prompt("Client name: ");
        String product = Utils.prompt("Product: ");
        int qnt = Integer.parseInt(Utils.prompt("Quantity: "));
        int price = Integer.parseInt(Utils.prompt("Price: "));
        return new Order(clientName, product, qnt, price);
    }
}
