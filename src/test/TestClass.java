package test;

import java.util.Scanner;

public class TestClass {
	public double  automobileCalculate() {
		Scanner sc = new Scanner(System.in);   
		//takes an integer input         
		Double[] values = new Double [5];   

		System.out.println("\nYou have entered: ");  
		//for-each loop to print the string  
		System.out.println("S�ras�yla\nEngine Volume\nFuel Tank Volume\nAge \nPlate City \nType of roof");
		//consuming the <enter> from input above  
		for (int i = 0; i < values.length; i++)   
		{  
		values[i] =  sc.nextDouble();  
		}  
		double automobileRiskFactor = ( values[0] * ((values[1]*4)/1000) * values[2] * ((values[3]*3)/100)   ) /values[4];
		return automobileRiskFactor;
		}  
	
	public double  personCalculate() {
		Scanner sc = new Scanner(System.in);  
		//takes an integer input         
		Double[] values = new Double [2];   
		System.out.println("\nYou will enter: ");  
		//for-each loop to print the string  
		System.out.println("Accordingly\nAge\nChronic Illness");
		//consuming the <enter> from input above  
		for (int i = 0; i < values.length; i++)   
		{  
		values[i] =  sc.nextDouble();  
		}  
		
		double personRiskFactor = ( values[0] * values[0]) / (values[1] * 18);
		return personRiskFactor;
		} 
		
	public double  workplaceCalculate() {
		Scanner sc = new Scanner(System.in);     
		//takes an integer input         
		Double[] values = new Double [6];   
		System.out.println("\nYou will enter: ");  
		//for-each loop to print the string  
		System.out.println("Accordingly\nPremises\nNumber of floors\nYear of construction\nType of construction\nSurface Area\nAnnual Revenue");
		//consuming the <enter> from input above  
		for (int i = 0; i < values.length; i++)   
		{  
		values[i] =  sc.nextDouble();  
		}  
		
		double workplaceRiskFactor = (values[0] * values[1] * values[2] * values[3]) * ((values[4] *2)/10) * ((values[5]*3)/1000);
		return workplaceRiskFactor;
		} 
	
	public double  housingCalculate() {
		Scanner sc = new Scanner(System.in);  
		//takes an integer input         
		Double[] values = new Double [6];   
		System.out.println("\nYou will enter: ");  
		//for-each loop to print the string  
		System.out.println("Accordingly\nPremises\nNumber of floors\nYear of construction\nType of construction\nSurface Area\nResident Situation");
		//consuming the <enter> from input above  
		for (int i = 0; i < values.length; i++)   
		{  
		values[i] =  sc.nextDouble();  
		}  
		
		double housingRiskFactor = ((values[0] * values[1] * values[2] * values[3]) * values[4]) / values[5];
		return housingRiskFactor;
		} 
	
	public double  truckCalculate() {
		Scanner sc = new Scanner(System.in);  
		//takes an integer input         
		Double[] values = new Double [5];   
		System.out.println("\nYou will enter: ");  
		//for-each loop to print the string  
		System.out.println("Accordingly\nAge\nFuel Tank Volume\nEngine Volume\nPlate City\nType Of Truck Bed\n");
		//consuming the <enter> from input above  
		for (int i = 0; i < values.length; i++)   
		{  
		values[i] =  sc.nextDouble();  
		}  
		
		double truckRiskFactor =  ( ((Math.pow(values[0],3))/((values[1]*8)/1000)) * values[2] * ((values[3]*3)/100) ) / values[4] ;
		return truckRiskFactor;
		} 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass test = new TestClass();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("This is test class for testing values");
			System.out.println("Press the number that matched with object you wanted to test.");
			System.out.println("1:Workplace\n2:Automobile\n3:Person\n4:Housing\n5:Truck");
			int number = sc.nextInt();
			switch(number) {
			case 1:
				System.out.println("Workplace risk factor " + test.workplaceCalculate());
				break;
			case 2:
				System.out.println("Automobile risk factor " + test.automobileCalculate());
				break;
			case 3:
				System.out.println("Person risk factor " + test.personCalculate());
				break;
			case 4:
				System.out.println("Housing risk factor " + test.housingCalculate());
				break;
			case 5:
				System.out.println("Truck risk factor " + test.truckCalculate());
				break;
			default:
				break;
			}
				
		}
		
	}

}
