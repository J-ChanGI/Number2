package Day14_Studen_pkg;

import java.util.*;
// Service 클래스 : 처리를 담당하는 클래스 (비즈니스클래스. 라고도 한다.)
public class BankServiceClass {
	Scanner sc = new Scanner(System.in);
	/*
	 * 매개변수 list
	 * 리턴 : list  왜 ? mainclass 가 가장 최신의 데이터를 가져야 하기 때문
	 */
//	밑 타입은 List<BankClass> list = new ArrayList<BankClass>(); 중 앞에 부분 을 가져온다.
	List<BankClass> add (List<BankClass> list){
	// 			  메소드 이름 | 매개변수 = list 의 타입 및 변수이름
		System.out.print("계좌번호 : ");
		String str1 = sc.next();
		System.out.println("입금액 : ");
		int add = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
		if(str1.equals(list.get(i).getAccountNumber() ) ) {
		int	num1 = list.get(i).getBalance() + add;
			list.get(i).setBalance(num1);
		}else {
			System.out.println("없는 계좌 입니다.");
		}
	}	
		return list;
	}

	
	List<BankClass> mul (List<BankClass> list){
		System.out.print("계좌번호 : ");
		String str1 = sc.next();
		System.out.println("출금액 : ");
		int mul = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(str1.equals(list.get(i).getAccountNumber() ) ) {
//				list.get(i).setBalance(list.get(i).getBalance()+add);
			if(mul <= list.get(i).getBalance()) {
			 int num1 = list.get(i).getBalance() - mul;
				list.get(i).setBalance(num1);

			}else {
				System.out.println("잔고가 부족합니다.");
			}
			}
		}
			return list;
	}
	}
	
