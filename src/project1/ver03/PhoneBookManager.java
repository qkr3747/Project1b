package project1.ver03;

import java.util.Scanner;


public class PhoneBookManager {
	
	private PhoneInfo[] myInfos;
	private int numOfInfos;
	Scanner scan = new Scanner(System.in);
 
	public PhoneBookManager(int num) {
 		myInfos = new PhoneInfo[num];
		numOfInfos = 0;
	}
	
	public void dataInput(int choice) {		
	 
		
		String iName,iPhone,iDay;

		System.out.print("이름:");iName = scan.nextLine();
		System.out.print("전화번호:");iPhone = scan.nextLine();
		System.out.print("생년월일:");iDay = scan.nextLine();
		
		if(choice==1) {	
						 
			PhoneInfo info =
					new PhoneInfo(iName, iPhone, iDay);
			myInfos[numOfInfos++] = info;
		}
		
		System.out.printf("데이터 입력이 완료되었습니다.");
		System.out.println();
		System.out.println();
	} 
		
	
	public void dataAllShow() {
		for(int i=0 ; i<numOfInfos ; i++) {
			myInfos[i].dataAllShow();
		}

		System.out.println("전체정보가 출력되었습니다");
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