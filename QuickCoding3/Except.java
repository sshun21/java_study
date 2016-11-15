package mobile;

import java.util.Scanner;

public class Except {
	public static void main(String[] args) throws Exception {
		  @SuppressWarnings("resource")
		  Scanner in = new Scanner(System.in);
		  
		  String str1 = in.nextLine();
		  String str2 = in.nextLine();
		  
		  int num1, num2;
		  
		  try{
			  num1 = Integer.parseInt(str1);
			  num2 = Integer.parseInt(str2);
			  if ( num1 >= 1000 || num2 >= 1000 )
				  throw new Exception();
			  
			  Divide(num1,num2);
			  
		  }
		  catch (NumberFormatException e){
			  e.toString();
			  System.out.println("NumberFormatException Occured");
		  }
		  catch (ArithmeticException e){
			  e.toString();
			  System.out.println("Devided by Zero");
		  }
		  catch (Exception e){
			  e.toString();
			  System.out.println("number is too big");
		  }
	}
	public static void Divide(int num1, int num2){
		int result=num1/num2;
		System.out.println(result);
	}
}
