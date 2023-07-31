package com.pnc.exception;

import java.util.*;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application starts!");
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number");
			int num = s.nextInt();
			System.out.println(10/num);
		}
		catch(ArithmeticException e){
			System.out.println("AE handing code" + (10/10));
		}
		catch(InputMismatchException ime){
			System.out.println("Enter valid number" + ime);
		}
		
		System.out.println("Rest of application");

	}

}
