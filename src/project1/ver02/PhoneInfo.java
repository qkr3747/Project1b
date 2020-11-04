package project1.ver02;

import java.util.Scanner;

public class PhoneInfo {
	
	
	public void addInfo() {		
	 
		Scanner scan = new Scanner(System.in);
		String name,phoneNumber,birthday;

		System.out.print("이름:");name = scan.nextLine();
		System.out.print("전화번호:");phoneNumber = scan.nextLine();
		System.out.print("생년월일:");birthday = scan.nextLine();
		System.out.println();

		System.out.println("입력된 정보 출력");
		System.out.println("name:"+ name);
		System.out.println("phone:"+ phoneNumber);
		System.out.println("birth:"+birthday);
		System.out.println();
	} 

	
}