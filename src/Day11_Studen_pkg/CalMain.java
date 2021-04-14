package Day11_Studen_pkg;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal cal1 = new Cal();
		
		cal1.num1=10;
		cal1.num2=20;
		cal1.sum1(10,20);
		
		
		
		
		// 리턴 있는 메소드 호출 
		int sum3 = cal1.sum2(10,20);
		System.out.println(sum3);
		// 리턴이 있을 경우 따로 변수를 주어 print 로 출력을 해줘야한다.
		
		
//		
//		클래스 활용 문제
//
//		cal , cal main 클래스 선언
//
//		cal 클래스
//		  num1, num2 피드를 가지고 있음
//		  sum1 메소드
//			정수형 매개변수 2개 가지고 있음
//			리턴은 없으며, 실험내용 2개 매개변수의 합을 출력
//		  sum2 메소드
//			정수형 매개변수를 2개 가지고 있음
//			정수형 값을 리턴
//		CalMain 클래스에서 Cal 클래스 객체를 만들어서 sum1, sum2 메소드를 각각호출하여 
//		10+20 결과를 출력
		
		
		
		
	}

}
