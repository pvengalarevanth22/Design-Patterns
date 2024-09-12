//Adapter Design Pattern
//1.Adapter design pattern is in between two incompatible classes
//2.Mainly used when there is third party Api.
//3.Here Phonepe should be DIP.
//Steps to create Adapter design pattern
//1.Create adapter interface as methods as you required.
//2.Implement Adapter as per interface and third party. 
public class Phonepe {
    private BankApiAdapter bankApiAdapter;
    public Phonepe(BankApiAdapter bankApiAdapter){
        this.bankApiAdapter=bankApiAdapter;
    }
    public void getBalance(){
        bankApiAdapter.getBalance();
    }
}
