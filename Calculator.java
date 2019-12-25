package Calc;

public class Calculator {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		char sign = '^';
		
	if (sign == '+') {
		int sum = a+b;
	 System.out.print ("a+b= "+ sum);}
	
	if (sign == '-') {
		int rest = a-b;
	 System.out.print ("a-b= "+ rest);}
	
	if (sign == '/') {
		if (b==0) {
			 System.out.println ("Can't divide by 0");}
		float div = a/b;
	 System.out.print ("a/b= "+ div);
	  }
	
	if (sign == '*') {
		int mult = a*b;
	 System.out.print ("a*b="+ mult);}
	
	if (sign == '^') {
		int power = 1;
		for (int i=1; i<=b;i++)
		{power = power*a;}
	 System.out.print ("a^b= "+ power);}
	
	if (sign == '%') {
		 if (b==0) {
			 System.out.println ("Can't divide by 0");}
		int mod = a%b;
	 System.out.print ("a % b= "+ mod); 
	}
	
 }	

}
