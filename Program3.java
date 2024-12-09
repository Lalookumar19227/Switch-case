import java.util.Scanner;
class Program3
{
	public static void main(String[] piyush)
	{
	Scanner sc=new Scanner(System.in);
	char p;
	do{
		System.out.println("ENter from Below Options: ");
		System.out.println("Press 1 to find ======>Factorial");
		System.out.println("Press 2 to find ======>Power");
		System.out.println("Press 3 to check ======>Prime");
		System.out.println("Press 4 to find ======>Reverse");
		System.out.println("Press 5 to check ======>Even or Odd");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("You Selected to find Facrorial");
				System.out.println("Enter the Number:");
				int x=sc.nextInt();
				int fact=1;
				for(int i=1;i<=x;i++)
				{
					fact=fact*i;
				}
				System.out.println(x+"!= "+fact);
				break;
				
			case 2:
				System.out.println("You have selected to find Power: ");
				System.out.println("Enter a: ");
				int a=sc.nextInt();
				System.out.println("Enter b: ");
				int b=sc.nextInt();
				findPower(a,b);
				break;
			case 3:
				System.out.println("You have selected to check prime: ");
				System.out.println("Enter the Number: ");
				int n=sc.nextInt();
				checkPrime(n);
				break;
			default:
				System.out.println("This is Not a valid Choice!!");
		}
		System.out.println("Press Y/y to continue or any other caharcter to Stop");
		p=sc.next().charAt(0);
	}while(p=='Y' || p=='y');
	System.out.println("Thank You!program Ends!!");			
	}
	public static void checkPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not a prime Number");
				return ;
			}
		}
		System.out.println("It is a Prime Number");
	}
	public static void findPower(int a, int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		System.out.println(a+" to power "+b+" is: "+pow);
	}
	
}














