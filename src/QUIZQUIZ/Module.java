package QUIZQUIZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Module {
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<>();
		
		System.out.print("명령어 입력해주세요 : ");
		String choice = sc.next();
		boolean bool = true;
		int cnt = -1;
		
		while(bool) {
			switch(choice) {
			case "count" : 
				System.out.print("학생 수를 입력해주세요 : ");
				cnt = sc.nextInt();
			break;
			
			case "insert" :
				if (cnt == -1) {
					System.out.println("먼저 학생 수를 입력해주세요.");
					break;
				}
				
				for(int i = 0; i < cnt; i++) {
				Student member = new Student();
				System.out.print("이름 입력: ");
				member.setName(sc.next());
				
				System.out.print("주소 입력: ");
				member.setAddr(sc.next());
				
				System.out.print("아이디 입력: ");
				member.setId(sc.next());
				
				System.out.print("비밀번호 입력: ");
				member.setPw(sc.next());
				
				System.out.print("국어 입력: ");
				member.setKor(sc.nextInt());
				
				System.out.print("영어 입력: ");
				member.setEng(sc.nextInt());
				
				System.out.print("수학 입력: ");
				member.setMath(sc.nextInt());
				
				arr.add(member);
				
				}
				cnt = -1;
			case "print" :
				if(arr == null) {
					System.out.println("입력된 학생정보가 없습니다.");
				}
				System.out.println(arr);
				break;
			case "search" :
				System.out.println("찾을 아이디를 입력해주세요 : ");
				if(arr.equals(sc.next()));
				
			}
		}
		
		
		
		
		
			
		
		
	}
	
	
}
