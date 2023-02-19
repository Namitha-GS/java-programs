package day1;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		int balance = 1000, withdraw, deposit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to ATM");
		
		while(true) {
			System.out.println("Choose 1 to Withdraw money");
			System.out.println("Choose 2 to Deposit money");
			System.out.println("Choose 3 to check Balance");
			System.out.println("Choose 4 to Exit from menu");
			System.out.println("Choose the number: ");
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
				System.out.println("Enter the money to be withdrawn:");
				withdraw = sc.nextInt();
				if(withdraw <= balance) {
					balance = balance - withdraw;
					System.out.println("Pls collect your cash!!!");
				} else {
					System.out.println("Insufficient balance!!!");
				}
				System.out.println();
				break;
				
			case 2:
				System.out.println("Enter the money to be deposited:");
				deposit = sc.nextInt();
				balance += deposit;
				System.out.println("Deposit successful !!!");
				System.out.println();
				break;
				
			case 3:
				System.out.println("Your balance: "+ balance);
				System.out.println();
				break;
				
			case 4:
				System.exit(0);
			}
		}
	}

}
