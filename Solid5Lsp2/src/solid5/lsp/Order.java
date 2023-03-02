package solid5.lsp;

public class Order extends AbstractOrder{
    public Order(int qnt, int price) {
        super(qnt, price);
    }

    public int getAmount() {
        return qnt * price;
    }   
}
