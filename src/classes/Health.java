package classes;

import insurancePolicyCalculatorApp.InsurancePolicyCalculatorApp;

public class Health extends Insurance {

	public Health(InsuredValue insuredValue) {
		super(insuredValue);
	
	}

	@Override
	public double calculatePolicyCharge() {
		double fixedFee = InsurancePolicyCalculatorApp.fixedFee;
		
		double currentYear = InsurancePolicyCalculatorApp.currentYear;
		
		double rankOfInsurance = currentYear - getInsuredValue().yearOfInsurance;
		
		double policyCharge = ( fixedFee * Math.pow(getInsuredValue().calculateRiskFactor(),3) ) / 208;
		
		if(getInsuredValue().calculateRiskFactor() > 50 && rankOfInsurance < 3) {
			// DENIED VALUE ASSIGNED
			System.out.println("Inside If DENIED");
			policyCharge = Math.pow(10, 9);
			
			return policyCharge;
		}
		
		return policyCharge;
	}
	
	@Override
	public String toString() {
		return "The policy charge of " + getInsuredValue().insuranceNumber + ": " + this.calculatePolicyCharge() + " TL";
	}
	
}
