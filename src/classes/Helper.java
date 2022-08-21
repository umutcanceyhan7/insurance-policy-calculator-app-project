package classes;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import fileIO.FileIO;
import insurancePolicyCalculatorApp.InsurancePolicyCalculatorApp;

public class Helper {
	
	public  ArrayList<InsuredValue> getInsuredValueObjectsList(ArrayList<ArrayList<Object>> insuredValuePropertiesList)
	{  
	      int insuredValueObjectAmount = insuredValuePropertiesList.size();
	      // Created empty insuredValueObjects Array
	      
	      ArrayList<InsuredValue> insuredValueObjectsList = new ArrayList<InsuredValue>(insuredValueObjectAmount);
	      
	      
	      for (int i=0; i<insuredValueObjectAmount; i++) {
	            // Initializes object properties array;
	    	  	ArrayList<Object> tempPropertiesArray = insuredValuePropertiesList.get(i);
	    	  	//Property variables are creating	
	    	  	
	            String id=(String) tempPropertiesArray.get(0);
	            int yearOfInsurance=(int) Integer.parseInt((String) tempPropertiesArray.get(1));
	            String city=(String) tempPropertiesArray .get(2);
	            // Checks which insuredValues is this using ID.
	            if(id.startsWith("W") || id.startsWith("H")) {
	            	
	              int numberOfFloors=(int) Integer.parseInt((String) tempPropertiesArray.get(3));
	              int yearOfConstruction=(int) Integer.parseInt((String) tempPropertiesArray.get(4));
	              String typeOfConstruction=(String) tempPropertiesArray.get(5);
	              int surfaceArea=(int) Integer.parseInt((String) tempPropertiesArray.get(6));
	              // If insured value is workplace 
		          if(id.startsWith("W")){
		        	  int annualRevenue=(int) Integer.parseInt((String) tempPropertiesArray.get(7));
		              // Workplace object initialized	   
		              Workplace tempWorkplaceObj= new Workplace(
		            		  id,
		            		  yearOfInsurance,
		            		  city,
		            		  numberOfFloors,
		            		  yearOfConstruction,
		            		  typeOfConstruction,
		            		  surfaceArea,
		            		  annualRevenue
		            		  );
		              // Workplace object added to the objects list
		              insuredValueObjectsList.add(tempWorkplaceObj);}
		          // If insured value is housing    	
		          else {		
		              String residentSituation=(String)tempPropertiesArray.get(7);
		              // Housing object is initialized
		              Housing housingObj=new Housing(
		            		  id,
		            		  yearOfInsurance,
		            		  city,
		            		  numberOfFloors,
		            		  yearOfConstruction,
			            	  typeOfConstruction,
			            	  surfaceArea,
			            	  residentSituation
			            	  );
		              // Housing object added to the objects list.
			          insuredValueObjectsList.add(housingObj);
		              		}
	              }
	            // If insured value is person 
	            else if(id.startsWith("P")){
	            	
	            	String name=(String) tempPropertiesArray.get(3);
		            long nationalID=(long) Long.parseLong((String) tempPropertiesArray.get(4));
		            String gender=(String) tempPropertiesArray.get(5);
		            int yearOfBirth=(int) Integer.parseInt((String) tempPropertiesArray.get(6));
		            String typeOfIlness=(String) tempPropertiesArray.get(7);
		            // Person object initialized
		            Person personObj=new Person(
		            		id,
		            		yearOfInsurance,
		            		city,
		            		name,
		            		nationalID,
		            		gender,
		            		yearOfBirth,
		            		typeOfIlness
		            		);
		            // Person object added to the objects list
		            insuredValueObjectsList.add(personObj);
		            }
		        
	            // If insured values are automobile or truck 
	            else if(id.startsWith("A")|| id.startsWith("T")){
	            	double engineVolume=(double) Double.parseDouble((String) tempPropertiesArray.get(3));
	            	int yearOfProduction=(int) Integer.parseInt((String) tempPropertiesArray.get(4));
	            	String typeOfGear=(String) tempPropertiesArray.get(5);
	            	int fuelTankVolume=(int) Integer.parseInt((String) tempPropertiesArray.get(6));
		            // If insured value is automobile 
	            	if(id.startsWith("A")){
	            		String typeOfRoof=(String) tempPropertiesArray.get(7);
	            		// Automobile object is initialized
	            		Automobile automobileObj=new Automobile(
	            				id,
	            				yearOfInsurance,
	            				city,
	            				engineVolume,
	            				yearOfProduction,
	            			    typeOfGear,
	            			    fuelTankVolume,
	            			    typeOfRoof
	            			    );
	            		// Automobile object is added to the objects list
		                insuredValueObjectsList.add(automobileObj);
		                }
		            // If insured value is truck
		            else{
		             String typeOfTruckBed=(String) tempPropertiesArray.get(7);
		             // Truck object is initialized
		             Truck truckObj=new Truck(
		            		 id,
		            		 yearOfInsurance,
		            		 city,
		            		 engineVolume,
		            		 yearOfProduction,
		            		 typeOfGear,
		            		 fuelTankVolume,
		            		 typeOfTruckBed
		            		 );
		             // Truck object added to the objects list.
		             insuredValueObjectsList.add(truckObj);
		            }
		       }
	            
	      }
	         return insuredValueObjectsList;
	}
	
	
	
	/** NOT COMPLETED            TRIED TO ABSTRACTING PRINTING INSURED VALUES FUNCTIONS
	public void printInsuredValueObjects(INSURED_VALUES selectedInsuredValue) throws FileNotFoundException {
		
		PolicyRecord policyRecord =  this.initializeObjectsAndCreatePolicyRecord();
		ArrayList<InsuredValue> tempInsuredValueArray = new ArrayList<InsuredValue>();
		
		// CREATING AND ASSIGNING PROPER ARRAYLIST 
		if(selectedInsuredValue.equals(InsurancePolicyCalculatorApp.INSURED_VALUES.Automobile)) {
			tempInsuredValueArray = policyRecord.getAutomobileList();
			
		}
		else if(selectedInsuredValue.equals(InsurancePolicyCalculatorApp.INSURED_VALUES.Housing)) {
			tempInsuredValueArray = policyRecord.getHousingList();
		}
		else if(selectedInsuredValue.equals(InsurancePolicyCalculatorApp.INSURED_VALUES.Person)) {
			tempInsuredValueArray = policyRecord.getPersonList();
		}
		else if(selectedInsuredValue.equals(InsurancePolicyCalculatorApp.INSURED_VALUES.Truck)) {
			tempInsuredValueArray = policyRecord.getTruckList();
		}
		else if(selectedInsuredValue.equals(InsurancePolicyCalculatorApp.INSURED_VALUES.Workplace)) {
			tempInsuredValueArray = policyRecord.getWorkplaceList();
		}
		for(int i=0;i<tempInsuredValueArray.size();i++)
		{ 
			InsuredValue value=(InsuredValue)tempInsuredValueArray.get(i);
			System.out.println(value.toString());
			}
		
	}
	*/
	
	//  PRINTING PART STARTS FOR ALL INSURED VALUES  ---------------------------------------------------------------
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * Prints charge and other informations about Workplace object.
	 */
	
	
	public void printWorkplaceValues() throws FileNotFoundException {
		//Create policy record
		PolicyRecord policyRecord = this.initializeObjectsAndCreatePolicyRecord();
		// Create an empty insured values array. 
		ArrayList<InsuredValue> tempInsuredValueArray = new ArrayList<InsuredValue>();
		// Initialize array with insured value objects
		tempInsuredValueArray = policyRecord.getWorkplaceList();
		// Print insured values in the array with its policy charge.
		this.printInsuredValueAndHouseholdPolicyCharge(tempInsuredValueArray);
		
	}
	/**
	 * 
	 * @throws FileNotFoundException
	 * Prints charge and other informations about Housing object.
	 */
	
	
	public void printHousingValues() throws FileNotFoundException{
		// Create policy record
		PolicyRecord policyRecord = this.initializeObjectsAndCreatePolicyRecord();
		// Create an empty insured values array. 
		ArrayList<InsuredValue> tempInsuredValueArray = new ArrayList<InsuredValue>();
		// Initialize array with insured value objects
		
		tempInsuredValueArray = policyRecord.getHousingList();
		this.printInsuredValueAndHouseholdPolicyCharge(tempInsuredValueArray);
		
	}
	
	
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * Prints charge and other informations about Person object.
	 */
	
	
	public void printPersonValues() throws FileNotFoundException{
		// Create policy record
		PolicyRecord policyRecord = this.initializeObjectsAndCreatePolicyRecord();
		// Create an empty insured values array. 
		ArrayList<InsuredValue> tempInsuredValueArray = new ArrayList<InsuredValue>();
		// Initialize array with insured value objects
		tempInsuredValueArray = policyRecord.getPersonList();
		this.printInsuredValueAndHealthPolicyCharge(tempInsuredValueArray);
		
	}
	
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * Prints charge and other informations about Automobile object.
	 */
	
	
	public void printAutomobileValues() throws FileNotFoundException{
		// Create policy record
		PolicyRecord policyRecord = this.initializeObjectsAndCreatePolicyRecord();
		// Create an empty insured values array. 
		ArrayList<InsuredValue> tempInsuredValueArray = new ArrayList<InsuredValue>();
		// Initialize array with insured value objects
		
		tempInsuredValueArray = policyRecord.getAutomobileList();
		this.printInsuredValueAndTrafficPolicyCharge(tempInsuredValueArray);
		
	}
	
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * Prints charge and other informations about Truck object.
	 */
	
	
	public void printTruckValues() throws FileNotFoundException{
		// Create policy record
		PolicyRecord policyRecord = this.initializeObjectsAndCreatePolicyRecord();
		// Create an empty insured values array. 
		ArrayList<InsuredValue> tempInsuredValueArray = new ArrayList<InsuredValue>();
		// Initialize array with insured value objects
		tempInsuredValueArray = policyRecord.getTruckList();
		this.printInsuredValueAndTrafficPolicyCharge(tempInsuredValueArray);
		
	}
	
	
	public PolicyRecord initializeObjectsAndCreatePolicyRecord() throws FileNotFoundException {
		// READ FILE FUNCTION
		FileIO fileio=new FileIO();
		ArrayList<ArrayList<Object>> insuredValuePropertiesList=fileio.getinsuredValuePropertiesList(InsurancePolicyCalculatorApp.INSURED_VALUES_FILE);
		//
		// Creating needed list and object.
		ArrayList<InsuredValue> insuredValuesList=(ArrayList<InsuredValue>) this.getInsuredValueObjectsList(insuredValuePropertiesList);
		PolicyRecord policyRecord =new PolicyRecord(insuredValuesList);
		
		return policyRecord;
	}
	
	
	//  PRINTING PART ENDS FOR ALL INSURED VALUES  ---------------------------------------------------------------
	
	/**
	 * 
	 * @param <T>
	 * @param printingArray   specified InsuredValues Array
	 * 
	 * Takes specified InsuredValues array and prints TRAFFIC POLICY CHARGE and insured value variables.
	 */
	private <T> void printInsuredValueAndTrafficPolicyCharge(ArrayList<T> insuredValueArray) {
		for(int i=0; i<(insuredValueArray).size();i++) {
			// Prints the element 
			T tempInsuredValue = insuredValueArray.get(i);
			// Creates Insurance
			Insurance tempInsurance = new Traffic((InsuredValue) tempInsuredValue);
			// Prints values
			System.out.println(tempInsuredValue.toString());
			System.out.println(tempInsurance.toString());
		}
	}
	/**
	 * 
	 * @param <T>
	 * @param printingArray   specified InsuredValues Array
	 * 
	 * Takes specified InsuredValues array and prints HEALTH POLICY CHARGE and insured value variables.
	 */
	private <T> void printInsuredValueAndHealthPolicyCharge(ArrayList<T> insuredValueArray) {
		for(int i=0; i<(insuredValueArray).size();i++) {
			// Prints the element 
			T tempInsuredValue = insuredValueArray.get(i);
			// Creates Insurance
			Insurance tempInsurance = new Health((InsuredValue) tempInsuredValue);
			// Prints values
			System.out.println(tempInsuredValue.toString());
			System.out.println(tempInsurance.toString());
		}
	}
	
	/**
	 * 
	 * @param <T>
	 * @param printingArray   specified InsuredValues Array
	 * 
	 * Takes specified InsuredValues array and prints HOUSEHOLD policy charge and insured value variables.
	 */
	private <T> void printInsuredValueAndHouseholdPolicyCharge(ArrayList<T> insuredValueArray) {
		for(int i=0; i<(insuredValueArray).size();i++) {
			// Prints the element 
			T tempInsuredValue = insuredValueArray.get(i);
			// Creates Insurance
			Insurance tempInsurance = new Household((InsuredValue) tempInsuredValue);
			// Prints values
			System.out.println(tempInsuredValue.toString());
			System.out.println(tempInsurance.toString());
		}
	}
	
	/** 
	 * Creates an ArrayList of the insured value we send and returns a ArrayList
	 */
	public static ArrayList<InsuredValue> creatingListOfInsuredValues(List<InsuredValue> insuredValuesList, String insuredValue) {
		
		List<InsuredValue> tempList = new ArrayList<InsuredValue>();
		
		for(int i=0;i<insuredValuesList.size();i++){
			InsuredValue tempInsuredValue=insuredValuesList.get(i);
			String firstLetterOfInsuredValue = insuredValue.substring(0,1);
			// If insured values are matched add the value to its list
			if(tempInsuredValue.insuranceNumber.startsWith(firstLetterOfInsuredValue)){
			 tempList.add(tempInsuredValue);
			 }
		}
		
		return (ArrayList<InsuredValue>) tempList;
		
	}
	
/**	public  List<InsuredValue> getInsuredValueObjectsList(List<List<Object>> insuredValueList)
	{  
	      int rows = insuredValueList.size();
	      List<InsuredValue> insuredValueObjectsList = new ArrayList<InsuredValue>(rows);
	         for (int i=0; i<rows; i++) {
	            List<Object> row = insuredValueList.get(i);
	            String id=(String) row.get(0);
	            int yearOfInsurance=(int) Integer.parseInt((String) row.get(1));*/
	            
	            
       
}

