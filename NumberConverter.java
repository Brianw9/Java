package numConvert;

import java.util.Scanner;

public class NumberConverter {
	public static final String[] underTwenty = {
			"", "one", "two", "three", "four", "five", "six", "seven","eight","nine","ten","eleven",
			"twelve","thirteen","fourteen","fifteen","sixteen","seventeen", "eighteen","nineteen",
	};
	
	
	public static final String[] tens = {
		"",
		"",
		"twenty",
		"thirty",
		"fourty",
		"fifty",
		"sixty",
		"seventy",
		"eighty",
		"ninety",
	};
	
	public static String converter(final int num){
		if (num < 20){
			return underTwenty[num];
		}
		if (num < 100){
			return tens[num / 10] + (num % 10 == 0 ? "" : " ") + converter(num % 10);
		}
		if (num < 1000){
			return underTwenty[num / 100]+ " hundred " + converter(num % 100);
		}
		if (num < 10000){
			return underTwenty[num / 1000] + " thousand " + converter(num % 1000);
		}
		if (num < 20000){
			return underTwenty[num / 1000] + (num % 1000 == 0 ? "" : " ") + "thousand " + converter(num % 1000);
		}
		if (num < 100000){
			return tens[num / 10000] + (num % 10000 == 0? " thousand" : " ") + converter(num % 10000);
		}

		return "Something went wrong";
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value(1-99999) to convert to text:");
		int num = scan.nextInt();
		scan.close();
		System.out.println(converter(num));

	}

}
