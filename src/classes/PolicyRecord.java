package classes;
import java.util.ArrayList;
import java.util.List;

import insurancePolicyCalculatorApp.InsurancePolicyCalculatorApp;

public class PolicyRecord{
	
	private List<InsuredValue> insuredValuesList;
	
	
	public PolicyRecord(ArrayList<InsuredValue> insuredValueList)
	{
		this.insuredValuesList=insuredValueList;
	}
	
	public ArrayList<InsuredValue> getWorkplaceList()
	{ 
		ArrayList<InsuredValue> workplaceList = Helper.creatingListOfInsuredValues
		(this.insuredValuesList,InsurancePolicyCalculatorApp.INSURED_VALUES.Workplace.toString());
		
		return (ArrayList<InsuredValue>) workplaceList;
		
	}
	
	public ArrayList<InsuredValue> getHousingList()
	{
		ArrayList<InsuredValue> housingList = Helper.creatingListOfInsuredValues
		(insuredValuesList, InsurancePolicyCalculatorApp.INSURED_VALUES.Housing.toString());
		
		return (ArrayList<InsuredValue>) housingList;
		
	}
	
	public ArrayList<InsuredValue> getPersonList()
	{
		ArrayList<InsuredValue> personList = Helper.creatingListOfInsuredValues
		(insuredValuesList,InsurancePolicyCalculatorApp.INSURED_VALUES.Person.toString());
		
		return (ArrayList<InsuredValue>) personList;
		
	}
	
	public ArrayList<InsuredValue> getTruckList()
	{
		ArrayList<InsuredValue> truckList = Helper.creatingListOfInsuredValues
		(insuredValuesList, InsurancePolicyCalculatorApp.INSURED_VALUES.Truck.toString());
		
		return (ArrayList<InsuredValue>) truckList;
		
	}
	
	public ArrayList<InsuredValue> getAutomobileList()
	{
		ArrayList<InsuredValue> automobileList = Helper.creatingListOfInsuredValues
		(insuredValuesList, InsurancePolicyCalculatorApp.INSURED_VALUES.Automobile.toString());
		
		return (ArrayList<InsuredValue>) automobileList;
		
	}
}
