//Bank Account class
import java.util.Scanner;
public class Bank{
	private String accountNumber;
	private double balance;	

	public Bank(String accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public double getBalance(){ 
		return balance;
	}
	public void deposit(double amount){
		if (amount > 0){
			balance += amount;
			System.out.println("Desposit successful");
		}else{
		System.out.println("Invalid amount to deposit ");
		}	
	} 
	public void withdraw(double amount){
		if (amount<=0){
			System.out.println("Invalid amount to withdraw");
		}
		else if(amount > balance){
			System.out.println("Insuficient funds to withdraw");	
		}
		else{
			balance -= amount;
			System.out.println("Withdrawal successful");
			System.out.println("Amount Withdrawn : R" + amount);
			System.out.println("The remaining balance : R" + balance);
		}
	}
	public void checkBalance(){
		System.out.println("Your current balance :" + balance);
	}
	public void displayAmount(){
		System.out.println("=======ACCOUNT DETAILS=======");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}
