import java.util.Scanner;


public class Collatz 
{
	public static void main(String[] args)
	{
		System.out.println("Number to parse: ");  
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		while (i != 1)
		{
			if ( i % 2 == 0)
			{
				i = i / 2;
				System.out.println(i);
			}
			else if ( i % 2 == 1)
			{
				i = i * 3 + 1;
				System.out.println(i);
			}
		}
	}
}
