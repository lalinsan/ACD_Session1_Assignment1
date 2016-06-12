/*
 * Student: Eduardo Aguirre
 * Session 1
 * Assignment 1
 * Write a program to print the sum of two numbers. One number should be int and another should be
 * float
 */


public class Sum2Numbers {

	public static void main(String[] args) {
		int num1=10;
		float num2=5.5f;
		int num3 = (int)num2; //Cast Float to Int
		int sum = (num1+num3);

		//Print Number
		System.out.println("Int Number 1 : " +num1);
		System.out.println("Float Number 2 : " +num2);
		
		//Print Sum of Numbers
		System.out.println("=====================");
		System.out.println("Numbers Sum :" +sum);
		System.out.println("=====================");
	}

}
