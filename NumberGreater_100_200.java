package operators;
import java.util.Scanner;
public class NumberGreater_100_200 {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int number=0,greater=0;
		System.out.println("enter the number: ");
		number=input.nextInt();
		while(number>=100 && number<200) {
			greater=1;
			if(greater==1)
				System.out.println("yes number is greater than 100 and 200\n your entered number is:"+number);
			 break;
		}
		System.out.println("number not greater than 200");
	input.close();
	}

}
