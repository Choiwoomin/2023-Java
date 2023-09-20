public class Main
{
    public static void main(String[] args) {

        Bank account1=new Bank(); // create Object

        account1.deposit(100);
        account1.deposit(200);
        account1.withdraw(100);


        Bank account2=new Bank(); // create Object

        account2.deposit(100);
        account2.deposit(1000);
        account2.withdraw(350);

        for (int i=0;i<10 ;i++ ){
            Bank b=new Bank();
            System.out.print("acct #:");
            System.out.print(b.getAccountNumber());

            System.out.print("\t balance #:");
            System.out.println(b.getBalance());
        }

        account1.transfer(account2, 100);

        System.out.print("acct #:");
        System.out.println(account1.getAccountNumber());

        System.out.print("balance #:");
        System.out.println(account1.getBalance());

        System.out.print("balance of acct 2:");
        System.out.println(account2.getBalance());

        System.out.print("bank balance is :");
        System.out.println(Bank.getBankBalance());
        System.out.println(Bank.getTotalAccounts());


    }
}