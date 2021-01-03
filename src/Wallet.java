import java.util.Objects;
import java.util.logging.Logger;

public class Wallet {

    String owner;
    Long netWorth;
    Currency currency;

    public Wallet(String owner, Long netWorth){
        this.owner = owner;
        this.netWorth = netWorth;
    }

    public void decreaseNetWorth(Long value) throws WalletException {
        if(value <= this.netWorth) {
            this.netWorth -= value;
        } else {
            throw new WalletException("Cannot make such a move : not enough money in the wallet");
        }
    }

    public void increaseNetWorth(Long value){
        this.netWorth += value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wallet)) return false;
        Wallet wallet = (Wallet) o;
        return owner.equals(wallet.owner) && netWorth.equals(wallet.netWorth) && currency == wallet.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, netWorth, currency);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "owner='" + owner + '\'' +
                ", netWorth=" + netWorth +
                ", currency=" + currency +
                '}';
    }
}
