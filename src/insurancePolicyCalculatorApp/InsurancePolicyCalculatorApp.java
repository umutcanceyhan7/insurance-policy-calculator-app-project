package insurancePolicyCalculatorApp;
import java.io.FileNotFoundException;
import java.util.Scanner;

import classes.*;

public class InsurancePolicyCalculatorApp {
		
	
		public static double fixedFee = 2000;
		public static double currentYear = 2020;
		public final static String INSURED_VALUES_FILE = "HW2_InsuredValues.csv";
		public enum INSURED_VALUES{Workplace,Housing,Person,Truck,Automobile};
	public static void main(String[] args) throws FileNotFoundException {
		
		Helper helper=new Helper();

		System.out.println("WELCOME TO INSURANCE POLICY CALCULATOR");
		System.out.println("Please type numbers to see informations that writes after the number you typed.");
		System.out.println("1 : All insured values\n2 : Workplaces\n3 : Housings\n4 : Persons\n5 : Automobiles\n6 : Trucks\n9 : Exit");
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			
			
			String userInput = sc.next();
			
			
			if(userInput.equals("1")) {
				//PRINT ALL VALUES
				helper.printWorkplaceValues();
				helper.printHousingValues();
				helper.printPersonValues();
				helper.printAutomobileValues();
				helper.printTruckValues();
			}
			else if(userInput.equals("2")) {
				//PRINT WORKPLACES
				helper.printWorkplaceValues();
			}
			else if(userInput.equals("3")) {
				//PRINT HOUSINGS
				helper.printHousingValues();
			}
			else if(userInput.equals("4")) {
				//PRINT PERSONS
				helper.printPersonValues();
			}
			else if(userInput.equals("5")) {
				//PRINT AUTOMOBILES
				helper.printAutomobileValues();
			}
			else if(userInput.equals("6")) {
				//PRINT TRUCKS
				helper.printTruckValues();
				
			}
			else if(userInput.equals("9")) {
				System.out.println("Good Bye!");
				break;
			}
			else {
				System.out.println("INVALID TYPING");
			}
			System.out.println("1 : All insured values\n2 : Workplaces\n3 : Housings\n4 : Persons\n5 : Automobiles\n6 : Trucks\n9 : Exit");
		}
		sc.close();   
	}

}
