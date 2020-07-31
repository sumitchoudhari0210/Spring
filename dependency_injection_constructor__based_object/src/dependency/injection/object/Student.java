package dependency.injection.object;

public class Student {

	private int rollno;

	private String name;

	private Address addr;

	public Student(int rollno, String name, Address addr) {
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
