package classes;

public class Truck extends Vehicle {
	
	private String typeOfTruckBed;
	
	enum TRUCK_BED_TYPES{Trailer(0.87),Tanker(0.84),Regular(0.15);
	    private final double riskFactorValue;

		TRUCK_BED_TYPES(double riskFactorValue) {
			this.riskFactorValue=riskFactorValue;
		}

		public double getRiskFactorValue() {
			return riskFactorValue;
		}
	    }

	public Truck(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume,
			int yearOfProduction, String typeOfGear, int fuelTankVolume,String typeOfTruckBed) {
		super(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
		this.typeOfTruckBed=typeOfTruckBed;
	}
	
	@Override
	public double calculateRiskFactor()
	{double age;double plateCityRiskFactor;double truckBedRiskFactor;
	double riskFactor;
		
	 age=2020-this.getYearOfProduction();//check
	 PLATE_CITIES city=PLATE_CITIES.valueOf(this.getPlateCity());
     plateCityRiskFactor=city.getRiskFactorValue();
     TRUCK_BED_TYPES truckBed=TRUCK_BED_TYPES.valueOf(this.typeOfTruckBed);
     truckBedRiskFactor=truckBed.getRiskFactorValue();
     
     riskFactor=((Math.pow(age, 3)/(0.008*this.getFuelTankVolume()))*this.getEngineVolume()*(plateCityRiskFactor*0.03))/((Math.pow(truckBedRiskFactor,2)));
     
     return riskFactor;
     
		
	}
	@Override
	public String toString() {
		return "Insured Value: Truck, Insurance Number: " + super.insuranceNumber
				+ ", Year Of Insurance: " + super.yearOfInsurance   + "Risk Factor : " + this.calculateRiskFactor(); 
	}

}
