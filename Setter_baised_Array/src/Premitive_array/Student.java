package Premitive_array;

public class Student {
	private  int rollno;
	private String name;
	private String[] addr;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getAddr() {
		return addr;
	}
	public void setAddr(String[] addr) {
		this.addr = addr;
	}
	public void showAddress(){
		for (String string : addr) {
			System.out.println(string);
			
		}
	}
	

}