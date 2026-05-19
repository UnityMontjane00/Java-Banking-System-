import java.util.Scanner;
public class MainBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank acc = new Bank("ACC2026", 1000);
		System.out.println("...Good Day, Welcome to our banking system...");
		System.out.println("====ACCOUNT DETAILS====");
		System.out.println("Account Number : ACC2026");
		System.out.println("Balance : " + acc.getBalance());
        int choice;
		String anotherTransaction;
        do {
    
            System.out.println("===== MAIN MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
			
            System.out.print("Select an option: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You have selected Deposit method");
                System.out.print("Enter deposit amount: ");
                double amountToDeposit = input.nextDouble();
                acc.deposit(amountToDeposit);	
            }
            else if (choice == 2) {

                System.out.println("You have selected Withdraw method ");
                System.out.print("Enter withdrawal amount: ");
                double amountToWithdraw = input.nextDouble();
                acc.withdraw(amountToWithdraw);
            }
            else if (choice == 3) {
                System.out.println("Checking Balance...");
                acc.checkBalance();

            }
            else if (choice == 4) {
                input.nextLine();
                System.out.print("Are you sure you want to exit? (yes/no): ");

                String confirm = input.nextLine();
                if (confirm.equalsIgnoreCase("yes")) {

                    System.out.println("....Thank you for banking with us.Have a nice day.....");
                } else {
                    System.out.println("Exit Cancelled");
                    choice = 0;
                }
            }
            else {

                System.out.println("Invalid choice. Select between 1 and 4.");
            }
			if(choice >= 1 && choice <= 4){
				System.out.println("Thank you for banking with us.");
				input.nextLine();
				System.out.println("Do you want to do another transaction ?(yes/no)");
				anotherTransaction = input.nextLine();
				if(anotherTransaction.equalsIgnoreCase("no")){
					choice = 4;
				}	
			}
        } while (choice != 4);
        input.close();
    }
}
		
		
		
		
