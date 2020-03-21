import java.util.Scanner;

public class BasicStructures{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two integer values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("For a you entered: " + a);
		System.out.println("For b you entered: " + b);

		int sum;
		sum = a+b;
		if(sum==10){
			System.out.println("sum is equal");
		}
		else if(sum>10)
		{
			System.out.println("sum is greater");
		}
		else if(sum<10)
		{
			System.out.println("sum is lesser");
		}

		scan.close();
	}

}
