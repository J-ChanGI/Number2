package Day11_Studen_pkg;

public class Student_Class_1 {

	String name;
	int stuNum;
	// int 는 0을 받을 수 없기에 숫자 001234 일 경우 1234 만 출력이 된다.
	//기본생성자 선언
	Student_Class_1(){
		System.out.println("기본생성자 호출");
	}
	
	Student_Class_1(String name, int stuNum){
		System.out.println("매개변수있는 생성자");
		this.name = name;
		this.stuNum = stuNum;
	}
	// 메소드 선언
	// 리턴이 없는 메소드 선언
	/*
	 * void : 리턴이 없다는 의미
	 * 메소드 이름  fieldPrint 메소드 이름은 자유롭게 지을 수 있다
	 * 매게변수 : 없음
	 */
	void fieldPrint() { //2번
		System.out.println("매소드 호출");
		System.out.println(this.name);
		System.out.println(this.stuNum);
	}
	
	//리턴이 있는 메소드 선언
	/*
	 * int : 리턴되는 값이  int
	 * 메소드 이름 : numberMathod
	 * 매개변수 : 없음
	 */
	int numberMethod() { // int자리에는 int, String, lovg 등이 올 수 있다.
		int num =10; //특정 메소드 안에 선언하는건 변수
		return num; // num 변수가 가진 값을 리턴해준다
	}
	
	String stringMethod() {
		String va1 = "리턴값";
		return va1;
	}
	// 매개변수가 있는 메소드
	int numberMethod2(int num1) { //his method must return a result of type int  오류는 반드시 리턴문이 있어야한다. 라는 문구
		int num2 = 10;
		int sum = num1 + num2;
		return sum ;
		
	}
	
}

	