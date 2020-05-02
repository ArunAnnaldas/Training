
public class Address {
	
	String addLineOne;
	String addLineTwo;
	String pinCode;
	String city;
	String state;
	
	Address(){
		this.addLineOne="";
		this.addLineTwo="";
		this.pinCode="";
		this.city="";
		this.state="";
	}
	
	Address(String addLineOne,String addLineTwo,String pinCode,String city,String state){
		this.addLineOne=addLineOne;
		this.addLineTwo=addLineTwo;
		this.pinCode=pinCode;
		this.city=city;
		this.state=state;
	}
	
	@Override
	public String toString() {
		return this.addLineOne + ";" + this.addLineTwo + ";" + this.pinCode + ";" + this.city + ";" +this.state;
	}

}
