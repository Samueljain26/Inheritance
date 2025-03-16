// Main class
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-03-10");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-03-08", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-03-05", "TRK67890", "2025-03-07");

        // Polymorphism
        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();
    }
}

// Superclass
class Order {
    int orderId;
    String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method
    void getOrderStatus() {
        System.out.println("Order -> ID: " + orderId + ", Date: " + orderDate + " | Status: Processing");
    }
}

// Subclass: ShippedOrder (Extends Order)
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Calling Order constructor
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Shipped Order -> ID: " + orderId + ", Date: " + orderDate + ", Tracking: " + trackingNumber + " | Status: Shipped");
    }
}

// Subclass: DeliveredOrder (Extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); 
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Delivered Order -> ID: " + orderId + ", Date: " + orderDate + ", Tracking: " + trackingNumber + ", Delivered On: " + deliveryDate + " | Status: Delivered");
    }
}

/* 
Order -> ID: 101, Date: 2025-03-10 | Status: Processing
Shipped Order -> ID: 102, Date: 2025-03-08, Tracking: TRK12345 | Status: Shipped
Delivered Order -> ID: 103, Date: 2025-03-05, Tracking: TRK67890, Delivered On: 2025-03-07 | Status: Delivered
*/
