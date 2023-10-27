import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // a. Initialize products as described in table below:
        List<Product> products = new ArrayList<>();
        products.add(new Product("F523", "Tomato", "Food", 1.5, 589));
        products.add(new Product("A763", "Zara shirt", "Appearance", 12.0, 90));
        products.add(new Product("H320", "Kitchen table", "Household", 299.0, 13));
        products.add(new Product("E092", "iPhone", "Electronic", 1000.0, 4));
        products.add(new Product("S108", "Football", "Sport", 19.9, 2));

        // b. Create a new Order for “Mike Tyson” at “2023-08-08 11:30:00”
        LocalDateTime transactionTime = LocalDateTime.of(2023, 8, 8, 11,30);
        Order order = new Order();
        order.setCustomerName("Mike Tyson");
        order.setTransactionTime(transactionTime);

        // b.1 Add 5 “Tomato” to the order then print the result (success or fail) and total cost of order
        System.out.println("Add 5 Tomato to the order : ");
        boolean addTomato = order.addProduct(findProductByName(products, "Tomato"), 5);
        if(addTomato){
            System.out.println("Add successfully. Total cost : " + order.cost());
        }else {
            System.out.println("Fail to add. Total cost : " + order.cost());
        }

        // b.2 Add 2 “IPhone” to the order then print the result (success or fail) and total cost of order
        System.out.println("Add 2 iPhone to the order : ");
        boolean addIPhone = order.addProduct(findProductByName(products, "iPhone"), 2);
        if(addIPhone){
            System.out.println("Add successfully. Total cost : " + order.cost());
        }else {
            System.out.println("Fail to add. Total cost : " + order.cost());
        }

        // b.3 Add 4 “Football” to the order then print the result (success or fail) and total cost of order
        System.out.println("Add 4 football to the order : ");
        boolean addFootball = order.addProduct(findProductByName(products, "Football"), 4);
        if(addFootball){
            System.out.println("Add successfully. Total cost : " + order.cost());
        }else {
            System.out.println("Fail to add. Total cost : " + order.cost());
        }

        // b.4 Print all the information of the order
        System.out.println("Order information : ");
        System.out.println(order);

        // c. Create a new Delivery order for “Chris Evans” at “2023-08-09 13:14:00”
        LocalDateTime transactionTimeDeli = LocalDateTime.of(2023, 8, 9, 13, 14);
        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setCustomerName("Chris Evan");
        deliveryOrder.setAddress("123 Cau Giay");
        deliveryOrder.setTransactionTime(transactionTimeDeli);

        // c.1 Add 3 “Zara shirt” to the order then print the result (success or fail) and total cost of order
        System.out.println("Add 3 Zara shirt to the delivery order : ");
        boolean addZaraShirt = deliveryOrder.addProduct(findProductByName(products, "Zara shirt"), 3);
        if(addZaraShirt){
            System.out.println("Add successfully. Total cost : " + deliveryOrder.cost());
        }else{
            System.out.println("Fail to add. Total cost : " + deliveryOrder.cost());
        }

        // c.2 Add 3 “IPhone” to the order then print the result (success or fail) and total cost of order
        System.out.println("Add 3 iPhone to the delivery order : ");
        boolean addIPhoneDeli= deliveryOrder.addProduct(findProductByName(products, "iPhone"), 3);
        if(addIPhoneDeli){
            System.out.println("Add successfully. Total cost : " + deliveryOrder.cost());
        }else{
            System.out.println("Fail to add. Total cost : " + deliveryOrder.cost());
        }

        // c.3 Print all the information of the order
        System.out.println("Delivery order information : ");
        System.out.println(deliveryOrder);
    }

    // find product by name
    private static Product findProductByName(List<Product> products, String nameProductToFind){
        for (Product product : products){
            if(product.getName().equals(nameProductToFind)){
                return product;
            }
        }
        return null;
    }
}
