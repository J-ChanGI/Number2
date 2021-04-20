package Day21_04_20_pkg;

import java.util.*;

public class memberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); 
		List <member> memberlist = new ArrayList<member>(); // 리스트 선언
		memberService login = new memberService(); // 서비스 클래스 선언
		String id = "";
		String passward = "";
		String name = "";
		String aNumber = "";
		int Seclect = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("선택 > ");
			Seclect = sc.nextInt();
			switch(Seclect) {
			
			case 1 : // 회원가입
				member member = new member();
				
				System.out.println("아이디 : ");
				id = sc.next();
				System.out.println("비밀번호 : ");
				passward = sc.next();
				System.out.println("이름 : ");
				name = sc.next();
				System.out.println("전화번호 : ");
				aNumber = sc.next();
				
				member.setId(id);
				member.setPassward(passward);
				member.setName(name);
				member.setaNumber(aNumber);
				memberlist.add(member);
				
				break;
			case 2 :
				login.memberlist(memberlist); 	// 전체 회원조회
			// 서비스 클래스 이름 , 가져올 메소드 이름, 출력할 리스트 
				break;
				
			case 3 :
				
				 login.login(memberlist);	// 로그인 
				
				break;
				
			case 4 :
				memberlist = login.reNumber(memberlist); // 전화번호 변경
				
				break;
				
			case 5 :
				System.out.println("종료");
				run = false ;
				
			}
			
			
		}
		
	}

}
