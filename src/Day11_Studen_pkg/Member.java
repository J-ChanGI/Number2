package Day11_Studen_pkg;

public class Member {

	int age;
	String name;
	String id;
	String passward;
	
	Member(){
		
	}
	Member(int age, String name, String id, String passward){
			this.age= age;
			this.name = name;
			this.id = id;
			this.passward = passward;
	}
	void info() {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.passward);
	}
	void update(String rename) {
		System.out.println("수정");	
		
	}
	String myName() {
		String var1 = "김세모";
		return var1;
	}
}
