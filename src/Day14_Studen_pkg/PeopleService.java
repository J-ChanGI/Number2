package Day14_Studen_pkg;

import java.util.ArrayList;
import java.util.List;

public class PeopleService {
	// ArrayList를 받아와서 출력하는 메소드 선언
	// 
	void listPrint(List<People> list) {
					// 리스트 타입을 가져온다. 
		// 위 타입은  Main의 List<People> list = new  ArrayList<People>();
		// 중  List<People> list  이다.
		System.out.println("호출 호출 !");
		System.out.println(list.get(0));
		
		list.get(1).setName("ps에서 변경");
		System.out.println(list.get(1));
	}
}
