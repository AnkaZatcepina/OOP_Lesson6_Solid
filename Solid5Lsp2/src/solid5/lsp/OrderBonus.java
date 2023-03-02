package solid5.lsp;

public class OrderBonus extends AbstractOrder{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
