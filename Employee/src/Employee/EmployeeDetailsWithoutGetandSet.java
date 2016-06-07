package Employee;

public class EmployeeDetailsWithoutGetandSet {
	int eno;
String ename;
	 int salary;
	 public EmployeeDetailsWithoutGetandSet(){
		 System.out.println("Constructor");
	 }
	 public void GenPayStub(){
			System.out.println("Eno: "+eno+"  Ename: "+ename+"  PAY: "+ (salary*1.2));
		}
	
}
