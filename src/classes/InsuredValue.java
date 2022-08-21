package classes;

public abstract class InsuredValue {
	public String insuranceNumber;
	public int yearOfInsurance;
	
	
	public InsuredValue(String insuranceNumber,int yearOfInsurance)
	{
		this.insuranceNumber=insuranceNumber;
		this.yearOfInsurance=yearOfInsurance;
	}
	
	public abstract double calculateRiskFactor();

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public int getYearOfInsurance() {
		return yearOfInsurance;
	}

	public void setYearOfInsurance(int yearOfInsurance) {
		this.yearOfInsurance = yearOfInsurance;
	}

	@Override
	public String toString() {
		return "Insured Value: InsuredValue, Insurance Number: " + this.insuranceNumber + ", Year Of Insurance: " + this.yearOfInsurance;
	}
}
