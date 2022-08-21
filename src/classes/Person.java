package classes;

public class Person extends InsuredValue {
	
	private String residenceCity;
	private String name;
	private long nationalID;
	private String gender;
	private int yearOfBirth;
	private String typeOfChronicleIlness;
	
    enum CHRONICLE_ILNESSES{Cardiovascular(1.85),Diabetes(1.84),Respiratory(1.86),Other(1.8),None(0.1);
    private final double riskFactorValue;

	CHRONICLE_ILNESSES(double riskFactorValue) {
		this.riskFactorValue=riskFactorValue;
	}

	public double getRiskFactorValue() {
		return riskFactorValue;
	}
    }
	
	
	public Person(String insuranceNumber,int yearOfInsurance,String residenceCity,String name,long nationalID,String gender,
			int yearOfBirth,String typeOfChronicleIlness)
	{
		super(insuranceNumber,yearOfInsurance);
		this.setResidenceCity(residenceCity);
		this.setName(name);
		this.setNationalID(nationalID);
		this.setGender(gender);
		this.setYearOfBirth(yearOfBirth);
		this.setTypeOfChronicleIlness(typeOfChronicleIlness);
		
	}
	
	@Override
	public double calculateRiskFactor()
	{  double ilnessRiskFactor;double riskFactor;int age;
       CHRONICLE_ILNESSES ilness=CHRONICLE_ILNESSES.valueOf(this.getTypeOfChronicleIlness());
       ilnessRiskFactor=ilness.getRiskFactorValue();
       age=2020-this.getYearOfBirth(); //check again
       
       riskFactor=(Math.pow(age, 2))/(ilnessRiskFactor*18);
     
	   return riskFactor;
		
	}
	
	/**Getters and setters.
	 */

	public String getResidenceCity() {
		return residenceCity;
	}

	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNationalID() {
		return nationalID;
	}

	public void setNationalID(long nationalID) {
		this.nationalID = nationalID;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getTypeOfChronicleIlness() {
		return typeOfChronicleIlness;
	}

	public void setTypeOfChronicleIlness(String typeOfChronicleIlness) {
		this.typeOfChronicleIlness = typeOfChronicleIlness;
	}
	@Override
	public String toString() {
		return "Insured Value: Person, Insurance Number: " + super.insuranceNumber
				+ ", Year Of Insurance: " + super.yearOfInsurance  + "Risk Factor : " + this.calculateRiskFactor();
	}
}
