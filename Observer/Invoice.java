public class Invoice implements OrderPlacedSubscription,OrderCancelledSubscription {
    public Invoice(Amazon amazon){
        amazon.registerOrderPlacedSubscription(this);
        amazon.registerOrderCancelledSubscription(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("Invoice generated");
    }

    @Override
    public void orderCancelled() {
        System.out.println("Invoice generated for order cancelled");
    }
}
