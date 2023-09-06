class Account {
    double balance;
    Account(int balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println("Balance is: "+ balance);
    }
}

class Operation {
    public void withdraw(double amount, Account account) {
        account.balance-= amount;
        System.out.println("Withdrawal: "+ amount);
    }

    public void deposit(double amount, Account account) {
        account.balance+= amount;
        System.out.println("Deposited: " + amount);
    }
}

public class Accountobj {
    public static void main(String[] args) {
        Account acc1 = new Account(10000);
        acc1.printBalance();

        Operation op1 = new Operation();
        op1.withdraw(1000, acc1);

        acc1.printBalance();

        op1.deposit(9800, acc1);
        acc1.printBalance();
            
    }
}
