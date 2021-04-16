package Day14_Studen_pkg;

import java.util.*;
// * 의 의미는 모든것 이라는 의미 


public class PeopleMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		
		people.setName("수정");
		people.setrNumber("002157-4547845");
		people.setAddress("인천터미널");
		people.setAge(30);
		
		People people2 = new People("수정후","010-4567-1234", "부평사거리",24);
		
		List<People> list = new  ArrayList<People>();
		list.add(people);
		list.add(people2);
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getrNumber());
		System.out.println(list.get(0).getAddress());
		System.out.println(list.get(0).getAge());
		System.out.println(list.get(1).getName());
		System.out.println(list.get(1).getrNumber());
		System.out.println(list.get(1).getAddress());
		System.out.println(list.get(1).getAge());
		
		System.out.println("------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(0).getName());
			System.out.println(list.get(0).getrNumber());
			System.out.println(list.get(0).getAddress());
			System.out.println(list.get(0).getAge());
		}
		System.out.println("------------------------------");
		
			System.out.println(list.get(0));
		System.out.println("------------------------------");	
		System.out.println(list.get(0).toString());	


		//PeopleService 클래스 객체 선언
		PeopleService ps = new PeopleService();
		System.out.println("호출 호출 전");
		ps.listPrint(list);
		System.out.println("호출 호출 후");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		ps.listPrint(list);		
}		
		
}
