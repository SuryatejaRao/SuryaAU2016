package com.accolite.demo;

import java.util.Scanner;

public class CalImplementation implements Calculator {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public Long mul(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (long) a * b;
	}

	@Override
	public Integer div(Integer a, Integer b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	public static void main(String[]args){
		Calculator calculator = new CalImplementation();
		Integer a,b,choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a");
		a = in.nextInt();
		
		System.out.println("Enter A");
		b=in.nextInt();
		
		System.out.println("choice:\n1. Add\n2. Sub\n3. Mul\n4. Div\n");
		choice = in.nextInt();
		
		switch (choice) {
		case 1 :
			 System.out.println(calculator.add(a, b));
			 break;
		case 2: 
			 System.out.println(calculator.sub(a,b));
			 break;
		case 3:
			System.out.println(calculator.mul(a, b));
			break;
		case 4:
			try{
				System.out.println(calculator.div(a, b));
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			break;

		default:
			break;
		}
		
	}



		
		
	} 
	

