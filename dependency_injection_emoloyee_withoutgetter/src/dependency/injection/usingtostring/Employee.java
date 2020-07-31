package dependency.injection.usingtostring;

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
	
	@Override
	public String toString() {

		return "id-"+empid+" ,name-"+empname+",mobno- "+mobno+",address- "+empaddress+"";
	}
}
