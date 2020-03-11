package com.niit.junit;

public class Calculator {
	public double add(double a,double b)
	{
		return a+b;
	}
	public double subtract(double a,double b)
	{
		return a-b;
	}
	public double multiply(double a,double b)
	{
		return a*b;
	}
	public double divide(double a,double b)
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		return a/b;
	}
 public static void main(String [] args)
 {
	 Calculator c=new Calculator();
	 System.out.println("Addion is:"+c.add(10.5, 12.5));
	 System.out.println("Subtraction is :"+c.subtract(10.5, 12.5));
	 System.out.println("Multiplication is : "+c.multiply(10.5, 12.5));
	 System.out.println("Division is "+c.divide(10.5, 12.5));
	 System.out.println("Addion ins "+c.add(155, 222));
 }
}
