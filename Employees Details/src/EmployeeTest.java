public class EmployeeTest {
	public static void main(String []args){
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		empOne.empAge(26);
		empOne.empDesignation("Software Eng");
		empOne.empSalary(1000);
		empOne.printEmployee();
		empTwo.empAge(21);
		empTwo.empDesignation("Sofware Eng");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
}
