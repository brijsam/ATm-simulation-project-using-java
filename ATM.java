import java.util.Scanner;
public class ATM
{
    public static void main(String...k)
    { 
        int balance = 5000, withdraw, deposit,pass=1234;
	System.out.println("\n\t\tEnter Password (Default pass=1234)");
        Scanner s = new Scanner(System.in);
	int p = s.nextInt();
if(p==pass)
    {
        while(true)
        {
            System.out.println("\n\t\tAutomated Teller Machine");
	    System.out.println("**********************************************************");
            System.out.println("*    Choose 1 for Withdraw        Choose 2 for Deposit   *");
            System.out.println("*                                                        *");
	    System.out.println("* Choose 3 for Fast Withdraw  Choose 4 for Check Balance *");
            System.out.println("*                                                        *");
	    System.out.println("*                  Choose 5 for EXIT                     *");
	    System.out.println("**********************************************************");
            System.out.print("\n\tChoose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("\n\tEnter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("\n\t\tPlease collect your Cash");
                }
                else
                {
                    System.out.println("\n\tInsufficient Fund");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("\n\tEnter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("\n\tYour Money has been successfully deposited");
                System.out.println("");
                break;
 
		case 3:
                System.out.println("*************************************************************************");
		System.out.println("*                                                                        *");
                System.out.println("*  Choose 1 to Withdraw Rs 100        Choose 2 to Withdraw Rs 200        *");
                System.out.println("*                                                                        *");
                System.out.println("*  Choose 3 to Withdraw Rs 500        Choose 4 to Withdraw Rs 2000       *");
                System.out.println("*                                                                        *");
                System.out.println("*  Choose 5 to Withdraw Rs 5000      Choose 6 to Withdraw Rs 10000       *");
                System.out.println("*                                                                        *");
                System.out.println("**************************************************************************");
		int m = s.nextInt();
        
                if(m==1)
           	{  
			if(balance >= 100)
			{
                    balance = balance - 100;
                    System.out.println("\n\tPlease collect your Cash");
			}
			else
                	{
                    System.out.println("\n\tInsufficient Funds");
                	}
                System.out.println("");
                break;
		}

		if(m==2)
                {  
			if(balance >= 200)
			{
                    balance = balance - 200;
                    System.out.println("\n\tPlease collect your Cash");
			}
			else
              		  {
                    System.out.println("\n\tInsufficient Funds");
            	          }
                System.out.println("");
                break;
		}

		if(m==3)
                {  
			if(balance >= 500)
			{
                    balance = balance - 500;
                    System.out.println("\n\tPlease collect your Cash");
			}
			else
               		 {
                    System.out.println("\n\tInsufficient Funds");
               		 }
                System.out.println("");
                break;
		}

		if(m==4)
                {  
			if(balance >= 2000)
			{
                    balance = balance - 2000;
                    System.out.println("\n\tPlease collect your Cash");
			}
			else
              		  {
                    System.out.println("\n\tInsufficient Funds");
               		  }
                System.out.println("");
                break;
		}

		if(m==5)
                {  
			if(balance >= 5000)
			{
                    balance = balance - 5000;
                    System.out.println("\n\tPlease collect your Cash");
			}
			else
              		  {
                    System.out.println("\n\tInsufficient Funds");
               		  }
                System.out.println("");
                break;
		}

		if(m==6)
                {  
			if(balance >= 10000)
			{
                    balance = balance - 10000;
                    System.out.println("\n\tPlease collect your Cash");
			}
			else
              		  {
                    System.out.println("\n\tInsufficient Funds");
               		  }
                System.out.println("");
                break;
		}
		else
		{
		System.out.println("\n\t Wrong Input");
		}
		break;
		
		case 4:
                System.out.println("\n\t\tYour Balance : Rs "+balance);
                System.out.println("");
                break;
                
                case 5:
		System.out.println("     \n\t               Thank You ");
		System.out.println("                    Have a nice Day ");
                System.exit(0);
            }
        }
    }
	else
		{
		System.out.println("\n\tWrong Password Try Again");
		}
    }
}