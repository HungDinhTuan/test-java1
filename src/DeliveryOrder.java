public class DeliveryOrder extends Order {
    private String address;

    public DeliveryOrder() {
        super();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "customerName='" +getCustomerName() + '\'' +
                ", transactionTime=" + getTransactionTime() +
                ", lineItems=" + getLineItems() +
                "address='" + address +
                '}';
    }

}
