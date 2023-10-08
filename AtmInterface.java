package CodSoft;
import java.util.Scanner;

class BankAccount {
	 double balance;
	
	public  double BankAccount(double initialBalance) {
		balance = initialBalance;
		return balance;
	}
	
}

class ATM extends BankAccount {

	
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdrawn amount: " +amount);
			System.out.println("Balance after withdrawing: " +balance); //remaining balance
		}
		else
		{
			System.out.println("Insufficient funds"); // if ammount exceeds the balance
		}
	   	
	}
	
	public void deposit(double amount) {
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited amount: " +amount);
			System.out.println("Balance after depositing:  " +balance); //total balance
		}
		else
		{
			System.out.println("Invalid amount"); 
		}
	}
	
	public double checkBalance() {
		return balance;
	}
}
public class AtmInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    ATM m = new ATM();
    m.BankAccount(50000);
    
    while(true) {
	System.out.println("ATM menu: ");
	System.out.println("1.Withdraw");
	System.out.println("2.Deposit");
	System.out.println("3.Check Balance");
	System.out.println("4.Exit");
	System.out.println("Enter your choice: "); //Enter any one of the option from 1 to 4
	
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	
	 switch(choice)
	 {
	 case 1:
		 System.out.println("Withdrawal amount: ");
		 double withdrawalAmount =sc.nextDouble();
		 m.withdraw(withdrawalAmount);
		 break;
		 
	 case 2:
		 System.out.println("Deposited amount: ");
		 double depositAmount =sc.nextDouble();
		 m.deposit(depositAmount);
		 break;
		 
	 case 3:
		 System.out.println("Your current Balance: "+m.checkBalance());
		 break;
		 
	 case 4:
		 System.out.println("Thank you for usimg ATM.  Bye!");
		 sc.close();
		 System.exit(0);
		 
		 
	 default:
		 System.out.println("Invalid option");
		 break;
		 
	 }
	 
	

	}
}
}