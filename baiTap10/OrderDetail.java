package baiTap10;

public class OrderDetail {
    private int quantity;
    private Product product;
    //dong goi 
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //constructor
    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
    public double calcTotalPrice() {
        return getQuantity() * product.getPrice();
    }
    //toString
    @Override
    public String toString() {
        return "OrderDetail[Product=" + product.toString() + ", Quantity=" + getQuantity() + "]";
    }

}
