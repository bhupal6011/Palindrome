import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
int number=0;
int reverse=0;
int numCopy=0;
System.out.println("Enter a number and check if it is palindrome");
Scanner in=new Scanner (System.in);
number= in.nextInt();
numCopy=number;
while(numCopy>0)
{
	int digit=numCopy %10;
	numCopy=numCopy/10;
reverse=(reverse*10)+digit;
}
if(number==reverse)
	System.out.println("The number "+number+" is a palindrome.");
else
	System.out.println("The number "+number+" is  not a palindrome.");

	}
}

 
