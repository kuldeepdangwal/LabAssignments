
public class Medicine 
{
	String medName;
	double medPrice;
	String compName;
	String mg;
	
	public String dispMedInfo()
	{
		return "\nMedInfo: "+medName+"\nMedPrice :"+medPrice+"\nCompName :"+compName+"\nmg :"+mg;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public double getMedPrice() {
		return medPrice;
	}
	public void setMedPrice(double medPrice) {
		this.medPrice = medPrice;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	public String getmg() {
		return compName;
	}
	public void setmg(String mg) {
		this.mg = mg;
	}
	
	
	

}
