package baiTap10;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems;
    private int count;
    //dong goi
    public int getOrderID() {
        return orderID;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    //comstructor
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
        this.count = 0;
    }
    
    public void addLineItems(Product product, int quantity){
        OrderDetail orderDetail = new OrderDetail(quantity, product);
        lineItems.add(orderDetail);
        count++;
    }

    public double calcTotalCharge() {
        double total = 0;
        for (OrderDetail items : lineItems){
            total += items.calcTotalPrice();
        }
        return total;
    }
    //toString
    @Override
    public String toString() {
        return "Order[ID=" + getOrderID() + ", Date=" + getOrderDate() + ", TotalCharge=" + calcTotalCharge() + "]";
    }

}
