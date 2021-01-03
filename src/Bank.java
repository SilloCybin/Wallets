import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {

    private static List<Wallet> walletList = new ArrayList<>();

    public static void addToWalletList(Wallet w){
        walletList.add(w);
    }

    public static List<Wallet> getWalletList(){
        return walletList;
    }

    public static void handleTransaction(Wallet senderWallet, Wallet receiverWallet, Long value) throws WalletException {
        Iterator<Wallet> itws = walletList.iterator();
        while (itws.hasNext()) {
            Wallet w = itws.next();
            if (w.equals(senderWallet)) {
                itws.remove();
                senderWallet.decreaseNetWorth(value);
            }
            if (w.equals(receiverWallet)) {
                itws.remove();
                receiverWallet.increaseNetWorth(value);
            }
        }
        walletList.add(senderWallet);
        walletList.add(receiverWallet);
    }



}
