import org.w3c.dom.ls.LSOutput;

public class ValidationConstructor {
    private String accountNumber;
    private double balance;

    public ValidationConstructor(String accountNumber, double balance) {
        if(accountNumber == null || accountNumber.isEmpty()){
            System.out.println("Account number cannot be empty");
        }
        else{
            this.accountNumber = accountNumber;
        }

        if(balance<0){
            System.out.println("Balance cannot be negative");
            return;
        }
        else {
            this.balance = balance;
        }
    }

    public static void main(String[] args){

        ValidationConstructor acc1 = new ValidationConstructor("accountNumber", 100);
        System.out.println(acc1.accountNumber);
        System.out.println(acc1.balance);
        System.out.println("----------------");
        ValidationConstructor acc2 = new ValidationConstructor("", -100);

    }
}
