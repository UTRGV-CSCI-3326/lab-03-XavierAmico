// Bank Account
// Bob has a checking acount with Texas Bank with a starting balance of $2175.37.
// Bob then performs the following transactions:
// Bob withdrew $302.50.
// Bob deposited $50.03.
// Bob withdrew half of his current balance, then deposited $20.00.
// Bob withdrew $1.
// Bob deposited his paycheck that doubled his current balance.
// Bob deposited $1.
// Output Bob's new balance after all of his transactions.

public class BankAccount
{
    public static void main(String[] args)
    {
        float balance = 2175.37f;

        balance -= 302.50f; // Bob withdrew $302.50
        System.out.println("Bob withdrew $302.50, the new balance is: $" + String.format("%.2f", balance));

        balance += 50.03f; // Bob deposits $50.03
        System.out.println("Bob deposited $50.03, the new balance is: $" + String.format("%.2f", balance));

        balance /= 2; // Bob Withdrew half his account
        balance += 20.0f; // Bob deposits $20 
        System.out.println("Bob withdrew half his balance, then deposited $20, the new balance is: $" + String.format("%.2f", balance));

        balance -= 1.0f; // Bob withdrew $1
        System.out.println("Bob withdrew $1, the new balance is: $" + String.format("%.2f", balance)); 

        balance *= 2; // Bob deposited his paycheck that doubled his current balance.
        System.out.println("Bob deposited his paycheck that doubled his current balance, the new balance is: $" + String.format("%.2f", balance));

        balance += 1f;
        System.out.println("Bob deposited $1, the final balance is: $" + String.format("%.2f", balance));
    }
}