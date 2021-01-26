package zha_training;

import java.util.Scanner;

public class Main {

	  public static void main (String[] args) {
		  System.out.println("Enter two values: ");
	  Scanner sc=new Scanner(System.in);
	  int a= sc.nextInt();
	  Scanner sca = new Scanner(System.in);
	  int b= sca.nextInt();
		  System.out.println("Before Swap" + " " + a + " " + b);
		  a=a+b;
		  b=a-b;
		  a=a-b;
		  System.out.println("After Swap" + " " + a + " " + b);
	  }
}
