import java.util.ArrayList;
public class CommaCode{
	public static void main(String[] args){
		ArrayList spam = new ArrayList();
		spam.add("apples");
		spam.add("bananas");
		spam.add("tofu");
		spam.add("cats");
		for(int i = 0; i < spam.size(); i++){
			System.out.print(spam.get(i));
			if (i<3){
				System.out.print(", ");
			}
		}		
	}
}