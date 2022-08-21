package classes;

public abstract class Insurance {
	private InsuredValue insuredValue;
	
	public Insurance(InsuredValue insuredValue)
	{
	this.setInsuredValue(insuredValue);	
	}
	
	public abstract double calculatePolicyCharge();

	public InsuredValue getInsuredValue() {
		return this.insuredValue;
	}

	public void setInsuredValue(InsuredValue insuredValue) {
		this.insuredValue = insuredValue;
	}
}
