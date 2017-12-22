import java.util.Scanner;
public class Pi{
	public static void main(String args[]){
		double pi = Math.PI;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many digits of Pi?");
		int input = scan.nextInt();
		System.out.println("You want Pi to the digit: " + input);
		String answer = Double.toString((double) pi);
		String cutstring = answer.substring(0, input+2);
		System.out.println("Here is your pi value: "+cutstring);
		scan.close();
	}
}
