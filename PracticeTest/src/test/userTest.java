package test;

import java.util.Scanner;

public class userTest {

	public static void main(String[] args) {
		System.out.println("Run Main Method ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value:");
		int x =sc.nextInt();
		System.out.println("Enter y value:");
		int y = sc.nextInt();
		userTest us = new userTest();
		us.user(x, y);
		
	
	}
	
	public void user(int a,int b) {
		int sum = a + b;
		System.out.println(sum);
	}
}