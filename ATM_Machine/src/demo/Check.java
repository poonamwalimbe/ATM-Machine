package demo;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Check extends Balance {
	
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
	int selection;
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException
	{
		int x = 1;
		
		do
		{
			try
			{
				data.put(9977900, 9876);
				data.put(9977960, 1876);
				
				System.out.println("welcome To The ATM");
				System.out.println("enter your customer no");
				setCustomerNo(sc.nextInt());
				
				System.out.println("enter your Pin no");
				setPinNo(sc.nextInt());
				
			}
			catch(Exception e)
			{
				System.out.println("\n" + "Invalid character(s). only numbers." + "\n");
				x=2;
			}
			
			for (Map.Entry<Integer, Integer> entry : data.entrySet())
			
			{
				if(entry.getKey() == getCustomerNo() && entry.getValue() == getPinNo())
				{
				getAccountType();
				
			}
		}
		System.out.println("wrong");
	}
	while(x == 1);
	}
	
	public void getAccountType()
	{
		System.out.println("select the account ");
		System.out.println("Type 1- Checking Account ");
		System.out.println("Type 2- Saving Account ");
		System.out.println("Type 3- Exit ");
		System.out.println("Choice");
		
		selection = sc.nextInt();
		
		switch (selection)
		{
		case 1:
			getchecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using ATM");
			break;
			
		default:
			System.out.println("\n" + "Invalid choice" + "\n");
			getAccountType();
			
		}
	}
	
	
	public void getchecking()
	{
		System.out.println("Checking Account ");
	System.out.println("Type 1- View Account ");
	System.out.println("Type 2- Withdraw ");
	System.out.println("Type 3- Deposit ");
	System.out.println("Type 4- Exit ");
	System.out.println("Choice: ");

	selection = sc.nextInt();
	
	switch(selection)
	{
	case 1:
		System.out.println("Checking account balance" + moneyFormat.format(getCheckBalance()));
		getAccountType();
		break;
		
	case 2:
		getCheckingwithdrawinput();
		getAccountType();
		break;
		
	case 3:
		getCheckingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("Thank you for using ATM");
		break;
	
	default:
		System.out.println("\n" + "Invalid choice" + "\n");
		getchecking();
		
		
	}
	}
	
	public void getSaving()
	{
	System.out.println("saving account ");
	System.out.println("Type 1- View Account ");
	System.out.println("Type 2- Withdraw ");
	System.out.println("Type 3- Deposit ");
	System.out.println("Type 4- Exit ");
	System.out.println("Choice: ");

	selection = sc.nextInt();
	
	switch(selection)
	{
	case 1:
		System.out.println("Checking saving balance" + moneyFormat.format(getSavingkBalance()));
		getAccountType();
		break;
		
	case 2:
		getSavingingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getSavingingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("Thank you for using ATM");
		break;
		
	default:
		System.out.println("\n" + "Invalid choice" + "\n");
		getSaving();
		
	}
	}
	
	
}
