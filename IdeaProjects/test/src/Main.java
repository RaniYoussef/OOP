public class Main {
    public static void main(String[] args)
    {
        /*test program that creates an Account object with an account ID of 1122, a balance of
$20,000, and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500,
use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the
date when this account was created.*/




        Account User1 = new Account(1122,20000);

        User1.Withdraw(2500);
        User1.deposits(3000);
        System.out.println("balance is :"+ User1.getBalance() +"the monthly interest"+User1.getMounthlyInterest()+"the date");
    }
}