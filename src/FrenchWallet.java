public class FrenchWallet extends Wallet {

    public FrenchWallet(String owner, Long netWorth){
        super(owner, netWorth);
        this.currency = Currency.EUR;
    }

}
