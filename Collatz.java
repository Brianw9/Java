import java.util.Scanner;


public class Collatz 
{
	int i = 0;
	public static void main(String[] args)
	{
		System.out.println("Number to parse: ");  
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		while (i != 1)
		{
			i = Collatz.run(i);
			System.out.println(i);
		}
	}
	public static int run(int i){
		if ( i % 2 == 0)
		{
			i = i / 2;
			return i;
		}
		else if ( i % 2 == 1)
		{
			i = i * 3 + 1;
			return i;
		}
		else{
			return i;
		}
	}
}
