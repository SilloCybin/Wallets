public class Person {

    String name;
    Wallet usdWallet;
    Wallet eurWallet;

    public Person(String name){
        this.name = name;
        eurWallet = new FrenchWallet(name+"'s french wallet", 1000L);
        usdWallet = new AmericanWallet(name+"'s american wallet", 1000L);
        Bank.addToWalletList(eurWallet);
        Bank.addToWalletList(usdWallet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getUsdWallet() {
        return usdWallet;
    }

    public Wallet getEurWallet() {
        return eurWallet;
    }

}
