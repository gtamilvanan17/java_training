package zha_training;

import java.util.Scanner;

public class Conditional_Statements {

	public static void main(String[] args) {
		System.out.println("Enter the Value: ");
		int a;
		Scanner sys= new Scanner(System.in);
		a=sys.nextInt();
		
		if(a>100) {
			System.out.println(a+5);
		}
		else {
			System.out.println(a-5);
		}
	}

}
