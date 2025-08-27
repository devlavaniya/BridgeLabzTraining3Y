// package BridgeLabzTraining3Y.work;

import java.util.Scanner;

public class Libraryfinecalculator {
    public static int finecal(int late_days) {
		int fine=0;
		if(late_days<=5) {
			fine = late_days*10;
		}
		else if(late_days<=10) {
			fine = (5*10) + ((late_days-5)*20);
		}
		else {
			fine = (5*10) + (5*20) +((late_days-10)*50);
			
		}
		return fine;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int  fine=0;
		System.out.println("enter the no. of students: ");
		int n = sc.nextInt();
		int j=0 ;
		while(j<n) {
		System.out.println("enter the items are borrowed");
		int items = sc.nextInt();
		for(int i=0 ; i<items ; i++) { 
			System.out.println("Enter the type of item (Regular , Reference , magazine) : 1 , 2, 3 resp... ");
			int itemtype=sc.nextInt();
			System.out.println("Enter the late days:");
			int late_days = sc.nextInt();
			fine += finecal(late_days);
		}
		System.out.println("total fine " + fine + " $");
		System.out.println("x---------------");
		System.out.println("you want to check for another student : (true/false)?");
		boolean a =sc.nextBoolean();		
		if(a==false) break;
		j++;
	}
	}

    
}
