import java.util.Scanner;
import java.lang.StringBuilder;;
public class Roman {
	static StringBuilder conversionArray = new StringBuilder(); //Array to be built
	static int modifier = 0; 									//Value to update while appending characters
	static int input = 0;										// original input so I could use it globally, possibly could delete
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value to convert to Roman numerals:");  // Getting user input
		int input = scan.nextInt();
		scan.close();
		
		
		Roman.Thousands(input); 			//Calling functions
		Roman.FiveHundred(modifier);		//Should probably move all these functions to a separate class?
		Roman.Hundreds(modifier);
		Roman.Fifty(modifier); 
		Roman.Tens(modifier);
		Roman.Ones(modifier);
		
		System.out.println(conversionArray); // Prints the array of characters
	}
	//	Functions, all basically are the same other than Ones because 
	//				it doesn't need to return anything
	

	public static int Thousands(int input){
		if(input / 1000 >= 1){
			int iterate = input/1000;
			modifier = input - iterate * 1000;
			for (int i = 0; i < iterate; i++){
			conversionArray.append("M");
			}
		} 
		else{
			modifier = input;
		}
		return modifier;
	}
	public static int FiveHundred(int input){
		if(input / 500 >= 1){
			int iterate = input/500;
			modifier = input - iterate * 500;
			for (int i = 0; i < iterate; i++){
			conversionArray.append("D");
			}
		} 
		else{
			modifier = input;
		}
		return modifier;
	}
	public static int Hundreds(int input){
		if(input / 100 < 10 & input / 100 > 0){
		int iterate = input / 100;
		modifier = input - iterate * 100;
		for (int i = 0; i < iterate; i++){
			conversionArray.append("C");
			}
		}
		else{
			modifier = input;
		}
		return modifier;
	}
	public static int Fifty(int input){
		if(input / 50 >= 1){
			int iterate = input/50;
			modifier = input - iterate * 50;
			for (int i = 0; i < iterate; i++){
			conversionArray.append("L");
			}
		} 
		else{
			modifier = input;
		}
		return modifier;
	}
	public static int Tens(int input){
		if(input / 10 < 10 & input / 10 > 0){
			int iterate = input / 10;
			modifier = input- iterate * 10;
			for (int i = 0; i < iterate; i++){
				conversionArray.append("X");
			}
		}
		else{
			modifier = input;
		}
		return modifier;
	}
	public static int Ones(int input){
		if (input > 0){
			for (int i = 0; i < input; i++){
				conversionArray.append("I");
				modifier--;
			}
		}
		return modifier;
	}
	
	
}
