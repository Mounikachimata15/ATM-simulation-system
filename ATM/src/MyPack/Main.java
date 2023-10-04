package MyPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// Creating Con
		 ATNMOpttnIm op = new  ATNMOpttnIm();
     int atmnumber=12345;
     int atmpin=1234;
     try (Scanner in = new Scanner(System.in)) {
		System.out.println("Welcome To ATM Machine!!");
		 System.out.println("Enter ATMNumber");
		 int atmnum=in.nextInt();
		 System.out.println("Enter ATM Pin");
		 int pin=in.nextInt();
		 if((atmnumber==atmnum)&&(atmpin==pin))
		 {
			 while(true)
			 {
				 System.out.println("1.view Balance\n 2.WithdrawnAmount\n 3.Deposit\n 4.View Mini Statement");
				 System.out.println("Enter Your Choice");
				 int ch=in.nextInt();
				 if(ch==1)
				 {
					 op.viewBalance();
				 }
				 else if(ch==2)
				 {
					 System.out.println("Enter The Amount To WithDrawn");
					 double withdrawAmount=in.nextDouble();
					 op.withdrawAmnt(withdrawAmount);
				 }
				 else if(ch==3)
				 {
					 System.out.println("Enter The Amount To Deposit");
					 double depositAmount=in.nextDouble();
					 op.depositeAmnt(depositAmount);
				 }
				 else if(ch==4)
				 {
					 
					 op.viewMiniStatement();
					 
				 }
				 else if (ch==5)
				 {
		         System.out.println("Collect Your ATM card\n THANK YOU FOR USING ATM");
		         System.exit(0);
				 }
				 else
				 {
					 System.out.println("Incorrect Atm NUmber OR Pin ");
					 System.exit(0);
					 
				 }
				 
			 }
		 }
	}
     
     
	}

}
