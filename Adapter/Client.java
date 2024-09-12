public class Client {
    public static void main(String[] args) {
        //Client only need to change one line here to change the bank so it won't impact Client code phonepe
        Phonepe phonepe=new Phonepe(new YesBankAdapter());
        phonepe.getBalance();
    }
}
