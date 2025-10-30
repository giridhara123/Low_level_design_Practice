import java.util.ArrayList;
public class BankAccount {

    private String AccHoldername;
    private int AccNumber;
    private double balance;
    private  ArrayList<String> Histroy;
    //constructor
    public BankAccount(String AccHoldername, int AccNumber, double balance) {
        this.AccHoldername = AccHoldername;
        this.AccNumber = AccNumber;
        this.Histroy = new ArrayList<>();
        deposit(balance);
    }
    //methods
    public void deposit(double amount) {
        balance += amount;
        Histroy.add("current deposit: "+ String.valueOf(amount) +"---> balance: " + String.valueOf(balance));
    }
    public void withdraw(double amount) {
        balance -= amount;
        Histroy.add("current withdraw: "+ String.valueOf(amount)+  "----> balance: " + String.valueOf(balance));

    }
    //getters
    public ArrayList<String> getHistroy() {
        return Histroy;
    }
    public double getBalance() {
        return balance;
    }

}
// BankAccount acc = new BankAccount("Giridhara",2001,100);
// acc.deposit(1000);
//  acc.deposit(2000);
//  acc.deposit(3000);
// acc.withdraw(1897);
// System.out.println(acc.getBalance());
// System.out.println(acc.getHistroy());
//  acc.getHistroy().forEach(System.out::println);
