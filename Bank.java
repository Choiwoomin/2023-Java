class Bank{
    private int balance;
    private int accountNbr;
    static int bankBalance;
    static int totalAccounts;

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNbr;
    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public static int  getBankBalance(){
        return bankBalance;
    }

    void transfer(Bank accountNbr, int money){
        if(money <= 0)
        {
            System.out.println("can't transfer. error, input minus value");
        }
        else
        {
            if(balance < money)
            {
                System.out.println("can't transfer. error , your have not enough money");
            }
            else
            {
                // transfer money
                balance=balance-money;
                bankBalance-=money;
                accountNbr.deposit(money);
            }
        }
    }

    public Bank(){ //constructor
        totalAccounts++;
        accountNbr=totalAccounts;

    }

    void deposit(int money){

        if(money <= 0)
        {
            System.out.println("can't deposit. error, input minus value");
        }
        else
        {
            // add money to my balance
            balance=balance+money;

            bankBalance+=money;
        }
    }

    void withdraw(int money){
        if(money <= 0)
        {
            System.out.println("can't withdraw. error, input minus value");
        }
        else
        {
            if(balance-money < 0)
            {
                System.out.println("can't withdraw. error, your have not enough money");
            }
            else
            {
                // remove money from my balance
                balance= balance-money;

                bankBalance-=money;
            }
        }
    }


}