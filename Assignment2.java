/*
// AUTHOR: Sean Solomon
// FILENAME: Assignment2
// SPECIFICATION: Using conditional (if, if-else) statements, rock-paper-scissors game
// FOR: CS 1400 - ASSIGNMENT #2
// TIME SPENT: 3 Hours //*/

//*

import java.util.Scanner;

	//class name should match the file name
	public class Assignment2 {
		// we must have a main method to run the program
        public static void main(String[] args) {
		 
		 	//Variables
        	// create a Scanner object to get input from the keyboard
		 	String Player1Input = "";
	        String Player2Input = "";
	        Scanner scan = new Scanner(System.in);
	        
	        //Player1 prompt
	        System.out.println("Player 1: Choose rock, scissors, or paper: ");
	        //Player1 Input
	        Player1Input = scan.nextLine();
	        Player1Input = Player1Input.toLowerCase();
	        //Player2 prompt
	        System.out.println("Player 2: Choose rock, scissors, or paper: ");
	        //Player2 Input
	        Player2Input = scan.nextLine();
	        Player2Input = Player2Input.toLowerCase();
	      
	        //Display Outcomes
	        if (Player1Input.equals("rock") && Player2Input.equals("rock")) {
	        	System.out.println("It's a tie");
	        } 
	        	else if (Player1Input.equals("paper") && Player2Input.equals("paper")) {
	        		System.out.print("It's a tie");
	        } 
	        	else if (Player1Input.equals("scissors") && Player2Input.equals("scissors")) {
	        		System.out.print("It's a tie");
	        	
	        } 
	        	else if (Player1Input.equals("scissors") && Player2Input.equals("paper")) {
	        		System.out.print("Player 1 wins.");
	        } 
	        	else if (Player1Input.equals("rock") && Player2Input.equals("scissors")) {
	        		System.out.print("Player 1 wins.");
	        } 
	        	else if (Player1Input.equals("paper") && Player2Input.equals("rock")) {
	        		System.out.print("Player 1 wins.");
	        	
	        } 
	        	else if (Player2Input.equals("scissors") && Player1Input.equals("paper")) {
	        		System.out.println("Player 2 wins.");
	        } 
	        	else if (Player2Input.equals("rock") && Player1Input.equals("scissors")) {
	        		System.out.print("Player 2 wins.");
	        } 	
	        	else if (Player2Input.equals("paper") && Player1Input.equals("rock")) {
	        		System.out.print("Player 2 wins.");
	       
	        }
	        	else {
	        		System.out.println("Wrong choice!");
	        	}
	
	 }//end main method
}
