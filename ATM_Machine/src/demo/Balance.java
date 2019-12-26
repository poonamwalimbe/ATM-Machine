package demo;
import java.text.DecimalFormat;
import java.io.IOException;
import java.util.*;
public class Balance {
	
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
	
	private int CustomerNo;
	private int PinNo;
	private double CheckBalance = 0;
	private double SavingBalance = 0;
	
	public int setCustomerNo(int CustomerNo)
	{
		this.CustomerNo=CustomerNo;
		return CustomerNo;
	}
	public int getCustomerNo()
	{
		return CustomerNo;
	}
	
	public int setPinNo(int PinNo)
	{
		this.PinNo=PinNo;
		return PinNo;
	}
	public int getPinNo()
	{
		return PinNo;
	}
	//
	public double getCheckBalance()
	{
		return CheckBalance;
	}
	public double getSavingkBalance()
	{
		return SavingBalance;
	}
	/*calculate checking account withdrawl */
	public double calcCheckingwithdraw(double amount)
	{
		CheckBalance = (CheckBalance - amount);
		return CheckBalance;
	}
	public double calcSavingingwithdraw(double amount)
	{
		SavingBalance= (SavingBalance - amount);
		return SavingBalance;
	}
	
	
	public double calcCheckingDeposit(double amount)
	{
		CheckBalance= (CheckBalance + amount);
		return CheckBalance;
	}
	
	public double calcSavingDeposit(double amount)
	{
		SavingBalance= (SavingBalance + amount);
		return SavingBalance;
	}
	
	/*Customer checking account withdraw    */
	
	public void getCheckingwithdrawinput()
	{
		System.out.println("checking account Balance" +moneyFormat.format(CheckBalance));
		System.out.print("Amount you want to withdraw");
		double amount= input.nextDouble();
		
		if ((CheckBalance - amount) >= 0)
		{
			calcCheckingwithdraw(amount);
			System.out.println("new checking account Balance" +moneyFormat.format(CheckBalance));
		}
		else
		{
			System.out.print("Balance cant be negative" + "\n");
		}
	}
	
	/* custome saving account witdraw */
	
	public void getSavingingWithdrawInput()
	{
		System.out.println("saving account Balance" + 	moneyFormat.format(SavingBalance));
		System.out.print("Amount you want to withdraw");
		double amount= input.nextDouble();
		
		if ((SavingBalance - amount) >= 0)
		{
			calcSavingingwithdraw(amount);
			System.out.println("new saving account Balance" +moneyFormat.format(SavingBalance));
		}
		else
		{
			System.out.print("Balance cant be negative" + "\n");
		}
	}
	
	public void getCheckingDepositInput()
	{
		System.out.println("checking account Balance" + moneyFormat.format(CheckBalance));
		System.out.print("Amount you want to Deposit");
		double amount= input.nextDouble();
		
		if ((CheckBalance + amount) >=0)
		{
			calcCheckingDeposit(amount);
			System.out.println("new checking account Balance" + moneyFormat.format(CheckBalance));
		}
		else
		{
			System.out.print("Balance cant be negative" + "\n");
		}
	}
	
	public void getSavingingDepositInput()
	{
		System.out.println("saving account Balance" + 	moneyFormat.format(SavingBalance));
		System.out.print("Amount you want to deposit from saving account");
		double amount= input.nextDouble();
		
		if ((SavingBalance + amount)>=0)
		{
			calcSavingDeposit(amount);
			System.out.println("new saving account Balance" +moneyFormat.format(SavingBalance));
		}
		else
		{
			System.out.print("Balance cant be negative" + "\n");
		}
	}
	
	

}
