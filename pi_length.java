import java.util.Scanner;
public class pi_length{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("How many digits of Pi?");
		int input = scan.nextInt();
		scan.close();
			if(input>=0&&input<=15){
				System.out.println("You want Pi to the digit: " + input);
				String answer = Double.toString((double) Math.PI);
				String cutstring = answer.substring(0, input+2);
				System.out.println("Here is your pi value: "+cutstring);
				}
		else{
			System.out.println("We dont have the technology for that yet");
		}
	}
}
