public class Account {

    /* A private int data field named id for the account (default 0).
 A private double data field named balance for the account (default 0).
 A private double data field named annualInterestRate that stores the current interest rate
(default 0). Assume all accounts have the same interest rate.
 A private Date data field named dateCreated that stores the date when the account was created.*/


    private int id ;
    private double balance ;
    private static  double annuualInteresRate = 0.45;
    private int dateCreated ;

    // A no-arg constructor that creates a default account.

    public Account (){}

    // A constructor that creates an account with the specified id and initial balance.

    public Account ( int id , double balance )
    {
        this.id= id ;
        this.balance=balance;
    }

    /* The accessor and mutator methods for id, balance, and annualInterestRate.
 The accessor method for dateCreated.*/

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnuualInteresRate() {
        return annuualInteresRate;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnuualInteresRate(double annuualInteresRate) {
        Account.annuualInteresRate = annuualInteresRate;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }


// A method named getMonthlyInterestRate() that returns the monthly interest rate.

    public double getMounthlyInterestRate()
    {
        balance=(balance*annuualInteresRate) + balance ;
        return balance ;
    }

    // A method named getMonthlyInterest() that returns the monthly interest.


    public double getMounthlyInterest()
    {
        balance= balance*(annuualInteresRate/1200);
        return balance;

    }

    // A method named withdraw that withdraws a specified amount from the account.

    public void Withdraw(double amount)
    {
        balance = balance-amount;
    }


  // A method named deposit that deposits a specified amount to the account.

    public void deposits ( double amount )
    {
        balance = balance+ amount;
    }






















}
