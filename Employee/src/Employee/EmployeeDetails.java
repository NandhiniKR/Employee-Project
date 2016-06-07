package Employee;

public class EmployeeDetails{

	public static void main(String[] args) {
	EmployeeDetailsWithoutGetandSet empObj = new EmployeeDetailsWithoutGetandSet();
	empObj.eno= 143;
	empObj.ename= "Aman";
	empObj.salary= 8000;
	empObj.GenPayStub();
	
	EmployeeDetailsWithoutGetandSet empObj1 = new EmployeeDetailsWithoutGetandSet();
	empObj1.eno= 1432;
	empObj1.ename= "Nandhini";
	empObj1.salary= 8000;
	empObj1.GenPayStub();

	}

}
