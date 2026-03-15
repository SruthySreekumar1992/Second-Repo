package assignment;

import java.util.Scanner;
public class UserClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter Pin");
		
		int a = sc.nextInt();
		
		BankClass bc = new BankClass();
		
		bc.setPin(a);
		bc.validatePin();
	}

}
