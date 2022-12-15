package com.usingwhilereversesum;
import java.util.Scanner;

public class Sumofnaturalnumbers {
	static int n, i=n;
	static int sum=0;
	static Scanner sc=new Scanner(System.in);

	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		n=sc.nextInt();
		

while(i<n) {
	sum=sum +i;
	i++;
}
System.out.println("Sum of "+n+" numbers is :"+sum);
	}

	}


