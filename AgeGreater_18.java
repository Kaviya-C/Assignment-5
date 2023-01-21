package operators;
import java.util.Scanner;
public class AgeGreater_18 {
	public static void main(String[] args) {
		int age;
		Scanner input=new Scanner(System.in);
		do
		{
			System.out.println("enter the age: ");
			age=input.nextInt();
			
			
		}while(age==18 || age>=18);
		
		System.out.println("age is not greater than 18...! your entered age is " +age);
		
		
		input.close();
	}
}