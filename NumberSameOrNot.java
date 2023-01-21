package operators;
import java.util.Scanner;
public class NumberSameOrNot {
	public static void main(String[] args) {
	int number=12;
	int num=0;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number: ");
	num=input.nextInt();
	 while(num!=number) 
	 {
		 System.out.println("enter the number from 1 to 20: ");
			num=input.nextInt();
	 }
	 System.out.println("congratulations! your entered number and program number are same!!");
	 input.close();
	}

}
