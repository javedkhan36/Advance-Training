package com.question6;

import java.util.Scanner;

public class PhoneBook {
	
	public static String help_msg=	"Press:   -  A  Add contact  -  S  Search  - E  Exit :";
	public static void main(String[] args) {		
		System.out.println("\n\n*** Welcome to PhoneBook ***\n\n");
		Scanner s=new Scanner(System.in);		
		for(;;){
				System.out.print("[Main Menu] "+help_msg+"\n:");
				String command=s.nextLine().trim();				
 
				//if (command.equalsIgnoreCase("H")){					
					//System.out.println(help_msg);
				if (command.equalsIgnoreCase("A")){
					System.out.print("Type in contact details in the format: name,lastname,phone\n:");
 
				}else if (command.equalsIgnoreCase("S")){
					System.out.print("Type in the name you are searching for :\n:");
 
				}else if (command.equalsIgnoreCase("E")){
					System.out.println("Good Bye User....");
					System.exit(0);
				}else{					
					System.out.print("Unknown command ! Try again \n:");
				}
 
		}
 
	}

}
