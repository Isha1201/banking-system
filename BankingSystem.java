package banking;
import java.util.*;
class BankingDetails {
	Scanner sc=new Scanner(System.in);
	private String accno;
	private String name;
	private long balance;
	public void openacc() {
		System.out.println("enter your account number");
		accno=sc.nextLine();
		System.out.println("enter your name");
		name=sc.nextLine();
		balance=0;
		
	}
	public void deposit() {
		System.out.println("enter the amount you want to deposit");
		long amount=sc.nextLong();
		balance=balance+amount;
		System.out.println("balance after deposit "+balance);
		
		
		
	}
	public void withdraw() {
		System.out.println("enter the amount you want to withdraw");
		long amount=sc.nextInt();
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("balance after withdraw "+balance);
		}
		else {
			System.out.println("Not enough money,cant withdraw");

		}
	}
	public void checkbalance() {
		System.out.println("your current balance is "+ balance);
	}
	public void showdetails() {
		System.out.println("Account number = "+accno);
		System.out.println("Account name= "+name);
		System.out.println("balance= "+balance);
	}
	
}
public class BankingSystem{
	public static void main(String[] args) {
		System.out.println("Welcome to Banking System ,enter your details");
		BankingDetails obj=new BankingDetails();
		obj.openacc();
		System.out.println("1. Display Account details \n2. display check balance\n 3. Deposit the amount\n 4. withdraw the amount\n5. Exit" );
		Scanner sc=new Scanner(System.in);
		int num=0;
		do {
			 num=sc.nextInt();
			if(num==1) {
				obj.showdetails();
				
			}
			else if(num==2) {
				obj.checkbalance();
			}
			else if(num==3) {
				obj.deposit();
			}
			else if(num==4) {
				obj.withdraw();
			}
			else if(num==5) {
				System.out.println("Thankyou!");
				break;
			}
		}while(num!=5);
		
		
	}
}
