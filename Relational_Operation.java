package operators;

import java.util.Scanner;

public class Relational_Operation {
	public static void main(String[] args)
	{
		int num1,num2;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the two number: ");
		num1=input.nextInt();
		num2=input.nextInt();
		System.out.println("number equal to "+num1+"=="+num2+" is "+(num1==num2));
		System.out.println("number less than or equal to "+num1+"<="+num2+" is "+(num1<=num2));
		System.out.println("number greater than or equal to "+num1+">="+num2+" is "+(num1>=num2));
		System.out.println("number lesser  "+num1+">"+num2+" is "+(num1>num2));
		System.out.println("number greater "+num1+"<"+num2+" is "+(num1<num2));
		System.out.println("number not equal to "+num1+"!="+num2+" is "+(num1!=num2));
		

		input.close();
	}

}
