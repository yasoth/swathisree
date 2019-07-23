//import java.util.*;
package demo1;

import java.util.Scanner;

public class Workouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello world");
		int fact=1,number;
		System.out.println("Enter the number:");
		number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " +number+ " is "+fact);
	}

}
