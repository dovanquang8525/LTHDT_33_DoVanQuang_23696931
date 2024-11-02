package baiTap10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Khoi tao san pham
        Product product1 = new Product("Laptop", "P001", 1500.00);
        Product product2 = new Product("Smartphone", "P002", 800.00);

        // Tao don hang moi
        Order order = new Order(2, LocalDate.now());

        // Them cac san pham vao don hang
        order.addLineItems(product1, 2);  // Mua 2 Laptop
        order.addLineItems(product2, 3);  // Mua 3 Smartphone

        // Tong tien
        double totalCharge = order.calcTotalCharge();

        // In thong tin
        System.out.println(order.toString());
        System.out.println("Tong tien: " + totalCharge);
    }
}

