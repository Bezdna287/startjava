import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args){

		byte age = 5;
		float height = 1.50f;
		char firstLetter = 'W';
		String sex = "Woman";




		if (age>20) {
			System.out.println ("Amazing, you are old enough! "+ age);}

		if ( sex == "Man"){
			System.out.println ("Amazing, you are a man! "+sex);}
			else if ( sex != "Man") {
			System.out.println ("Amazing, you are not a man! "+sex);}

		if (height<1.80) {
			System.out.println ("So good, you are still growing up! "+height);
		} 
		 else {
		 	System.out.println ("Wow, you are so tall!!! "+height);
		 }

 		if ( firstLetter =='M'){
			 System.out.println ("Everything is correct "+firstLetter);}
			else if ( firstLetter =='G'){
			 System.out.println ("Everything is correct again "+firstLetter);}
			else {
			 System.out.println ("Try again! "+firstLetter);}


	}
}