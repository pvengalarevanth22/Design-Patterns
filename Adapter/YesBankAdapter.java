import ThirdParty.YesBankApi;

//Adapter to act between our YesBankApi and BankApiAdapterInterface
public class YesBankAdapter implements BankApiAdapter{

    private YesBankApi yesBankApi=new YesBankApi();
    @Override
    public void getBalance() {
        yesBankApi.showBalance();
    }
}
