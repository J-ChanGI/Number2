package Day14_Studen_pkg;

import java.util.*;

public class BankManin {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);

				String str = ""; // 이름
				String str1 = ""; // 계좌
				int num=0; // 고객번호
				int num1 =0; //잔고
				int select = 0; // 선택 

				List<BankClass> list = new ArrayList<BankClass>();
				BankServiceClass bs = new BankServiceClass();//1개만 있으면 된다. 
				boolean run = true;
				while(run) {

					System.out.println("---------------------------------------------------------------------------");
					System.out.println("1. 고객등록(get,set)| 2. 고객등록(생성자) | 3. 입금 | 4. 출금 | 5. 고객리스트  | 6. 종료 ");
					System.out.println("---------------------------------------------------------------------------");
					System.out.print("선택> ");
					select = sc.nextInt();

					switch(select){

					case 1 :
						BankClass bank = new BankClass();
						int clientNumber = list.size()+1;
						System.out.print("이름 : ");
						str = sc.next();
						System.out.print("계좌번호 : ");
						str1 = sc.next();
						System.out.print("입금액 : ");
						num1 = sc.nextInt();
						bank.setName(str); // 고객이름
						bank.setAccountNumber(str1); //계좌번호
						bank.setClientNumber(clientNumber); // 고객번호
						bank.setBalance(num1); // 잔고	

						list.add(bank);

						break;

					case 2 :
						bank = new BankClass(num, str,str1,num1);

						System.out.print("이름 : ");
						str = sc.next();
						System.out.print("계좌번호 : ");
						str1 = sc.next();
						System.out.print("입금액 : ");
						num1 = sc.nextInt();

						bank.setName(str); // 고객이름
						bank.setAccountNumber(str1); //계좌번호
						bank.setClientNumber(num); // 고객번호
						bank.setBalance(num1); // 잔고		

						list.add(bank);

						break;

					case 3 :
						// 입금할 계좌번호와 입금금액을 입력받고 입력받은 계좌번호와 동일한 계좌번호가
						// ArrayList에서 어디에 위치해 있는지 찾아야함.
						// String 이 같은지 비교할 때는 ==  쓰지 않고 ,.equals()를 사용함
						//변수값 . 메소드 이름 (list) 치면 서비스 메소드 호출 되면서 나와야함
//						System.out.print("계좌번호 : ");
//						str1 = sc.next();
//						System.out.println("입금액 : ");
//						int add = sc.nextInt();
//						for(int i=0; i<list.size(); i++) {
//							if(str1.equals(list.get(i).getAccountNumber() ) ) {
//						list.get(i).setBalance(list.get(i).getBalance()+add);
//							num1 = list.get(i).getBalance() + add;
//							list.get(i).setBalance(num1);
//							}
//						}
						
					     list = bs.add(list);
						
						
						// 리턴이 있는 메소드 호출 방식 - 리턴 결과를 받아주는 대상(좌이 있어야한다. 
						// 리턴이 없는 메소드 호출 방식
						break;

					case 4 :
						System.out.print("계좌번호 : ");
						str1 = sc.next();
						System.out.println("출금액 : ");
						int mul = sc.nextInt();
						for(int i=0; i<list.size(); i++) {
							if(str1.equals(list.get(i).getAccountNumber() ) ) {
//								list.get(i).setBalance(list.get(i).getBalance()+add);
							if(mul <= list.get(i).getBalance()) {
								num1 = list.get(i).getBalance() - mul;
								list.get(i).setBalance(num1);

							}else {
								System.out.println("잔고가 부족합니다.");
							}
							}


						}
						break;

					case 5 :
						for(int i=0; i<list.size(); i++) {
							System.out.println(list.get(i).toString());
						}

						break;

					case 6 :
						System.out.println("종료");
						run = false;
						break;

					}

				}


			}

		}