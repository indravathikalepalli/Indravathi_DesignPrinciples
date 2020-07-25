package com.designprinciples;

import java.util.Scanner;

public class Calculation extends Division {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Subtraction");
		System.out.println("Enter 2 for Multiplication");
		System.out.println("Enter 3 for Division");
		System.out.println("Enter 4 for Addition");
		System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice) {
        

    	case 1:
    	{
    		System.out.println("Enter two numbers for substraction");
    		System.out.println("Enter the first number:");
    		int nbr1=sc.nextInt();
    		System.out.println("Enter the second number:");
    		int nbr2=sc.nextInt();
    		System.out.println("Subtraction is "+sub(nbr1,nbr2));
    		break;
    	}
    	case 2:
    	{
    		System.out.print("Enter how many numbers you want to multiply:");
    		int t=sc.nextInt();
    		double[] ar=new double[t];
    		for(int i=0;i<t;i++)
    		{
    			System.out.print("Enter the "+(i+1)+" number:");
    			ar[i]=sc.nextInt();
    		}
    		double ans=mul(t,ar);
    		System.out.println("Multiplication is:"+ans);
    		break;
    	}
    	case 3:
    	{
    		System.out.println("Enter two numbers for division");
    		System.out.println("Enter the first number:");
    		int nbr1=sc.nextInt();
    		System.out.println("Enter the second number:");
    		int nbr2=sc.nextInt();
    		div(nbr1,nbr2);
    		break;
    	}
    	case 4:
        {
    		System.out.print("Enter how many numbers you want to add:");
    		int t=sc.nextInt();
    		double[] ar=new double[t];
    		for(int i=0;i<t;i++)
    		{
    			System.out.print("Enter the "+(i+1)+" number:");
    			ar[i]=sc.nextDouble();
    		}
    		double answer=add(t,ar);
    		System.out.println("Addition is:"+answer);
    		break;
    		
    	}
    	default:
    	{
    		System.out.println("Out of choice");
    	}
        
        }
        sc.close();
	}	

}
