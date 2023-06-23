package Quiz;

import java.util.Scanner;

public class Service01 {

	
	public void display() {
		Scanner sc = new Scanner(System.in);
		DTO01 member;
		member = new DTO01();
		int KOR, ENG, MATH, SUM;
		String NAME, GRADE;
		System.out.print("1. 학 생 등 록 ");
		System.out.print("2. 학 생 보 기 ");
		System.out.print("3. 정 보 수 정 ");
		System.out.print("4. 회 원 탈 퇴 ");
		System.out.println(">>>>>>>>>>>>>>");
		int number = sc.nextInt();
		
		while(true) {
			switch(number) {
			case 1 : 
				System.out.print("이름 입력: ");
				NAME = sc.next();
				member.setName(NAME);
				
				System.out.println("국어:");
				KOR= sc.nextInt();
				member.setKor(KOR);
				 
				System.out.println("영어:");
				ENG = sc.nextInt();
				member.setEng(ENG);
				
				System.out.println("수학:");
				MATH = sc.nextInt();
				member.setMath(MATH);
				
				SUM = KOR + ENG + MATH;
				System.out.println("총점은: " + SUM);
				member.setSum(SUM);
				
				if(SUM >= 270) {
					GRADE = "A";
				}else if(SUM >= 230 && SUM < 270) {
					GRADE = "B";
				}else {
					GRADE = "C";
				}
				member.setGrade(GRADE);
				break;
				
			case 2 :
				System.out.print("이름"+member.getName());
				System.out.print("국어"+member.getKor());
				System.out.print("영어"+member.getEng());
				System.out.print("수학"+member.getMath());
				System.out.print("총점"+member.getSum());
				System.out.print("등급"+member.getGrade());
				break;
			case 3 :
				System.out.println("수정선택");
				System.out.println("1.이름 2.국어 3.영어 4.수학");
				int number2 = sc.nextInt();
				switch(number2) {
				case 1 : 
					System.out.println("변경할 이름 : ");
					NAME = sc.next();
					member.setName(NAME);
					break;
				case 2 :
					System.out.println("변경할 국어 : ");
					KOR = sc.nextInt();
					member.setKor(KOR);
					break;
				case 3 :
					System.out.println("변경할 영어 : ");
					ENG = sc.nextInt();
					member.setKor(ENG);
					break;
				case 4 :
					System.out.println("변경할 수학 : ");
					MATH = sc.nextInt();
					member.setKor(MATH);
					break;
				}
				SUM = member.getKor() + member.getEng() + member.getMath(); 
				member.setSum(SUM);
				if(SUM >= 270) {
					GRADE = "A";
				}else if(SUM >= 230 && SUM < 270) {
					GRADE = "B";
				}else {
					GRADE = "C";
				}
				member.setGrade(GRADE);
				break;
				
			case 4 :
				member.setName(null);
				member.setEng(0);
				member.setKor(0);
				member.setMath(0);
				member.setGrade(null);
				member.setSum(0);
				System.out.println("탈퇴완료");
				
				
				default :
					System.out.println("잘못입력");
					return;
			}
		}
		
		
		
		
		
		
		
	}
}
