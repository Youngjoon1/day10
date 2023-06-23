package dto;

import java.util.Scanner;

public class LoginService03 {
	LoginDTO03 login;
	public LoginService03() {
		login = new LoginDTO03();
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		String inputId, inputPwd;
		int num;
		while(true ) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.탈퇴");
			System.out.println("4.종료");
			num = input.nextInt();
			switch( num ) {
			case  1:
				//if( login.getId() == null ) {
				if( idCheck() == 0 ) {
					System.out.println("회원가입 먼저하세요!!");
					break;
				}
				
				/*
				System.out.println("인증 id 입력");
				inputId = input.next();
				System.out.println("인증 pwd 입력");
				inputPwd = input.next();
				*/
				String [] result = inputData("인증 id 입력", "인증 pwd 입력");
				int re = loginCheck(result);
				
				if( re == 0 ) {
					System.out.println("인증 통과!!");
				}else if(re == 1){
					System.out.println("!비밀번호가 틀렸습니다!");
				}else {
					System.out.println("존재하지 않는 아이디입니다!!");
				}
				/*
				if( result[0].equals( login.getId() ) ) {
					if(result[1].equals( login.getPwd() ) ) {
						System.out.println("인증 통과!!");
					}else {
						System.out.println("!비밀번호가 틀렸습니다!");
					}
				}else {
					System.out.println("존재하지 않는 아이디입니다!!");
				}
				*/
				break;
			case  2:
				//if( login.getId() == null ) {
				if( idCheck() == 0 ) {
					/*
					System.out.println("저장 아이디 입력");
					inputId = input.next();
					System.out.println("저장 비밀번호 입력");
					inputPwd = input.next();
					*/
					String [] result1 = 
							inputData("저장 아이디 입력", "저장 비밀번호 입력");
					login.setId(result1[0]);
					login.setPwd(result1[1]);
					System.out.println("등록 성공!!!");
				}else {
					System.out.println("사용자가 존재합니다!!! 탈퇴진행..");
				}
				break;
			case  3:
				//if(login.getId() == null) {
				if( idCheck() == 0 ) {
					System.out.println("회원가입 먼저하세요");
				}else {
					login.setId( null );
					login.setPwd( null );
					System.out.println("탈퇴 성공!!!");
				}
				break;
			case  4:return ;
			}
		}
	}
	public int idCheck() {
		if( login.getId() == null ) {
			return 0;
		}
		return 1;
	}
	public String[] inputData(String idMsg, String pwdMsg) {
		Scanner input = new Scanner(System.in);
		String inputId, inputPwd;
		System.out.println( idMsg );
		inputId = input.next();
		System.out.println( pwdMsg );
		inputPwd = input.next();
		
		//return new String[] {inputId, inputPwd}
		String [] result = {inputId, inputPwd};
		return result;
	}
	public int loginCheck(String[] result) {
		if( result[0].equals( login.getId() ) ) {
			if(result[1].equals( login.getPwd() ) ) {
				return 0;
				//System.out.println("인증 통과!!");
			}else {
				return 1;
				//System.out.println("!비밀번호가 틀렸습니다!");
			}
		}else {
			return -1;
			//System.out.println("존재하지 않는 아이디입니다!!");
		}
	}
}















