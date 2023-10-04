package MyPack;

import java.util.*;

public class ATNMOpttnIm implements ATMoper {
	ATMprj atm=new ATMprj();
	Map<Double,String>ministmt=new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is:"+" "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmnt(double withdrawAmount) {
		if(withdrawAmount%500==0)
		{
			if(withdrawAmount<=atm.getBalance())
			{
				ministmt.put(withdrawAmount, "Amount Withdrawn");
				System.out.println("Collect cash"+" "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else
			{
				System.out.println("Insufficent amount");
				
			}
		}
		else
		{
			System.out.println("Please enter the amount in Multiple of 500 ");
		}
		
		
	}

	@Override
	public void depositeAmnt(double depositAmount) {
		ministmt.put(depositAmount, "Amount Deposited");
		System.out.println(depositAmount+"Deposited Sucessfully!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String>m:ministmt.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
