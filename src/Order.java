import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private LocalDateTime transactionTime;
    private List<LineItem> lineItems = new ArrayList<>();;

    public Order() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double cost(){
        double totalCost = 0.0;
        for (LineItem lineItem : lineItems){
            totalCost += lineItem.cost();
        }
        return totalCost;
    }

    public boolean addProduct(Product product, int quantity){
        if(product.getQuanity() >= quantity){
            LineItem lineItem = new LineItem(product, quantity);
            lineItems.add(lineItem);
            // update the numbers of the products after to buy
            product.setQuanity(product.getQuanity() - quantity);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", transactionTime=" + transactionTime +
                ", lineItems=" + lineItems +
                '}';
    }
}
