package classes;

public class Workplace extends Premises {
	private int annualRevenue;
	

	public Workplace(String insuranceNumber,int yearOfInsurance,String premisesCity,int numberOfFloors,int yearOfConstruction,String typeOfConstruction,int SurfaceArea,int annualRevenue)
	{
		super(insuranceNumber,yearOfInsurance,premisesCity,numberOfFloors,yearOfConstruction,typeOfConstruction,SurfaceArea);
		this.annualRevenue=annualRevenue;
	}
	
	@Override
	public double calculateRiskFactor()
	{
		double riskFactor;double cityRiskFactor;double constructionTypeRiskFactor;
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
	    
        riskFactor=((cityRiskFactor)*(floorRiskFactor)*(constructionYearRiskFactor)*(constructionTypeRiskFactor)*(this.getSurfaceArea()*0.2))*(this.annualRevenue*0.003);
       
		return riskFactor;
	    
	    
	}
	@Override
	public String toString() {
		return "Insured Value: Workplace, Insurance Number: " + super.insuranceNumber
				+ ", Year Of Insurance: " + super.yearOfInsurance  + "Risk Factor : " + this.calculateRiskFactor();
	}
	
	
	
	
	

}
