package classes;

public class Housing extends Premises{
	
	private String residentSituation;
	
	public Housing(String insuranceNumber, int yearOfInsurance, String premisesCity, int numberOfFloors,
			int yearOfConstruction, String typeOfConstruction, int surfaceArea,String residentSituation)
	{
		super(insuranceNumber, yearOfInsurance, premisesCity, numberOfFloors, yearOfConstruction, typeOfConstruction,
				surfaceArea);
		this.setResidentSituation(residentSituation);
		
	}
	/**Getters and setters.
	 */

	public String getResidentSituation() {
		return residentSituation;
	}

	public void setResidentSituation(String residentSituation) {
		this.residentSituation = residentSituation;
	}
	
	@Override
	public double calculateRiskFactor()
	{   double riskFactor;double cityRiskFactor;double constructionTypeRiskFactor;
	    double floorRiskFactor=1;double constructionYearRiskFactor=1;double residentRiskFactor=1;
	
	    PREMISES_CITIES city=PREMISES_CITIES.valueOf(this.getPremisesCity());
	    CONSTRUCTION_TYPE construction_type=CONSTRUCTION_TYPE.valueOf(this.getTypeOfConstruction());
	    cityRiskFactor=city.getRiskFactorValue();
	    constructionTypeRiskFactor=construction_type.getRiskFactorValue();
	   
	    if(1<=this.getNumberOfFloors() && 3>=this.getNumberOfFloors()){floorRiskFactor=0.1;}
	    else if(4<=this.getNumberOfFloors() && 7>=this.getNumberOfFloors()){floorRiskFactor=0.25;}
	    else if (8<=this.getNumberOfFloors() && 18>=this.getNumberOfFloors()){floorRiskFactor=0.5;}
	    else if(18<this.getNumberOfFloors()){floorRiskFactor=0.85;}
	    
	    if(this.getYearOfConstruction()<1975) {constructionYearRiskFactor=0.58;}
	    else if(this.getYearOfConstruction()>=1975 && this.getYearOfConstruction()<=1999) {constructionYearRiskFactor=0.32;}
	    else if(this.getYearOfConstruction()>1999) {constructionYearRiskFactor=0.1;}
	    
	    if(this.getResidentSituation().equals("Tenant")) {residentRiskFactor=0.18;}
	    else if(this.getResidentSituation().equals("Landlord")) {residentRiskFactor=0.42;}
	    
	    
	    riskFactor=((cityRiskFactor)*(floorRiskFactor)*(constructionYearRiskFactor)*(constructionTypeRiskFactor)*(this.getSurfaceArea()))/(residentRiskFactor);
        
		return riskFactor;
		
	}
	
	@Override
	public String toString() {
		return "Insured Value: Housing, Insurance Number: " + super.insuranceNumber
				+ ", Year Of Insurance: " + super.yearOfInsurance  + "Risk Factor : " + this.calculateRiskFactor();
	}
}
