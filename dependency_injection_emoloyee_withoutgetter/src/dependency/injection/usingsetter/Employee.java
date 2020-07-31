package dependency.injection.usingsetter;

public class Employee {

	
	private int empid;
	
	private String empname;
	
	private String mobno;
	
	private String empaddress;

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	
	public void display() {
		
		System.out.println(empid+" "+empname+" "+mobno+" "+empaddress);
	}
}
