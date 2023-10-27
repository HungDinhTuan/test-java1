// ĐINH TUẤN HÙNG -- TH2210025
public class Product {
    private String sku;
    private String name;
    private String category;
    private double price;
    private int quanity;

    public Product() {
    }

    public Product(String sku, String name, String category, double price, int quanity) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quanity = quanity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quanity=" + quanity +
                '}';
    }
}
