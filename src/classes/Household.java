package classes;
import insurancePolicyCalculatorApp.InsurancePolicyCalculatorApp;

public class Household extends Insurance{

	public Household(InsuredValue insuredValue) {
		super(insuredValue);
	}
	
	@Override
	public double calculatePolicyCharge() {
		// TODO Auto-generated method stub
		double fixedFee = InsurancePolicyCalculatorApp.fixedFee;
		
		double currentYear = InsurancePolicyCalculatorApp.currentYear;
		
		double rankOfInsurance = currentYear - getInsuredValue().yearOfInsurance;
		
		double policyCharge = fixedFee * Math.pow(getInsuredValue().calculateRiskFactor(),2);
		
		if( ( rankOfInsurance >  2)) {	
			// DISCOUNT APPLIED
			policyCharge = (policyCharge * 90)/100;
			return policyCharge;
		}
		
		return policyCharge;
	}
	
	@Override
	public String toString() {
		return "The policy charge of " + getInsuredValue().insuranceNumber + ": " + this.calculatePolicyCharge() + " TL";
	}
}
