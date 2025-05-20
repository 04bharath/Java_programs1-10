class LessBalanceExpaction extends RuntimeException{
    public LessBalanceExpaction(double amount){
        super("Withdraw ("+ amount + "Rs) not possible");
    }
}
class Account {
    double balance;
    public final double Max_am = 500;

    public Account() {
        balance = Max_am;
    }

    public void deposite(double amount) {
        balance += amount;
        System.out.println("Deposite :" + amount + "New Balance : " + balance);
    }

    public void Withdraw(double amount) {
        if (balance - amount < Max_am) {
            throw new LessBalanceExpaction(amount);
        } else {
            balance -= amount;
            System.out.println("Withdraw amount = " + amount + "New blance = " + balance);
        }
    }
}
public class TestAccount{
    public static void main(String agrs[]){
        Account account1  = new Account();
        Account account2 = new Account();

        account1.deposite(5000);
        account2.deposite(200);

        try {
            account1.Withdraw(200);
            }catch (LessBalanceExpaction e){
                System.out.println("LessBalanceExpaction : "+ e.getMessage());
        }
        try {
            account2.Withdraw(600);
        }catch (LessBalanceExpaction e){
            System.out.println("LessBalanceExpaction :" + e.getMessage());
            }

        }
    }



























