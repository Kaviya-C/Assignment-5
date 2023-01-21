package operators;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) 
	{
		int number=0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the number: ");
		number=input.nextInt();
		
		
		String result=(number%2==0)?"even number" :"odd number";
		System.out.println(result+" "+number);
		
		input.close();
	}

}
