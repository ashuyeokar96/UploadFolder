package com.cjc.Map;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		System.out.println("Enter the number : - ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			for(int sp=i;sp<x;sp++)
			{
				System.out.print("-");
			}
			
			for(int j=1;j<=(2*i-1);j++)
				
			{  
			 System.out.print("-*-");
		
			}
			for(int sp=i;sp<x;sp++)
			{
				System.out.print("-");
			}
//			for(int sp=x;sp>=i;sp--)
//			{
//				System.out.print("-");
//			}
			
			System.out.println("");
		}
		
	}

}
