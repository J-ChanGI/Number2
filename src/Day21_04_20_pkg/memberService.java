package Day21_04_20_pkg;

import java.util.*;

public class memberService {
	Scanner sc =new Scanner(System.in);
	
	void login (List <member> memberlist){
		System.out.println("아이디 확인 :");
		String id =sc.next();
		System.out.println("비밀번호 확인 : ");
		String passward = sc.next();

		for(int i=0; i<memberlist.size(); i++) {
			if(id.equals(memberlist.get(i).getId())&&
					passward.equals(memberlist.get(i).getPassward()) ) {
				System.out.println(id + "님 환영합니다");
			
			}else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
			
		}
		
	}


	
	List<member> reNumber (List <member> memberlist){
		System.out.println("아이디 확인 :");
		String id =sc.next();
		System.out.println("비밀번호 확인 : ");
		String passward = sc.next();

		for(int i=0; i<memberlist.size(); i++) {
			if(id.equals(memberlist.get(i).getId())&&
					passward.equals(memberlist.get(i).getPassward()) ) {
				System.out.println("기존 전화번호 : " + memberlist.get(i).getaNumber());
				System.out.println("전화번호 변경 : ");
				String aNumber = sc.next();
				memberlist.get(i).setaNumber(aNumber);
				System.out.println("변경된 전화번호 : " + aNumber);
			}
		}	return memberlist;
	}
	
	void memberlist(List <member> memberlist) {
		for(int i=0; i<memberlist.size(); i++) {
			System.out.println(memberlist.get(i).toString());	
	}
	}

}
	