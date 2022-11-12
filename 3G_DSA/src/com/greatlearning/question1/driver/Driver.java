package com.greatlearning.question1.driver;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.greatlearning.question1.service.Service;

class Driver {

	public static void main(String[] args) throws IOException {

//		1. Declare variables
		int noOfFloor;
		int[] floors;
		Scanner sc = new Scanner(System.in);

//		2. Take the height of the building from user and initialize the array
		System.out.println("enter the total no of floors in the building");

		noOfFloor = sc.nextInt();
		floors = new int[noOfFloor];

//		3. Take user input on floor sizes received on a particular day
		for(int i=0; i<noOfFloor; i++)  
		{  
			System.out.println("enter the floor size given on day : "+(i+1));
			floors[i] = sc.nextInt(); 
		}  
		System.out.println();

//		4. Implement the construction of the floors
		Service service = new Service();
		service.printConstructionTable(floors);
	}
}