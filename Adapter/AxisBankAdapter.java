import ThirdParty.AxisBankApi;

//Adapter to act between our YesBankApi and BankApiAdapterInterface
public class AxisBankAdapter implements BankApiAdapter{

    private AxisBankApi axisBankApi=new AxisBankApi();
    @Override
    public void getBalance() {
        axisBankApi.AxisShowBalance();
    }
}
