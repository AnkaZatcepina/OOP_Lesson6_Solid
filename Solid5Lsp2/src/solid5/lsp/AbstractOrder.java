package solid5.lsp;

public abstract class AbstractOrder implements Orderable{
    protected int price;
    protected int qnt;

    public AbstractOrder(int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
