public class Client {
    public static void main(String[] args) {
        Amazon amazon=new Amazon();
        EmailSender emailSender=new EmailSender(amazon);
        Invoice invoice=new Invoice(amazon);
        Tracker tracker=new Tracker(amazon);

        amazon.orderPlaced();

        amazon.orderCanceled();
    }
}
