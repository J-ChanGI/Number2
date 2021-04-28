package Day21_04_20_pkg;

public class member {
	
	private String id;
	private	String passward;
	private	String name;
	private String aNumber;
	
	member(){
		
	}
	
	public member(String id, String passward, String name, String aNumber) {
		super();
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.aNumber = aNumber;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getaNumber() {
		return aNumber;
	}
	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}
	@Override
	public String toString() {
		return "member [id=" + id + ", passward=" + passward + ", name=" + name + ","
				+ " aNumber=" + aNumber + "]";
	}
	
	
	
	
	
}

	