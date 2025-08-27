package BridgeLabzTraining3Y.work;
import java.util.*;
public class transactioncalx {
	public static void main(String args[]) {
		System.out.println("what do you want ");
		System.out.println(" 1. Deposit");
		System.out.println(" 2. Withdrawl");
		System.out.println(" 3. check balance");
		
		Scanner sc = new Scanner(System.in);
		int balance =0;
		boolean transaction=true;
		while(transaction) {
			System.out.println("enter your choice: (1-3)");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter amount for deposit");
			int amount = sc.nextInt();
			if(amount>0) {
				balance+=amount;
				System.out.println("your " + amount + " is deposited ");
			}
			else {
				System.out.println("wrong amount");
			}
			break;
		
		case 2:
			System.out.println("Enter amount for withdrwal");
			int withdrawl = sc.nextInt();
			if(withdrawl > 0 && withdrawl <=balance) {
				balance -= withdrawl;
				System.out.println("your " + withdrawl + " is withdraw ");
				
			}
			else if(withdrawl<0 && withdrawl>balance) {
				System.out.println("over draft");
			}
			break;
		case 3:
			System.out.println("you want to check balance ");
			System.out.println("your balance is " + balance + " rupees");
			break;
		default:
			System.out.println("Invalid choice please enter choice from(1-3");
			
		}
		System.out.println("are you want to do another transaction : ");
		boolean want = sc.nextBoolean();
		if(want==false) {
			transaction=false;
		}
		
		}
	
		
	}

}
