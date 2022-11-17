package Coursework;
import java.util.*;
public class Githubsubmissionwork {
//KAWEESI PATRICK
	//2021/A/KIT/3022/G/F
	public static void main(String[] args) {
		/* The following program will help 	Kabale university to easily deposit money on different 
		 * government sponsored students */
		 Scanner sc = new Scanner(System.in);
		String response,faculty,   Reg_number;
		String Fname, mname, lname, programme,mode_of_payment, names;
		int age;
		int Year_of_study, semester;
			int tel_number, account_number ;
			float living_out=840000, faculty_allowance=120000,total_amount;
			String allowances;
		System.out.print("Do you agree that you belong to Kabale university "
				+ "Governement sponsered fraternity?\n");
		System.out.print("YES OR NO?..");
		response = sc.nextLine();
		if(response.equals("YES")) {
			System.out.print("Great, fill out the form below.\n");
			//fill in form 
			System.out.print("First Name:");
			Fname = sc.nextLine();
			System.out.print("middle Name:");
mname = sc.next();
System.out.print("Last Name:");
lname = sc.next();
System.out.print("How old are you?");
  age = sc.nextInt();
  System.out.print("Programme of study:");
  programme = sc.next();
  System.out.print("Registration Number:");
  Reg_number = sc.next();
  System.out.print("Faculty/school:");
  faculty = sc.next();
  System.out.print("Your current year of study:");
  Year_of_study = sc.nextInt();
   System.out.print("Current semester:");
   semester = sc.nextInt();
   System.out.print("Livingout allowance, \n Faculty allowamce?\n");
   System.out.print("Please select type of allowance:\n"
   		+ "Livingout or Faculty allowance?");
   allowances = sc.next();
   if(allowances.equals("Livingout")) {
	 System.out.print("Enter the amount please:"); 
	 living_out = sc.nextFloat();
	 if(living_out==840000) {
		 
	System.out.print("How do you like to recieve the money?\n"
			+ "Via mobile or account?");
	mode_of_payment = sc.next();
	if(mode_of_payment.equals("mobile")) {
		System.out.print("Please provide your mobile number:");
		tel_number = sc.nextInt();
		
		System.out.print("Registered names:");
		names = sc.next();
	}else {
		System.out.print("Provide your account Number:");
		account_number =sc.nextInt();
		System.out.print("Registered Names:");
		names = sc.next();
		System.out.print("Bank Name:");
		names = sc.next();
		System.out.print("Thank you for registering!\n will be back to you soon");
	}
	
	 }else {
		 System.out.print("Invalid fee, please re-enter the amount:");
		 living_out = sc.nextFloat();
	 }
	 
   }else {
	   System.out.print("Faculty allowance fee: ");
	   faculty_allowance = sc.nextFloat();  
	   
		 if(faculty_allowance==120000) {
			 
				System.out.print("How do you like to recieve the money?\n"
						+ "Via mobile or account?");
				mode_of_payment = sc.next();
				if(mode_of_payment.equals("mobile")) {
					System.out.print("Please provide your mobile number:");
					tel_number = sc.nextInt();
					
					System.out.print("Registered names:");
					names = sc.next();}
				}else {
					System.out.print("Provide your account Number:");
					account_number =sc.nextInt();
					System.out.print("Registered Names:");
					names = sc.next();
					System.out.print("Bank Name:");
					names = sc.next();
					
					System.out.print("Thank you for registering!\n will be back to you soon!");
				}
					
				
					
				}
		
		}else {System.out.print("Danger! Danger!\nStop here! Go back PLEASE\n you are not allowed to\n signup here!");
			
		
			
		
   }
		total_amount =	faculty_allowance + living_out;
		System.out.print("The total amount to be recieved is" +total_amount);
	
	}}
