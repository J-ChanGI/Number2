package Day11_Studen_pkg;

public class Member {
	
	String id;
	int passward;
	String name;
	int age;
	
	Member(){
		
	}
	
	Member(String id, int passward, String name, int age){
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.age = age;
		
		
	}
	
	void info() {
		System.out.println(this.id);
		System.out.println(this.passward);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	void update(String rename) {
		System.out.println("수정");	
		
	}
	String myName() {
		String var1 = "김세모";
		return var1;
	}
	
}
