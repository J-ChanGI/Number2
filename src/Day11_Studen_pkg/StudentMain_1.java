package Day11_Studen_pkg;

public class StudentMain_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Class_1 stu1 = new Student_Class_1();
		stu1.name = "학생1";
		stu1.stuNum = 12345;
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		// 매개변수가 있는 생성자를 이용한 객체선언
		Student_Class_1 stu2 = new Student_Class_1("학생2", 1111);
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
	
		
		System.out.println("메소드 호출전"); //1번
		//  fieldPrint .메소드 호출
		stu1.fieldPrint();
		
		
		System.out.println("메소드 호출 끝"); //3번 순으로 출력이 된다
		
		stu2.fieldPrint();
		
		Student_Class_1 stu3 = new Student_Class_1("학생3",12314);
		stu3.fieldPrint();
		
		System.out.println("리턴있는 메소드 호출");
		// 리턴이 있는 메소드를 호출 할 떄는 호출만하고 끝나는 것이 아니라 
		// 리턴 값을 활용하는 내용이 필요
		stu1.numberMethod();
		
		int number =0;
		System.out.println(number); // 메소드 호출전
		number = stu1.numberMethod();
		System.out.println(number); // 메소드 호출 후
		
		System.out.println("String 메소드 호출");
		System.out.println(stu3.stringMethod());
		
		String bb = stu3.stringMethod();
		System.out.println(bb);
		
		Student_Class_1 stu4 = new Student_Class_1(); 
			int cc = stu4.numberMethod2(30);
			System.out.println(cc);
			
			
			//40 
		
		
	}
	

}
