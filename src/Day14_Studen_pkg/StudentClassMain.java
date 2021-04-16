package Day14_Studen_pkg;

import java.util.*;

public class StudentClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass stu = new StudentClass();
		
		// setter 를 이용하여 필드값 지정
		//private으로 지정 했기 때문에 접근 불가
//		stu.name("수정");
		stu.setName("수정");
//		stu.phone = "666-6666";
		stu.setPhone("666-6666");
//		stu.address = "인천 미추홀구";
		stu.setAddress("인천미추홀구");		
		
		//getter를 이용하여 필드값 가져오기
		System.out.println(stu.getName());
		
		StudentClass stu1 = new StudentClass("수정2","777-6666","인천광역시"); 
		
		
		
		//Student 객체를 ArrayList에 저장하기
		//Student 객체를 담을 수 있는 ArrayList 필요
		List<StudentClass> list = new ArrayList<StudentClass>();
			//담고자 하는 클래스를 넣어서 사용가능
		list.add(stu);
		list.add(stu1);
		// list의 0번 인덱스에 저장한 stu 의 name값 출력해보기
		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).name());
		System.out.println(list.get(1).getName());
//		System.out.println(list.get(1).name());
		
		System.out.println(list.get(0).getAddress());
//		System.out.println(list.get(0).Address());
		System.out.println(list.get(1).getAddress());
//		System.out.println(list.get(1).Address());
	}

}
