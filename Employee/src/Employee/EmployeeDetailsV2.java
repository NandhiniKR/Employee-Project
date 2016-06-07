package Employee;

public class EmployeeDetailsV2 {

	public static void main(String[] args) {
		Employee empObj = new Employee();
		empObj.setEno(143);
		empObj.setEname("Aman");
		empObj.setSalary(8000);
		empObj.GenPayStub();
		
		Employee empObj1 = new Employee();
		empObj1.setEno(1432);
		empObj1.setEname("Nandhini");
		empObj1.setSalary(8000);
		empObj1.GenPayStub();
		System.out.println(empObj.getEname()+" is my Love");
	}


}
