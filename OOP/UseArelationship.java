class Account{
    String accNo;
    String accType;
    int balance;
    Account(String accNo,String accType, int balance){
        this.accNo=accNo;
        this.accType=accType;
        this.balance=balance;
    }
}

class transaction{
    void desposit(int deptAmnt){
        Account acc = new Account("abc","Durga",11111);
        acc.balance= acc.balance+deptAmnt;
        System.out.println("Transaction Details");
        System.out.println("-------------------");
        System.out.println("Transaction ID  : T-111");
        System.out.println("Account Number  : "+acc.accNo);
        System.out.println("Account Type    : "+acc.accType);
        System.out.println("Transaction Type: Deposit");
        System.out.println("Deposit Amount  : "+deptAmnt);
        System.out.println("Total Balance   : "+acc.balance);
    }
}
public class UseArelationship {
    public static void main(String [] args){
        transaction tx = new transaction();
        tx.desposit(11111);
    }
}
