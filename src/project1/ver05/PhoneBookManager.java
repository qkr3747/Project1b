package project1.ver05;

import java.util.Scanner;

public class PhoneBookManager {
	
	private PhoneInfo[] myInfos;
	private int numOfInfos;
	
 
	public PhoneBookManager(int num) {
 		myInfos = new PhoneInfo[num];
		numOfInfos = 0;
	}
	
	public void dataInput() {		
		
		String iName,iPhone,major,companyId;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1.일반, 2.동창, 3.회사");
		System.out.print("선택>>");
		
		int choice = scan.nextInt();
		
		
		System.out.print("이름:"); iName = scan.nextLine();
		System.out.print("전화번호:"); iPhone = scan.nextLine();
		
		if(choice==1) {	
						 
			AddInfo add =
					new AddInfo(iName, iPhone);
			myInfos[numOfInfos++] = add;
		}
		else if(choice==2) {
			
			System.out.print("전공:"); major = scan.nextLine();
			
			PhoneSchoolInfo school = 
					new PhoneSchoolInfo(iName, iPhone, major);
			
			myInfos[numOfInfos++] = school;
		}
		else if(choice==3) {
			
			System.out.print("회사:"); companyId = scan.nextLine();
			
			PhoneCompanyInfo company =
					new PhoneCompanyInfo(iName, iPhone, companyId);
			
			myInfos[numOfInfos++] = company;
		}
		System.out.println("데이터 입력이 완료되었습니다.");
		System.out.println();
	} 
		
	
	public void dataAllShow() {
		for(int i=0 ; i<numOfInfos ; i++) {
			myInfos[i].dataAllShow();
		}

		System.out.println("전체정보가 출력되었습니다.");
	}
	
	public void dataSearch() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 검색을 시작합니다:");
		System.out.print("이름:");
		String searchName = scan.nextLine();

		
		for(int i=0 ; i<numOfInfos ; i++) {			
			
			if(searchName.compareTo(myInfos[i].name)==0) {
				myInfos[i].dataAllShow();
				System.out.println("데이터 검색이 완료되었습니다.");
				System.out.println();
				isFind = true;
			}
		}
		
		if(isFind==false)
			System.out.println("찾는 정보가 없습니다.");
		
	}
	
	public void dataDelete() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("데이터 삭제를 시작합니다..%n이름:");
		String deleteName = scan.nextLine();
		
		
		int deleteIndex = -1;

		for(int i=0 ; i<numOfInfos ; i++) {
			if(deleteName.compareTo(myInfos[i].name)==0) {
				myInfos[i] = null;
				deleteIndex = i;
				numOfInfos--;
			}
		}

		if(deleteIndex==-1) {
			
			System.out.println("삭제된 데이터가 없습니다");
			System.out.println();
		}
		else {
			
			for(int i=deleteIndex ; i<numOfInfos ; i++) {
				myInfos[i] = myInfos[i+1];
			}
			System.out.print("데이터 삭제가 완료되었습니다.");
			System.out.println();
		}
	}
	
}