package dependency.injection.primitivetype;

public class Student {
	
	private int rollno;
	
	private String name;
	
	private String addr;

	public Student(int rollno, String name, String addr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}

	@Override
	public String toString() {
		
		return "rollno-"+rollno+",name-"+name+",address-"+addr+"";
	}
	

}
