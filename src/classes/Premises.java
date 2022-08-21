package classes;

public abstract class Premises extends InsuredValue {
	
	private String premisesCity;
	private int numberOfFloors;
	private int yearOfConstruction;
	private String typeOfConstruction;
	private int surfaceArea;
    
    enum PREMISES_CITIES{Izmir(0.4),Istanbul(0.6),Ankara(0.15),Other(0.25);
    private final double riskFactorValue;

	PREMISES_CITIES(double riskFactorValue) {
		this.riskFactorValue=riskFactorValue;
	}

	public double getRiskFactorValue() {
		return riskFactorValue;
	}
    }
    
    enum CONSTRUCTION_TYPE{Steel(0.1),Concrete(0.37),Wood(0.58),Other(0.98);
    private final double riskFactorValue;
    CONSTRUCTION_TYPE(double riskFactorValue) {
		this.riskFactorValue=riskFactorValue;
    }
	public double getRiskFactorValue() {
		return riskFactorValue;
	}
    }

	
	
	public Premises(String insuranceNumber,int yearOfInsurance,String premisesCity,int numberOfFloors,int yearOfConstruction,String typeOfConstruction,int surfaceArea)
	{
		super(insuranceNumber,yearOfInsurance);
		this.setPremisesCity(premisesCity);
		this.setNumberOfFloors(numberOfFloors);
		this.setYearOfConstruction(yearOfConstruction);
		this.setTypeOfConstruction(typeOfConstruction);
		this.setSurfaceArea(surfaceArea);

	}
	
	
	public abstract double calculateRiskFactor();

	/**Getters and setters.
     */

	public String getPremisesCity() {
		return premisesCity;
	}



	public void setPremisesCity(String premisesCity) {
		this.premisesCity = premisesCity;
	}



	public int getNumberOfFloors() {
		return numberOfFloors;
	}



	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}



	public int getYearOfConstruction() {
		return yearOfConstruction;
	}



	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}



	public String getTypeOfConstruction() {
		return typeOfConstruction;
	}



	public void setTypeOfConstruction(String typeOfConstruction) {
		this.typeOfConstruction = typeOfConstruction;
	}



	public int getSurfaceArea() {
		return surfaceArea;
	}



	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}


	@Override
	public String toString() {
		return "Insured Value: Premises, Insurance Number: " + super.insuranceNumber
				+ ", Year Of Insurance: " + super.yearOfInsurance;
	}
}
