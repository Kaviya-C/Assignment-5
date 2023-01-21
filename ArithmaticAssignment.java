package operators;

import java.util.Scanner;

public class ArithmaticAssignment {
	public static void main(String[] args) {
		
		int num1=0,moduloResult=0,addResult=0,mulResult=0,num2,num3,num4,num5;
		float subResult=0,divResult=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter five number : ");
	
		num1=input.nextInt();
		
		num2=input.nextInt();
		
		num3=input.nextInt();
		
		num4=input.nextInt();
		
		num5=input.nextInt();
		
		addResult=num1+=10;
		subResult=num2-=10;
		mulResult=num3*=10;
		divResult= num4/=10;	
		moduloResult=num5%=10;
		
		System.out.println("arithmatic assignment in addition "+addResult);
		System.out.println("arithmatic assignment in subtraction "+subResult);
		System.out.println("arithmatic assignment in multiplication "+mulResult);
		System.out.println("arithmatic assignment in division "+divResult);//100=100/10
		System.out.println("arithmatic assignment in modulo "+moduloResult);

		input.close();
	}
}