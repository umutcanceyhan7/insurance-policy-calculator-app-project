package classes;

import insurancePolicyCalculatorApp.InsurancePolicyCalculatorApp;

public class Traffic extends Insurance {
	
	public Traffic(InsuredValue insuredValue) {
		super(insuredValue);
	}

	@Override
	public double calculatePolicyCharge() {
		
		double fixedFee = InsurancePolicyCalculatorApp.fixedFee;
		
		double currentYear = InsurancePolicyCalculatorApp.currentYear;
		
		double rankOfInsurance = currentYear - getInsuredValue().getYearOfInsurance();
		
		double policyCharge = ( ( ( fixedFee * 90)/100 ) + (fixedFee * Math.pow(getInsuredValue().calculateRiskFactor(), (1/2))));
		if(rankOfInsurance > 1) {
			// %20 DISCOUNT APPLIED
			
			policyCharge = (policyCharge * 80)/100;
			System.out.println("Inside IF Traffic Policy Charge "+ policyCharge);
			return policyCharge;
		}
		System.out.println("Outside IF Traffic Policy Charge "+ policyCharge);
		return policyCharge;
	}
	@Override
	public String toString() {
		return "The policy charge of " + getInsuredValue().insuranceNumber + ": " + this.calculatePolicyCharge() + " TL";
	}
}
