public class Tracker implements OrderPlacedSubscription {
    public Tracker(Amazon amazon){
        amazon.registerOrderPlacedSubscription(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("Order tracker status");
    }
}
