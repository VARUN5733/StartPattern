package com.test.star;
public class PrintStarPattern {
	public static void main(String[] args) {
		
//		Left side Triangle
		
		for (int i=1; i<=5; i++){
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		Right side triangle		

		        for (int i = 1; i <= 5; i++) {
		            
		            for (int j = 1; j <= 5 - i; j++) {
		                System.out.print("  ");
		            }

		            for (int k = 1; k <= i; k++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
		  

//		Triangle
		        
		for (int i=0;i<5;i++) {
			
			for(int j=0;j<5-i-1;j++) {
				System.out.print(" ");
			} 
			
			for(int k=0; k<=i;k++){
				System.out.print("* ");
			}
			
			System.out.println();
			
		}	
	}
}