package com.Tandemloop.screeningTest;

import java.util.Scanner;

	public class Problem_2 {
	    
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter value of a: ");
	        int a = sc.nextInt();
	        
	        
	        if (a <= 0) {
	            System.out.println("Please enter a positive integer greater than 0.");
	            sc.close();
	            return;
	        }
	        
	        if (a == 1) {
	            System.out.println("1");
	            sc.close();
	            return;
	        }
	        
	        
	        for (int i = 1; i <= a; i++) {
	            int oddNumber = 2 * i - 1;  
	            
	            if (i == a) {
	                System.out.print(oddNumber);        
	            } else {
	                System.out.print(oddNumber + ", ");
	            }
	        }
	        
	        System.out.println();
	        
	    }
	}

