public class AmericanWallet extends Wallet {

    public AmericanWallet(String owner, Long netWorth){
        super(owner, netWorth);
        this.currency = Currency.USD;
    }
}
