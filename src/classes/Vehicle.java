package classes;

public abstract class Vehicle extends InsuredValue {
	
	private String plateCity;
	private double engineVolume;
	private int yearOfProduction;
	private String typeOfGear;
	private int fuelTankVolume;
	
    enum PLATE_CITIES{Izmir(0.78),Istanbul(0.97),Ankara(0.85),Other(0.65);
    private final double riskFactorValue;

	PLATE_CITIES(double riskFactorValue) {
		this.riskFactorValue=riskFactorValue;
	}

	public double getRiskFactorValue() {
		return riskFactorValue;
	}
    }
	

	public Vehicle(String insuranceNumber, int yearOfInsurance,String plateCity,double engineVolume,int yearOfProduction,
			String typeOfGear,int fuelTankVolume) {
		super(insuranceNumber, yearOfInsurance);
		this.setPlateCity(plateCity);
		this.setEngineVolume(engineVolume);
		this.setYearOfProduction(yearOfProduction);
		this.setTypeOfGear(typeOfGear);
		this.setFuelTankVolume(fuelTankVolume);
	}
	
	public abstract double calculateRiskFactor();
	
    /**Getters and setters.
     */

	public String getPlateCity() {
		return plateCity;
	}


	public void setPlateCity(String plateCity) {
		this.plateCity = plateCity;
	}


	public double getEngineVolume() {
		return engineVolume;
	}


	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}


	public int getYearOfProduction() {
		return yearOfProduction;
	}


	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}


	public String getTypeOfGear() {
		return typeOfGear;
	}


	public void setTypeOfGear(String typeOfGear) {
		this.typeOfGear = typeOfGear;
	}


	public int getFuelTankVolume() {
		return fuelTankVolume;
	}


	public void setFuelTankVolume(int fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
	
	@Override
	public String toString() {
		return "Insured Value: Vehicle, Insurance Number: " + super.insuranceNumber
				+ ", Year Of Insurance: " + super.yearOfInsurance;
	}
	

}
