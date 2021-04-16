package Day11_Studen_pkg;

import java.util.*;

public class Ex01_ArrayList_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<String>();
		String str1 = "";
	
		for(int i=0; i<5; i++) {
			System.out.print("단어를 입력하세요 : ");
			str1 = sc.nextLine();
			list1.add(str1);  // 데이터 추가 하는 방법 
		//  list1.add(scan.next()) ; 로 대체가능 바로 스캐너를 넣을 수 있음
		}
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		int max=0; // 단어길이가 가장긴 데이터가 저장된 인덱스를 가져오기 위한 변수
		for(int i=1; i<list1.size(); i++) {
			if(list1.get(max).length() < list1.get(i).length()){ // 이 부분이 중요
				// list에서 0번 인덱스에 있는 값의 길이
				max = i;
			}
				
		}System.out.println("가장 긴 단어는 : " + list1.get(max));
		
				
	}
}
