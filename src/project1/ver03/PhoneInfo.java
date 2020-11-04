package project1.ver03;

public class PhoneInfo {

	String name;  
	String phoneNumber; 
	String birthday;  
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public void dataAllShow() {
		System.out.println("name:"+ name);
		System.out.println("phone:"+ phoneNumber);
		System.out.println("birth:"+ birthday);
	}
	public void showBasicInfo() { }
}
 

class HighInfo extends PhoneInfo {
	
	public HighInfo(String name, String phoneNumber, String birthday) {
		super(name, phoneNumber, birthday);
		
	}

	@Override
	public void dataAllShow() {
		System.out.println();
		super.dataAllShow();

	}
 
}
