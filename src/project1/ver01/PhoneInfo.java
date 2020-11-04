package project1.ver01;

public class PhoneInfo {
	
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+ phoneNumber);
		System.out.println("생년월일:"+ birthday);
	}

}
