import java.util.Scanner;
public class add {
	public static void main(String[] args) {
		System.out.println("Enter the numbers for Addition : ");
		Scanner s=new Scanner(System.in);

		System.out.println("Enter Number1 : ");
		int a=s.nextInt();

		System.out.println("Enter Number2 : ");
		int b=s.nextInt();

		System.out.println("The Addition is : " +(a+b));

	}
}