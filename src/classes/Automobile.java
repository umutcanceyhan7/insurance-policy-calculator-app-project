package classes;

public class Automobile extends Vehicle {
	
	private String typeOfRoof;
	
	enum ROOF_TYPES{Regular(0.1),Sunroof(0.64),Moonroof(0.15);
	    private final double riskFactorValue;

		ROOF_TYPES(double riskFactorValue) {
			this.riskFactorValue=riskFactorValue;
		}

		public double getRiskFactorValue() {
			return riskFactorValue;
		}
	    }

	public Automobile(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume,
			int yearOfProduction, String typeOfGear, int fuelTankVolume,String typeOfRoof) {
		super(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
		this.typeOfRoof=typeOfRoof;
		
	}
	
	@Override
	public double calculateRiskFactor()
	{double age;double plateCityRiskFactor;double roofTypeRiskFactor;
	 double riskFactor;
	
	 age=2020-this.getYearOfProduction();//check
	 PLATE_CITIES city=PLATE_CITIES.valueOf(this.getPlateCity());
     plateCityRiskFactor=city.getRiskFactorValue();
     ROOF_TYPES roofType=ROOF_TYPES.valueOf(this.typeOfRoof);
     roofTypeRiskFactor=roofType.getRiskFactorValue();
     
     riskFactor=(this.getEngineVolume()*(0.004*this.getFuelTankVolume())*age*(plateCityRiskFactor*0.03))/(roofTypeRiskFactor);
     
     return riskFactor;
     
	}
	@Override
	public String toString() {
		return "Insured Value: Automobile, Insurance Number: " + super.insuranceNumber
				+ ", Year Of Insurance: " + super.yearOfInsurance  + "Risk Factor : " + this.calculateRiskFactor();
	}

}
