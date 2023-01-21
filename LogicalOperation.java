package operators;
import java.util.Scanner;
public class LogicalOperation {
	public static void main(String[] args) 
	{
		int num1=0,num2=0;
		Scanner input =new Scanner(System.in);
		System.out.println("enter the two number: ");
		num1=input.nextInt();
		num2=input.nextInt();
		System.out.println("Logical and operation (num1>num2) && (num1==num2) is "+((num1>num2) && (num1==num2)));
		System.out.println("Logical or operation (num1>num2) || (num1==num2 is "+((num1>num2) || (num1==num2)));
		System.out.println("Logical not operation (num1>num2) is "+(!(num1>num2)));
		System.out.println("Logical and operation (num1<num2) && (num1!=num2) is "+((num1<num2) && (num1!=num2)));
				
		input.close();
	}


}
