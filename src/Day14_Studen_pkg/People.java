package Day14_Studen_pkg;

public class People {

	private String name;
	private String rNumber;
	private String address;
	private int age;
	
	People(){
		
	}
	public People(String name, String rNumber, String address, int age) {
		// 부모클래스가 가지고 있는 생성자를 호출
		super();
		this.name = name;
		this.rNumber = rNumber;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getrNumber() {
		return rNumber;
	}
	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", "
				+ "rNumber=" + rNumber + ","
				+ " address=" + address + ""
				+ ", age=" + age + "]";
	}

	}

