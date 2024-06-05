
//Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
public class checkingAccount implements bankAccount,withdraw{

    @Override//we can change the body @ means that is annotation
    public void person() {
        System.out.println("personal details");
    }

    @Override
    public void money() {
        System.out.println("total ammount");

    }

    @Override
    public void bankAccountNo() {
        System.out.println("Bank Account number ");

    }

    @Override
    public void signature() {
        System.out.println("signature of person ");

    }

    @Override
    public void atmCard() {
        System.out.println("enter pin code");

    }

    public static void main(String[] args) {
        checkingAccount ca=new checkingAccount();
        ca.person();
        ca.money();
        ca.atmCard();
        ca.bankAccountNo();
        ca.signature();
       ;
    }
}
public interface bankAccount {
    long depositPrice=1000000;
    public void person();//if we go to BANK
    public void money();
    public void signature();

}
public interface withdraw {
    long withdrawPrice=100000;
    public void bankAccountNo();
    public void signature();
    public void atmCard();//if we  go to ATM Machine

}