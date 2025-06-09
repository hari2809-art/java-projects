package com.Teja;

import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		System.out.println("enter num1 and num2 values:");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("enter the operator +,-,*,/,%");
		char operators=sc.next().charAt(0);
		double result;
		switch(operators) {
		case '+' :
			result=num1+num2;
			System.out.println("result:"+result);
			break;
			
		case '-' :
			result=num1-num2;
			System.out.println("result:"+result);
			break;
			
		case '*' :
			result=num1*num2;
			System.out.println("result:"+result);
			break;
			
		case '/' :
			if(num2!=0) {
			result=num1/num2;
			System.out.println("result:"+result);
			}else {
				System.out.println("Error:cannot divided by zero");
			}
			break;
			
		case '%' :
			result=num1%num2;
			System.out.println("result:"+result);
			break;
		
		default:
			System.out.println("Invalid Operator:");
		}
		sc.close();
	}

}