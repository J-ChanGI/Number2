package Day14_Studen_pkg;

import java.util.*;

public class BankManin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankClass bnk = new BankClass();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String str = "";
		int num = 0 ;
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1.고객등록(getter / setter) | 2. 고객등록 (생성자) | 3. 입금액 | 4. 출금 | 5. 고객관리 | 6 종료");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("선택> ");
		
		
		
		bnk.setClientNumber(num);
		bnk.setName(str);
		
		
		while(run) {
			int select = sc.nextInt();
			switch(select) {
			
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
				
				
				
				
		  }
		}
		bnk.setClientNumber(0);
		
		List<BankClass> list = new ArrayList<BankClass>();
		
		
	}

}
