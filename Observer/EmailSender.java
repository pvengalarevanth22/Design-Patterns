public class EmailSender implements OrderPlacedSubscription,OrderCancelledSubscription {
    public EmailSender(Amazon amazon){
        amazon.registerOrderPlacedSubscription(this);
        amazon.registerOrderCancelledSubscription(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("Email Sent for order placed");
    }
    @Override
    public void orderCancelled() {
        System.out.println("Email Sent for order cancelled");
    }
}
