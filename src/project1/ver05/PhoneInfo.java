package project1.ver05;

class PhoneInfo {

	String name;  
	String phoneNumber;  
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void dataAllShow() {
		System.out.println("name:"+ name);
		System.out.println("phone:"+ phoneNumber);

	}
	public void dataAllShow2() {
		System.out.println("name:"+ name);
		System.out.println("phone:"+ phoneNumber);
	}
}
 

class AddInfo extends PhoneInfo {
	
	public AddInfo(String name, String phoneNumber) {
		super(name, phoneNumber);
		
	}

	@Override
	public void dataAllShow() {
		System.out.println();
		super.dataAllShow();

	}
 
}
