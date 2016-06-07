package Employee;

public class Employee {
	private int eno;
	private String ename;
	private int salary;
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
		//System.out.println("Hey");
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void GenPayStub(){
		System.out.println("Eno: "+eno+"  Ename: "+ename+"  PAY: "+ (salary*1.2));
	}

}
