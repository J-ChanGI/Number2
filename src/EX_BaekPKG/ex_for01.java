package EX_BaekPKG;

import java.util.*;

public class ex_for01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=i; j<=i; j++) {
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				int sum = num1+num2;
				System.out.println("Case #" + i + ":" + sum);
			
			}
		}  
		
	}

}
