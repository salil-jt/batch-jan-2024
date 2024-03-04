package assignments_programs;

import java.util.Scanner;

public class Assignment31Solution_ATM {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		DisplayText.welcomeMessage();

		Scanner scanner = new Scanner(System.in);

		while (true) {

			DisplayText.displayOptions();

			int userInput = scanner.nextInt();

			switch (userInput) {

			case 1:
				account.printBalance("");
				break;
			case 2:
				System.out.println("Enter an amount to deposit:");
				int amountToDeposit = scanner.nextInt();
				account.deposit(amountToDeposit);
				
				break;
			case 3:
				System.out.println("Enter an amount to withdraw:");
				int amountToWithdraw = scanner.nextInt();
				account.withdraw(amountToWithdraw);
				break;
			case 4:
				System.out.println("Thankyou for transacting with us!");
				break;

			}

			if (userInput == 4) {
				System.out.println("Thankyou user for banking with us, let us know if you have  any feedback");
				break;
			}

		}

		scanner.close();
	}

}

class BankAccount {

	private int balance;

	BankAccount() {
		this.balance = 1000;
	}

	public void deposit(int amount) {

		if (amount < 0) {
			System.out.println("Cannot deposit negative amount");
			printBalance("");
		} else {

			balance = balance + amount;
			printBalance("after depositing ");
		}
	}

	public void withdraw(int amount) {

		if(amount >  balance) {
			System.out.println("Cannot withdraw, as the max balance available is less than amount to withdraw");
			printBalance("");
		}
		else {
		balance = balance - amount;
		printBalance("after withdrawing ");
		}
	}

	public void printBalance(String message) {
		System.out.println("The current balance in your account  " +message +  "is :" + balance);
	}

}

class DisplayText {

	public static void displayOptions() {
		System.out.println("Please select one of the following options: ");
		System.out.println("Press 1 to check balance");
		System.out.println("Press 2 to deposit money");
		System.out.println("Press 3 to withdraw money");
		System.out.println("Press 4 to end the transaction");

	}

	public static void welcomeMessage() {
		System.out.println("Welcome to XYZ banking company, ");

	}

}
