package project1;

import java.util.Scanner;

import project1.ver02.PhoneInfo;

public class PhoneBookVer02 {

	public static void menuShow() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.프로그램종료");
		System.out.print("선택:");
	}

	
	public static void main(String[] args) {
		
		
		PhoneInfo info =
				new PhoneInfo();
		

		menuShow();
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
	
		if(choice==1) {
			info.addInfo();
		}
		else {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
	}
}

