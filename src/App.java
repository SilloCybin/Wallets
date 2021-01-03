public class App {

    public static void main(String[] args) throws WalletException {

        Person Alice = new Person("Alice");
        Person Bob = new Person("Bob");

        System.out.println(Bob.getEurWallet().toString());
        System.out.println(Alice.getEurWallet().toString());

        Bank.handleTransaction(Alice.getEurWallet(), Bob.getEurWallet(), 50L);

        System.out.println(Bob.getEurWallet().toString());
        System.out.println(Alice.getEurWallet().toString());
        System.out.println(Bank.getWalletList().toString());

        Bank.handleTransaction(Alice.getEurWallet(), Bob.getEurWallet(), 951L);
    }
}
